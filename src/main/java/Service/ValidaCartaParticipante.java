/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2019, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package Service;

import org.jpos.iso.ISOMsg;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.Serializable;
import java.util.Objects;

public class ValidaCartaParticipante implements TransactionParticipant {
	
	@Override
	public int prepare(final long l, final Serializable context) {
		
		Context c = (Context )context;
		ISOMsg incomingMessage = c.get("INCOMING_MESSAGE");
		String pan = incomingMessage.getString(2);
		
		if(chekPanLength(pan)){
			return ABORTED;
		}
		
		return PREPARED;
	}
	
	private boolean chekPanLength(String pan){
		if(Objects.isNull(pan) || pan.isEmpty()){
			return false;
		}
		return pan.length() >19;
	}
}