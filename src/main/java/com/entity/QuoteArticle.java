package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Quote_Article")
public class QuoteArticle {

	@Id
	@Column(name = "aid")
	private Integer aid;

	@Column(name = "demand_ref")
	private String demandRef;

	@Column(name = "article_ref")
	private String articleRef;

	@Column(name = "indexQuote")
	private String indexQuote;

	@Column(name = "designation")
	private String designation;

	@Column(name = "quantity")
	private String quantity;

	@Column(name = "dateDelivery")
	private String dateDelivery;

	@Column(name = "idetie")
	private String idetie;

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getDemandRef() {
		return demandRef;
	}

	public void setDemandRef(String demandRef) {
		this.demandRef = demandRef;
	}

	public String getArticleRef() {
		return articleRef;
	}

	public void setArticleRef(String articleRef) {
		this.articleRef = articleRef;
	}

	public String getIndexQuote() {
		return indexQuote;
	}

	public void setIndexQuote(String indexQuote) {
		this.indexQuote = indexQuote;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDateDelivery() {
		return dateDelivery;
	}

	public void setDateDelivery(String dateDelivery) {
		this.dateDelivery = dateDelivery;
	}

	public String getIdetie() {
		return idetie;
	}

	public void setIdetie(String idetie) {
		this.idetie = idetie;
	}

}
