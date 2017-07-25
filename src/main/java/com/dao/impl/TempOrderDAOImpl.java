package com.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.TempOrderDAO;
import com.entity.QuoteArticle;
import com.entity.TempOrder;

@Transactional
public class TempOrderDAOImpl implements TempOrderDAO {

	@Qualifier(value = "mySecondSessionFactory")
	private SessionFactory mySecondSessionFactory;

	public void setMySecondSessionFactory(SessionFactory mySecondSessionFactory) {
		this.mySecondSessionFactory = mySecondSessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<TempOrder> listTempOrder() {
		Session session = this.mySecondSessionFactory.getCurrentSession();

		List<TempOrder> list = session.createQuery("from TempOrder").list();

		return list;
	}

	@Override
	public TempOrder addOrderDetails(TempOrder order) {
		Session session = this.mySecondSessionFactory.getCurrentSession();
		session.update(order);
		session.flush();
		return order;
	}

	@Override
	public TempOrder quote2Order(QuoteArticle quoteArticle) {
		TempOrder order = new TempOrder();
		//order.setCid(quoteArticle.getAid());
		order.setDemand_ref(quoteArticle.getArticleRef());
		order.setArticle_ref(quoteArticle.getArticleRef());
		order.setDemand_ref(quoteArticle.getDemandRef());
		order.setDesignation(quoteArticle.getDesignation());
		order.setQuantity(quoteArticle.getQuantity());
		order.setDateDelivery(quoteArticle.getDateDelivery());
		order.setIndexQuote(quoteArticle.getIndexQuote());

		Session session = this.mySecondSessionFactory.getCurrentSession();
		
		session.persist(order);
		//session.flush();
		
		return order;
	}

}
