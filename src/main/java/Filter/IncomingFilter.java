/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2019, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package Filter;

import Utils.CheckFieldsTransaction;
import org.jpos.iso.ISOChannel;
import org.jpos.iso.ISOFilter;
import org.jpos.iso.ISOMsg;
import org.jpos.util.LogEvent;

import java.util.Objects;

public  class IncomingFilter implements ISOFilter {

	@Override
	public ISOMsg filter( ISOChannel isoChannel,  ISOMsg message,  LogEvent evt) throws VetoException {
		CheckFieldsTransaction checkFields = new CheckFieldsTransaction();
	if(checkFields.checkMTI(message.getString(0))){
		if(!Objects.isNull(message.getComponent(2))){
			checkFields.chekPanLength(message.getString(2));
		}
		if(!Objects.isNull(message.getComponent(3))){
			checkFields.checkProcessingCode(message.getString(3));
		}
		if(!Objects.isNull(message.getComponent(4))){
			checkFields.checkTransactionValue(message.getString(4));
		}
		if(!Objects.isNull(message.getComponent(7))){
			checkFields.checkDateHourGMT(message.getString(7));
		}
		if(!Objects.isNull(message.getComponent(11))){
			checkFields.checkNsu(message.getString(11));
		}
		if(!Objects.isNull(message.getComponent(12))){
			checkFields.checkHour(message.getString(12));
		}
		if(!Objects.isNull(message.getComponent(13))){
			checkFields.checkDate(message.getString(13));
		}
		if(!Objects.isNull(message.getComponent(32))){
			checkFields.checkNetworkCode(message.getString(32));
		}
		if(!Objects.isNull(message.getComponent(41))){
			checkFields.checkTerminal(message.getString(41));
		}
		if(!Objects.isNull(message.getComponent(43))){
			checkFields.checkEstablishmentName(message.getString(43));
		}
		if(!Objects.isNull(message.getComponent(49))){
			checkFields.checkCurrencyCode(message.getString(49));
		}
		if(!Objects.isNull(message.getComponent(62))){
			checkFields.checkExternalCode(message.getString(62));
		}
		if(!Objects.isNull(message.getComponent(74))){
			checkFields.checkCashOutRate(message.getString(74));
		}
		if(!Objects.isNull(message.getComponent(75))){
			checkFields.checkCashOutRateValue(message.getString(75));
		}
		if(!Objects.isNull(message.getComponent(101))){
			checkFields.checkTime(message.getString(101));
		}
		if (!Objects.isNull(message.getComponent(102))){
			checkFields.checkIOFCode(message.getString(102));
		}
		if (!Objects.isNull(message.getComponent(103))){
			checkFields.checkIOFValue(message.getString(103));
		}

		}
		return message;
	}


}