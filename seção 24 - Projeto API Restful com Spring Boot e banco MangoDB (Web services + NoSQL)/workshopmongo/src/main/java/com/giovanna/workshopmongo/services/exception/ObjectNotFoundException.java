package com.giovanna.workshopmongo.services.exception;
// exeção personalizada para ser disparada quando for tentado a busca de um usuário pelo id fornecendo um id inexistente
public class ObjectNotFoundException extends RuntimeException{
    
    public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
