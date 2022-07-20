/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2019, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package Service;

import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.DataOutputStream;
import java.io.Serializable;
import java.net.Socket;

public class QueryHost implements TransactionParticipant
{

//	@Override
//	public int prepare(final long id, final Serializable context)
//	{
//		try
//		{
//			Context ctx = (Context) context;
//			final MUX mux = NameRegistrar.get("mux.mux-odin");
//
//			final ISOMsg response = mux.request(ctx.get("ISO_CONDUCTOR_SEND"), 10000);
//
//			ctx.put("ISO_CONDUCTOR_RECIV", response);
//
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//
//		return PREPARED;
//	}


	public int prepare(final long id, final Serializable context){

		Context ctx = (Context) context;
		ComunicaAutorizador comunicaAutorizador = new ComunicaAutorizador();

		String response = comunicaAutorizador.comunicaAtuorizador(ctx);

		if(response != null){
			System.out.println("Resposta PRivate Lable: "+ response);
			return PREPARED;
		}
		return PREPARED;
	}

}
