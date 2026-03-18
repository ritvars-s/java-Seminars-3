package service;
import java.util.ArrayList;

import model.Enums.PostType;
import model.users.GuestUser;
import model.users.PrivateUser;
public class MainService {
	private static ArrayList<GuestUser> allUsers = new ArrayList<GuestUser>();
	
	public static void main(String[] args) {
		GuestUser u1 = new GuestUser();
		allUsers.add(u1);
		
		PrivateUser u2 = new PrivateUser();
		allUsers.add(u2);
		u2.createAndPublishPost("SveiciensJAva nodarbiba", PostType.publicType);
		u2.createAndPublishPost("Sveiciens", PostType.privateType);
		PrivateUser u3 = new PrivateUser("Jariks", "parole");
		allUsers.add(u3);
		System.out.println(allUsers);
		
	}
}
