package model.users;

import java.security.MessageDigest;

import service.IPostPublish;

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
			if(newPassword != null && !newPassword.isEmpty() && newPassword.matches("/^(?=.*?[A-Z])")) {
				
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
			String result = id + ": " +username + password;
			return result;
		}
}
