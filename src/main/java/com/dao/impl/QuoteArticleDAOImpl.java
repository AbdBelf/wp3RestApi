package com.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.QuoteArticleDAO;
import com.entity.QuoteArticle;

@Transactional
public class QuoteArticleDAOImpl implements QuoteArticleDAO {

	@Qualifier(value = "mySecondSessionFactory")
	private SessionFactory mySecondSessionFactory;

	public void setMySecondSessionFactory(SessionFactory mySecondSessionFactory) {
		this.mySecondSessionFactory = mySecondSessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<QuoteArticle> listQuoteArticle() {
		Session session = this.mySecondSessionFactory.getCurrentSession();

		List<QuoteArticle> list = session.createQuery("from QuoteArticle").list();

		return list;
	}

}
