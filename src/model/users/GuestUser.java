package model.users;

public class GuestUser {
	protected long id;
	
	private static long counter = 0;
	
	public long getID() {
		return id;
	}
	public void setID() {
		id = counter++;
	}
	
	public GuestUser(){
		setID();
	}
	
	public String toString() {
		String result = "ID:" + id;
		return result;
	}
	
}
