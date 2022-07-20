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
@Table(name = "EXTERNAL_CODE", schema = "DEBITO")
public class ExternalCodeEntity {
	
	@Id
	@Column(name = "EXTERNAL_CODE")
	private int externalCode;
	
	@Column(name = "TRANSACTION_SIGN")
	private int transactionSign;
	
	@Column(name = "LAUNCH_CODE")
	private String launchCode;
	
	@Column(name = "DESCRIPTION_EXTERNAL_CODE")
	private String descriptionExternalCode;
	
	public int getExternalCode() {
		return externalCode;
	}
	
	public void setExternalCode(final int externalCode) {
		this.externalCode = externalCode;
	}
	
	public int getTransactionSign() {
		return transactionSign;
	}
	
	public void setTransactionSign(final int transactionSign) {
		this.transactionSign = transactionSign;
	}
	
	public String getLaunchCode() {
		return launchCode;
	}
	
	public void setLaunchCode(final String launchCode) {
		this.launchCode = launchCode;
	}
	
	public String getDescriptionExternalCode() {
		return descriptionExternalCode;
	}
	
	public void setDescriptionExternalCode(final String descriptionExternalCode) {
		this.descriptionExternalCode = descriptionExternalCode;
	}
}