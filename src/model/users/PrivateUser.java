package model.users;
import java.util.ArrayList;
import model.Enums.PostType;
import model.Post;
public class PrivateUser extends RegisteredUser{

	private ArrayList<Post> allPrivatePosts = new ArrayList<Post>();
	private ArrayList<Post> allPublicPosts = new ArrayList<Post>();
	private ArrayList<RegisteredUser> allMyFollowers = new ArrayList<RegisteredUser>();
	
	public ArrayList<Post> getAllPrivatePosts(){
		return allPrivatePosts;
	}
	public ArrayList<Post> getAllPublicPosts(){
		return allPublicPosts;
	}
	public ArrayList<RegisteredUser> getAllMyFollowers(){
		return allMyFollowers;
	}
	
	public PrivateUser() {
		super();		
	}
	public PrivateUser(String newUsername, String newPassword) {
		super(newUsername, newPassword);
	}
	public String toString() {
		String result = super.toString() + "sludinajumi: \n ->" + allPrivatePosts + "\n ->" + allPublicPosts + "\n sekotaji \n -> " + allMyFollowers; 
		return result;
	}
	
	
	@Override
	public void createAndPublishPost(String newMsg, PostType newPostType) {
		// TODO Auto-generated method stub
		
	}
	
}
