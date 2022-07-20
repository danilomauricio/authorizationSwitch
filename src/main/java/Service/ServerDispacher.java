/*
 * CABAL BRASIL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * Copyright (c) 2019, Cabal Brasil and/or its affiliates. All rights reserved.
 */
package Service;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.transaction.Context;

public class ServerDispacher implements ISORequestListener {
	
	@Override
	public boolean process(final ISOSource isoSource, final ISOMsg isoMsg) {
		Context context = new Context();
		context.put("INCOMING_MESSAGE", isoMsg);
		context.put("SOURCE", isoSource);
		
		Space space = SpaceFactory.getSpace();
		space.out("MAIN.QUEUE", context);
		
		return true;
	}
}