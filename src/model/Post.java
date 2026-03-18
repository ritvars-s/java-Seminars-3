package model;

import java.time.LocalDateTime;

public class Post {
	private String msg;
	private LocalDateTime dateTime = LocalDateTime.now();
	private int countOfLikes = 0;
	
	
	public String getMsg() {
		return msg;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public int getCountOfLikes() {
		return countOfLikes;
	}
	
	public void setMsg(String newMsg) {
		if((newMsg != null) && (!newMsg.isEmpty()) && (newMsg.length() < 1000)) {
			msg = newMsg;
		}
		else {
			msg = "Unknown post";
		}
	}
	public void setDateTime() {
		dateTime = LocalDateTime.now();
	}
	public void increaseCountOfLikes() {
		countOfLikes++;
	}
	Post(){
		setMsg("Sveiciens!");
	}
	Post(String newMsg){
		setMsg(newMsg);
	}
	
	public String toString() {
		String result = msg + " (" + dateTime + ") " + countOfLikes;
		return result;
	}
	
}
