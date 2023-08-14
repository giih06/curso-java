package com.giovanna.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	// exceção para lançar quando o id não for encontrado
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
}