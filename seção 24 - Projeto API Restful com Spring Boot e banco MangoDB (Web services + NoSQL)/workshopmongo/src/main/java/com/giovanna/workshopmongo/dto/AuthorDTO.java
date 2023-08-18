package com.giovanna.workshopmongo.dto;

import java.io.Serializable;

import com.giovanna.workshopmongo.domain.User;

public class AuthorDTO implements Serializable {

	// atributos básicos
	private String id;
	private String name;

	// cosntrutores
	public AuthorDTO() {
	}

	public AuthorDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	// getters e setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}