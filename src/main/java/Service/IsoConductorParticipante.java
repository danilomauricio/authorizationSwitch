package Service;

import Util.IsoUtil;
import org.jpos.iso.ISOMsg;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.Serializable;
import java.util.TreeMap;


public class IsoConductorParticipante implements TransactionParticipant {


    @Override
    public int prepare(long id, Serializable context) {
        Context c = (Context )context;
        ISOMsg incomingMessage = c.get("INCOMING_MESSAGE");
        TreeMap<String, String> resultado = new TreeMap<>();
        IsoUtil isoUtil = new IsoUtil();
            for(int i=2; i < 128 ; i+=1){

                if(incomingMessage.getComponent(i) !=null){
                    String bits = "|00"+i +"|"+ incomingMessage.getString(i)+"|";
                    String tag =isoUtil.implantarTamanhoTag(String.valueOf(i));
                        resultado.put(tag, incomingMessage.getString(i));

                    System.out.println("Iso menssage :"+resultado);
                }
            }
        String isoConductor = isoUtil.serializar("10.10.10.10",resultado);
        System.out.println("IsoConductor: "+isoConductor);
        c.put("ISO_CONDUCTOR_SEND", isoConductor);
        return PREPARED;
    }
}
