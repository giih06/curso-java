package model.exceptions;

public class DomainException extends RuntimeException{
    private static final long serialVersionUID = 1L; // declarando a versão de uma classe serializable

    public DomainException(String msg) {
        super(msg);
    }
    
}
