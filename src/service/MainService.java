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
		
		PrivateUser u3 = new PrivateUser("Jariks", "parole");
		allUsers.add(u3);
		System.out.println(allUsers);
		try
		{
		if(u3.login("Jariks", "parole")){
			u3.createAndPublishPost("SveiciensJAva nodarbiba", PostType.publicType);
			u3.createAndPublishPost("Sveiciens", PostType.privateType);
			System.out.println("-------------------------");
			u3.followPrivateUser(u2);
			//System.out.println()
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static ArrayList<GuestUser> getAllUsers() {
		return allUsers;
	}

	public static void setAllUsers(ArrayList<GuestUser> allUsers) {
		MainService.allUsers = allUsers;
	}
}
