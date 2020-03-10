package com.pixogram.dao;

import java.util.List;

import com.pixogram.models.Content;

public interface ContentDao {
	
	boolean addContent(List<Content> content,int userId);
	List<Content> organizeImage(int userId,List<Content>content);
	List<Content> organizeVideo(int userId,List<Content>content);
	Content getContent(int contentId);
	boolean updateContent(int userId,Content content);


}
