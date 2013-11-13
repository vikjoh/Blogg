package blog;

//made by Viktor Johannisson

public class Post {
	public String title;
	public String text;
	public String date;
	public Author author = new Author();
	public Category category = new Category();

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
		return title + text + date + author.getAuthor() + category.getCategory();
	}
}
