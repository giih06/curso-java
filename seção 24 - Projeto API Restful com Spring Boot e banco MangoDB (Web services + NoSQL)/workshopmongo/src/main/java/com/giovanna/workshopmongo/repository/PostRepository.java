package com.giovanna.workshopmongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.giovanna.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    // Consulta em formato de JSON  
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);

    // Consulta ignorando maiúsculas e minuúsculas
    List<Post> findByTitleContainingIgnoreCase(String text);

    // Consulta de comentário entre tempos
    @Query("{ $and: [ { date: {$gte: ?1} }, { date: { $lte: ?2} } , { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
	List<Post> fullSearch(String text, Date minDate, Date maxDate);
}