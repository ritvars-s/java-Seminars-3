package service;

import model.Post;
import model.Enums.PostType;

public interface IPostPublish {
	public abstract void createAndPublishPost(String newMsg, PostType newPostType);
		
}
