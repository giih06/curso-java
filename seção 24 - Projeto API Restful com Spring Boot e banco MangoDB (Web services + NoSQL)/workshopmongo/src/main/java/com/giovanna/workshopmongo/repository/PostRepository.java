package com.giovanna.workshopmongo.repository;

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
}