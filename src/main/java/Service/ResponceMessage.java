/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2019, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package Service;

import javassist.bytecode.stackmap.BasicBlock;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOSource;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.Pipe;
import java.util.Random;

public class ResponceMessage implements TransactionParticipant {
	
	@Override
	public int prepare(final long l, final Serializable serializable) {
		return PREPARED;
	}
	
	
	@Override
	public void commit(final long id, final Serializable context) {
		Context c = (Context) context;
		String numeroAutorizacao = String.valueOf(numeroAutorizacao());
		ISOMsg incomingMessage = c.get("INCOMING_MESSAGE");
		incomingMessage.set(0,"0110");
		incomingMessage.set(38, numeroAutorizacao);
		ISOSource isoSource1 = c.get("SOURCE");
		
		try{
			isoSource1.send(incomingMessage);
		} catch (ISOException | IOException e) {
			e.printStackTrace();
		}
	}
	
	private int numeroAutorizacao(){
		Random autId = new Random();
		return autId.nextInt(999999) ;
	}
}