package model.users;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import service.IPostPublish;
import service.MainService;

public abstract class RegisteredUser extends GuestUser implements IPostPublish{

		private String username;
		private String password;
		
		
		
		public String getUsername() {
			return username;
		}
		public String getPassword() {
			return password;
		}
		
		public void setUsername(String newUsername) {
			if((newUsername == null) || (newUsername.isEmpty()) || newUsername.length() <= 30) {
				username = "DefaultUser";
			}
			else {
				username= newUsername;
			}
		}
		public void setPassword(String newPassword) {
			if(newPassword != null && !newPassword.isEmpty()) {
				
				try {
					MessageDigest md = MessageDigest.getInstance("MD5");
					md.update(newPassword.getBytes());
					password = md.digest().toString();
				}
				catch(Exception e){
					password = "0000";
				}
			}
			
			
		}
		public RegisteredUser(){
			super();
			setUsername("");
			setPassword("");
		}
		public RegisteredUser(String newUsername, String newPassword){
			super();
			setUsername(newUsername);
			setPassword(newPassword);
		}
		
		public String toString() {
			String result = id + ": " +username + " " + password;
			return result;
		}
		
		
		public boolean login(String newUsername, String newPassword) throws NoSuchAlgorithmException {
			for(GuestUser tempU : MainService.getAllUsers()) {
				if (tempU instanceof RegisteredUser){
					RegisteredUser tempRU = (RegisteredUser)tempU;
					
					MessageDigest md = MessageDigest.getInstance("MD5");
					md.update(newPassword.getBytes());
					String newPasswordEncoded = new String(md.digest());
					
					if(tempRU.getUsername() == newUsername && tempRU.getPassword() == newPasswordEncoded) {
						return true; 
					}
					
				}
			}
			return false;
		}
		
		
		
		
		
		
		
		
		
		
}
