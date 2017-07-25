package com.dao;

import java.util.List;

import com.entity.QuoteArticle;
import com.entity.TempOrder;

public interface TempOrderDAO {
	public List<TempOrder> listTempOrder();

	public TempOrder quote2Order(QuoteArticle quoteArticle);
	
	public TempOrder addOrderDetails(TempOrder order);
	
}