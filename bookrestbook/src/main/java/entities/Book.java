package entities;

public class Book {
	
	private int Id;
	private String Title;
	private String Author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, String author) {
		super();
		Id = id;
		Title = title;
		Author = author;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Title=" + Title + ", Author=" + Author + "]";
	}
	
	

}
