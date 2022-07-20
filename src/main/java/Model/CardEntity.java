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
@Table(name = "CARDS", schema = "DEBITO")
public class CardEntity {
	
	@Id
	@Column(name = "CARDS")
	private String card;
	
	@Column(name = "ACCOUNT")
	private Long account;
	/*
		@Column(name = "BALANCE_AVALIABLE")
		private double balanceAvaliable;
		
		@Column(name = "PASSWORD")
		private String password;
		
		@Column(name = "DOCUMENT")
		private Number document;
		
		@Column(name = "ISSUER")
		private Integer issuer;
		
		@Column(name = "COOPERATIVE")
		private Integer cooperative;
		
		@Column(name = "CARD_STATE")
		private Integer cardState;
		
	//	@Column(name = "DATE_STATE_CARD")
	//	private Date dateStateCard;
		*/
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
/*
	public double getBalanceAvaliable() {
		return balanceAvaliable;
	}
	
	public void setBalanceAvaliable(final double balanceAvaliable) {
		this.balanceAvaliable = balanceAvaliable;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(final String password) {
		this.password = password;
	}
	
	public Number getDocument() {
		return document;
	}
	
	public void setDocument(final Number document) {
		this.document = document;
	}
	
	public Integer getIssuer() {
		return issuer;
	}
	
	public void setIssuer(final Integer issuer) {
		this.issuer = issuer;
	}
	
	public Integer getCooperative() {
		return cooperative;
	}
	
	public void setCooperative(final Integer cooperative) {
		this.cooperative = cooperative;
	}
	
	public Integer getCardState() {
		return cardState;
	}
	
	public void setCardState(final Integer cardState) {
		this.cardState = cardState;
	}
	
//	public Date getDateStateCard() {
//		return dateStateCard;
//	}
	
//	public void setDateStateCard(final Date dateStateCard) {
//		this.dateStateCard = dateStateCard;
//	}*/
}