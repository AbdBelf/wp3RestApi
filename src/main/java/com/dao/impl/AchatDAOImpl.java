package com.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.AchatDAO;
import com.entity.Achat;

@Transactional
public class AchatDAOImpl implements AchatDAO {

	@Qualifier(value = "sqlServerSessionFactory")
	private SessionFactory sqlServerSessionFactory;

	public void setSqlServerSessionFactory(SessionFactory sqlServerSessionFactory) {
		this.sqlServerSessionFactory = sqlServerSessionFactory;
	}


	@SuppressWarnings("unchecked")
	public List<Achat> listAchat() {
		Session session = this.sqlServerSessionFactory.getCurrentSession();

		List<Achat> list = session.createQuery("from Achat").list();

		return list;
	}

	@SuppressWarnings("unchecked")
	public List<Achat> listAchat(int limit) {
		Session session = this.sqlServerSessionFactory.getCurrentSession();

		List<Achat> list = session.createQuery("from Achat").setFirstResult(0).setMaxResults(limit).list();

		return list;
	}

}
