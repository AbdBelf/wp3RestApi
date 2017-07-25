
package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TempOrder")
public class TempOrder {

	@Id
	@Column(name = "cid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;

	@Column(name = "qid")
	private String qid;

	@Column(name = "idetie")
	private String idetie;

	@Column(name = "article_code")
	private String article_code;

	@Column(name = "article_ref")
	private String article_ref;

	@Column(name = "code_plan")
	private String code_plan;

	@Column(name = "quantity")
	private String quantity;

	@Column(name = "dateDelivery")
	private String dateDelivery;

	@Column(name = "comment")
	private String comment;

	@Column(name = "version_num")
	private String version_num;

	@Column(name = "CDC_file")
	private String CDC_file;

	@Column(name = "CDC_Comm_file")
	private String CDC_Comm_file;

	@Column(name = "Method_file")
	private String Method_file;

	@Column(name = "Tools_file")
	private String Tools_file;

	@Column(name = "indexQuote")
	private String indexQuote;

	@Column(name = "designation")
	private String designation;

	@Column(name = "pack_file")
	private String pack_file;

	@Column(name = "consult_file")
	private String consult_file;

	@Column(name = "bom_file")
	private String bom_file;

	@Column(name = "cao_file")
	private String cao_file;

	@Column(name = "spec_file")
	private String spec_file;

	@Column(name = "plan1_file")
	private String plan1_file;

	@Column(name = "plan2_file")
	private String plan2_file;

	@Column(name = "plan3_file")
	private String plan3_file;

	@Column(name = "quote_type")
	private String quote_type;

	@Column(name = "quote_generated")
	private String quote_generated;

	@Column(name = "demand_SCoeff")
	private String demand_SCoeff;

	@Column(name = "demand_coeff")
	private String demand_coeff;

	@Column(name = "sentDate")
	private String sentDate;

	@Column(name = "demand_ref")
	private String demand_ref;

	@Column(name = "contact")
	private String contact;

	@Column(name = "customer_name")
	private String customer_name;

	@Column(name = "ocr_validation")
	private String ocr_validation;

	@Column(name = "quote_type_classifire")
	private String quote_type_classifire;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getIdetie() {
		return idetie;
	}

	public void setIdetie(String idetie) {
		this.idetie = idetie;
	}

	public String getArticle_code() {
		return article_code;
	}

	public void setArticle_code(String article_code) {
		this.article_code = article_code;
	}

	public String getArticle_ref() {
		return article_ref;
	}

	public void setArticle_ref(String article_ref) {
		this.article_ref = article_ref;
	}

	public String getCode_plan() {
		return code_plan;
	}

	public void setCode_plan(String code_plan) {
		this.code_plan = code_plan;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getVersion_num() {
		return version_num;
	}

	public void setVersion_num(String version_num) {
		this.version_num = version_num;
	}

	public String getCDC_file() {
		return CDC_file;
	}

	public void setCDC_file(String cDC_file) {
		CDC_file = cDC_file;
	}

	public String getCDC_Comm_file() {
		return CDC_Comm_file;
	}

	public void setCDC_Comm_file(String cDC_Comm_file) {
		CDC_Comm_file = cDC_Comm_file;
	}

	public String getMethod_file() {
		return Method_file;
	}

	public void setMethod_file(String method_file) {
		Method_file = method_file;
	}

	public String getTools_file() {
		return Tools_file;
	}

	public void setTools_file(String tools_file) {
		Tools_file = tools_file;
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

	public String getPack_file() {
		return pack_file;
	}

	public void setPack_file(String pack_file) {
		this.pack_file = pack_file;
	}

	public String getConsult_file() {
		return consult_file;
	}

	public void setConsult_file(String consult_file) {
		this.consult_file = consult_file;
	}

	public String getBom_file() {
		return bom_file;
	}

	public void setBom_file(String bom_file) {
		this.bom_file = bom_file;
	}

	public String getCao_file() {
		return cao_file;
	}

	public void setCao_file(String cao_file) {
		this.cao_file = cao_file;
	}

	public String getSpec_file() {
		return spec_file;
	}

	public void setSpec_file(String spec_file) {
		this.spec_file = spec_file;
	}

	public String getPlan1_file() {
		return plan1_file;
	}

	public void setPlan1_file(String plan1_file) {
		this.plan1_file = plan1_file;
	}

	public String getPlan2_file() {
		return plan2_file;
	}

	public void setPlan2_file(String plan2_file) {
		this.plan2_file = plan2_file;
	}

	public String getPlan3_file() {
		return plan3_file;
	}

	public void setPlan3_file(String plan3_file) {
		this.plan3_file = plan3_file;
	}

	public String getQuote_type() {
		return quote_type;
	}

	public void setQuote_type(String quote_type) {
		this.quote_type = quote_type;
	}

	public String getQuote_generated() {
		return quote_generated;
	}

	public void setQuote_generated(String quote_generated) {
		this.quote_generated = quote_generated;
	}

	public String getDemand_SCoeff() {
		return demand_SCoeff;
	}

	public void setDemand_SCoeff(String demand_SCoeff) {
		this.demand_SCoeff = demand_SCoeff;
	}

	public String getDemand_coeff() {
		return demand_coeff;
	}

	public void setDemand_coeff(String demand_coeff) {
		this.demand_coeff = demand_coeff;
	}

	public String getSentDate() {
		return sentDate;
	}

	public void setSentDate(String sentDate) {
		this.sentDate = sentDate;
	}

	public String getDemand_ref() {
		return demand_ref;
	}

	public void setDemand_ref(String demand_ref) {
		this.demand_ref = demand_ref;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getOcr_validation() {
		return ocr_validation;
	}

	public void setOcr_validation(String ocr_validation) {
		this.ocr_validation = ocr_validation;
	}

	public String getQuote_type_classifire() {
		return quote_type_classifire;
	}

	public void setQuote_type_classifire(String quote_type_classifire) {
		this.quote_type_classifire = quote_type_classifire;
	}

}
