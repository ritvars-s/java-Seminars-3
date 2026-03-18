package model.users;

import java.security.MessageDigest;

public class RegisteredUser extends GuestUser{

		private String username;
		private String title;
		private String password;
		
		
		
		public String getUsername() {
			return username;
		}
		public String getTitle() {
			return title;
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
		public void setTitle(String newTitle) {
			if((newTitle != null) && (!newTitle.isEmpty())) {
				title = newTitle;
			}
			else {
				title = "Title";
			}
		}
		public RegisteredUser(){
			super();
			setUsername("");
			setPassword("");
			setTitle("");
		}
		public RegisteredUser(String newUsername, String newTitle, String newPassword){
			super();
			setUsername(newUsername);
			setPassword(newTitle);
			setTitle(newPassword);
		}
		public String toString() {
			String result = username + title;
			return result;
		}
}
