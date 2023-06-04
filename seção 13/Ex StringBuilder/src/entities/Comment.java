package entities;

public class Comment {
    // atributos    
    private String text;

    // Construtores
    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }

    // Getters e setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
