/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2019, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package Model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ACCOUNT", schema = "DEBITO")
public class AccountEntity {

	@Id
	@Column(name = "ACOOUNT")
	private int account;
	
	@Column(name = "COOPERATIVE")
	private int cooperative;
	
	@Column(name = "ISSUER")
	private int issuer;
	
	@Column(name = "BALANCE_AVALIABLE")
	private int balanceAvaliable;
	
	@Column(name = "ACCOUNT_STATE")
	private int accountState;
	
	@Column(name = "DATE_STATE_ACCOUNT")
	private Date dateStateAccount;
	
	@Column(name = "NAME_CARRIER")
	private String nameCarrier;
	
	@Column(name = "ACCOUNT_TYPE")
	private int accountType;
	
	public int getAccount() {
		return account;
	}
	
	public void setAccount(final int account) {
		this.account = account;
	}
	
	public int getCooperative() {
		return cooperative;
	}
	
	public void setCooperative(final int cooperative) {
		this.cooperative = cooperative;
	}
	
	public int getIssuer() {
		return issuer;
	}
	
	public void setIssuer(final int issuer) {
		this.issuer = issuer;
	}
	
	public int getBalanceAvaliable() {
		return balanceAvaliable;
	}
	
	public void setBalanceAvaliable(final int balanceAvaliable) {
		this.balanceAvaliable = balanceAvaliable;
	}
	
	public int getAccountState() {
		return accountState;
	}
	
	public void setAccountState(final int accountState) {
		this.accountState = accountState;
	}
	
	public Date getDateStateAccount() {
		return dateStateAccount;
	}
	
	public void setDateStateAccount(final Date dateStateAccount) {
		this.dateStateAccount = dateStateAccount;
	}
	
	public String getNameCarrier() {
		return nameCarrier;
	}
	
	public void setNameCarrier(final String nameCarrier) {
		this.nameCarrier = nameCarrier;
	}
	
	public int getAccountType() {
		return accountType;
	}
	
	public void setAccountType(final int accountType) {
		this.accountType = accountType;
	}
}