package book;

import lombok.Data;

@Data 
public class Book { 
 public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}
private Integer id; 
 private String name; 
 private Double price; 
 private Author author; 
} 