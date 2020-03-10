package com.pixogram.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pixogram.models.Content;

@Component
public class ContentDaoImpl implements ContentDao {

	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public boolean addContent(List<Content> content, int userId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public List<Content> organizeImage(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<Content> organizeVideo(int userId, List<Content> content) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Content getContent(int contentId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean updateContent(int userId, Content content) {
		// TODO Auto-generated method stub
		return false;
	}

}
