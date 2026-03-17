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
			if((newUsername != null) && (!newUsername.isEmpty()) && newUsername.length() <= 30) {
				username = "DefaultUser";
			}
			else {
				username= newUsername;
			}
		}
		public void setPassword(String newPassword) {
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(newPassword.getBytes());
				password = md.digest().toString();
			}
			catch(Exception e){
				
			}
			
		}
}
