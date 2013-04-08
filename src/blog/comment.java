package blog;

public class comment {
	public String text;
	public String name;
	public String email;

	public String getComment() {
		return text + name + email;
	}
}
