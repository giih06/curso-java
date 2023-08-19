package com.giovanna.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.giovanna.workshopmongo.domain.Post;
import com.giovanna.workshopmongo.repository.PostRepository;
import com.giovanna.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

    // Encontra por id
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

    // Consulta String ignorando maiúsculas e minuúsculas
    public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}

    // Consulta de um comentário baseado no instante que foi publicada
    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
}