/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2019, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TRANSACTION_DEBIT", schema = "DEBITO")
public class TransactionDebit {
	
	@Id
	@Column(name = "CARD")
	private String card;
	
	@Column(name = "ACCOUNT")
	private Long account;
	
	@Column(name = "ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name = "ISSUER")
	private String issuer;
	
	@Column(name = "COOPERATIVE")
	private String cooperative;
	
	@Column(name = "PURCHASE_VALUE")
	private double purchaseValue;
	
	@Column(name = "BALANCE_AVALIABLE")
	private double balanceAvaliable;
	
	@Column(name = "DATE_STATE_CARD")
	private Date dateStateCard;
	
	@Column(name = "CARD_STATE")
	private String cardState;
	
	@Column(name = "DATE_STATE_ACCOUNT")
	private Date dateStateAccount;
	
	@Column(name = "ACCOUNT_STATE")
	private String accountState;
	
	@Column(name = "DOCUMENT")
	private String document;
	
	@Column(name = "EXTERNAL_CODE")
	private String externalCode;
	
	@Column(name = "PROCESSING_CODE")
	private String processingCode;
	
	@Column(name = "TRANSACTION_MESSAGE")
	private String TransactionMessage;
	
	@Column(name = "DATE_HOUR_GMT")
	private Date dateHourGMT;
	
	@Column(name = "AQUARIER_CODE")
	private String aquarierCode;
	
	@Column(name = "RESPONSE_CODE")
	private String responseCode;
	
	@Column(name = "DESCRIPTION_RESPONSE_CODE")
	private String descriptionResponseCode;
	
	public String getCard() {
		return card;
	}
	
	public void setCard(final String card) {
		this.card = card;
	}
	
	public Long getAccount() {
		return account;
	}
	
	public void setAccount(final Long account) {
		this.account = account;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(final String accountType) {
		this.accountType = accountType;
	}
	
	public String getIssuer() {
		return issuer;
	}
	
	public void setIssuer(final String issuer) {
		this.issuer = issuer;
	}
	
	public String getCooperative() {
		return cooperative;
	}
	
	public void setCooperative(final String cooperative) {
		this.cooperative = cooperative;
	}
	
	public double getPurchaseValue() {
		return purchaseValue;
	}
	
	public void setPurchaseValue(final double purchaseValue) {
		this.purchaseValue = purchaseValue;
	}
	
	public double getBalanceAvaliable() {
		return balanceAvaliable;
	}
	
	public void setBalanceAvaliable(final double balanceAvaliable) {
		this.balanceAvaliable = balanceAvaliable;
	}
	
	public Date getDateStateCard() {
		return dateStateCard;
	}
	
	public void setDateStateCard(final Date dateStateCard) {
		this.dateStateCard = dateStateCard;
	}
	
	public String getCardState() {
		return cardState;
	}
	
	public void setCardState(final String cardState) {
		this.cardState = cardState;
	}
	
	public Date getDateStateAccount() {
		return dateStateAccount;
	}
	
	public void setDateStateAccount(final Date dateStateAccount) {
		this.dateStateAccount = dateStateAccount;
	}
	
	public String getAccountState() {
		return accountState;
	}
	
	public void setAccountState(final String accountState) {
		this.accountState = accountState;
	}
	
	public String getDocument() {
		return document;
	}
	
	public void setDocument(final String document) {
		this.document = document;
	}
	
	public String getExternalCode() {
		return externalCode;
	}
	
	public void setExternalCode(final String externalCode) {
		this.externalCode = externalCode;
	}
	
	public String getProcessingCode() {
		return processingCode;
	}
	
	public void setProcessingCode(final String processingCode) {
		this.processingCode = processingCode;
	}
	
	public String getTransactionMessage() {
		return TransactionMessage;
	}
	
	public void setTransactionMessage(final String transactionMessage) {
		TransactionMessage = transactionMessage;
	}
	
	public Date getDateHourGMT() {
		return dateHourGMT;
	}
	
	public void setDateHourGMT(final Date dateHourGMT) {
		this.dateHourGMT = dateHourGMT;
	}
	
	public String getAquarierCode() {
		return aquarierCode;
	}
	
	public void setAquarierCode(final String aquarierCode) {
		this.aquarierCode = aquarierCode;
	}
	
	public String getResponseCode() {
		return responseCode;
	}
	
	public void setResponseCode(final String responseCode) {
		this.responseCode = responseCode;
	}
	
	public String getDescriptionResponseCode() {
		return descriptionResponseCode;
	}
	
	public void setDescriptionResponseCode(final String descriptionResponseCode) {
		this.descriptionResponseCode = descriptionResponseCode;
	}
}