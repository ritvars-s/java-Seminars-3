package model;
import java.util.ArrayList;
import model.users.GuestUser;
import model.users.RegisteredUser;

public class Page {
	private String title;
	private String description;
	private ArrayList<RegisteredUser> allPageFollowers = new ArrayList<RegisteredUser>();
	private ArrayList<Post> allPostsInPage = new ArrayList<Post>();
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}

	public ArrayList<RegisteredUser> getFollowersUsers() {
		return allPageFollowers;
	}

	public ArrayList<Post> getPostsInPage() {
		return allPostsInPage;
	}

	public void setTitle(String newTitle) {
		if(newTitle != null && !newTitle.isEmpty()) {
			title = newTitle;
		}
		else {
			title = "Title";
		}
	}
	public void setDescription(String newDescription) {
		if(newDescription != null && !newDescription.isEmpty()) {
			description = newDescription;
		}
		else {
			description = "Descrition is empty";
		}
	}
	
	public Page() {
		setTitle("Noklusejama lapa");
		setDescription("Lapa par neko");
	}
	public Page(String newTitle, String newDescription) {
		setTitle(newTitle);
		setDescription(newDescription);
	}
	
	public String toString() {
		String result = title + "\n " + description + " " + allPageFollowers + " \n " + allPostsInPage; 
		return result;
	}
	
	
}
