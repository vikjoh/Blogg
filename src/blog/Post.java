package blog;

//made by Viktor Johannisson

public class Post {
	public String title;
	public String text;
	public String date;
	private Author author = new Author();
	private Category category = new Category();

	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getPost() {
		return title + text + author.getAuthor() + category.getCategory();
	}
}
