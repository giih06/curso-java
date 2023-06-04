package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    // Atributos
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
    
    // lista
	private List<Comment> comments = new ArrayList<>();
    
    // Construtores
	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

    // getters e setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

    // adicionar e remover comentários
	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
    
    // tostring
	public String toString() {
		StringBuilder sb = new StringBuilder(); // usada para quando precisamos usar um string muito grande a partir de varios outros string. É mais fácil manipular os dados tambem com o string builder
        // .append significa acrescentar no final  
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
