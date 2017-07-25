package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.AchatDAO;
import com.dao.QuoteArticleDAO;
import com.dao.impl.TempOrderDAOImpl;
import com.entity.Achat;
import com.entity.QuoteArticle;
import com.entity.TempOrder;

@RestController
@RequestMapping("/rest")
public class APRController {

	@Autowired
	private AchatDAO achatDAO;

	@Autowired
	private QuoteArticleDAO quoteArticleDAO;

	@Autowired
	private TempOrderDAOImpl tempOrderDAO;

	@RequestMapping(value = "/listAchat", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Achat> getListAchat() {

		List<Achat> result = achatDAO.listAchat(100);

		return result;

	}

	@RequestMapping(value = "/listQuoteArticle", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<QuoteArticle> getListQuoteArticle() {

		List<QuoteArticle> result = quoteArticleDAO.listQuoteArticle();

		return result;

	}

	@RequestMapping(value = "/quote2Order", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody TempOrder addOrderDetails(@RequestBody QuoteArticle quoteArticle) {

		if (quoteArticle == null) {
			return null;
		}

		TempOrder order = tempOrderDAO.quote2Order(quoteArticle);

		return order;

	}

	@RequestMapping(value = "/addOrderDetails", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody TempOrder addOrderDetails(@RequestBody TempOrder order) {

		if (order == null) {
			return null;
		}

		TempOrder result = tempOrderDAO.addOrderDetails(order);

		return result;

	}

}