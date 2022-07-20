/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2019, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESPONSE_CODE", schema = "DEBITO")
public class ResponseCodeEntity {
	
	@Id
	@Column(name = "INTERNAL_RESPONSE_CODE")
	private String internalResponseCode;
	
	@Column(name = "EXTERNAL_RESPONSE_CODE")
	private String externalResponseCode;
	
	@Column(name = "DESCRIPTION_RESPONSE_CODE")
	private String descriptionResponseCode;
	
	@Column(name = "ACCOUNT_TYPE")
	private int accountType;
	
	public String getInternalResponseCode() {
		return internalResponseCode;
	}
	
	public void setInternalResponseCode(final String internalResponseCode) {
		this.internalResponseCode = internalResponseCode;
	}
	
	public String getExternalResponseCode() {
		return externalResponseCode;
	}
	
	public void setExternalResponseCode(final String externalResponseCode) {
		this.externalResponseCode = externalResponseCode;
	}
	
	public String getDescriptionResponseCode() {
		return descriptionResponseCode;
	}
	
	public void setDescriptionResponseCode(final String descriptionResponseCode) {
		this.descriptionResponseCode = descriptionResponseCode;
	}
	
	public int getAccountType() {
		return accountType;
	}
	
	public void setAccountType(final int accountType) {
		this.accountType = accountType;
	}
}