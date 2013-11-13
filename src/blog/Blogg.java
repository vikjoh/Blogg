package blog;
import java.util.ArrayList;
import java.util.List;


public class Blogg {
	public List <Post> items = new ArrayList<Post>();
	public List <Category> categories = new ArrayList<Category>();
	
	
	public void Print() {		
		for(int i=0; i < items.size(); i++) {
			System.out.println(items.get(i).getPost());
		}
		
	}
}
