package Service;

import org.jpos.transaction.Context;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ComunicaAutorizador {

    public String comunicaAtuorizador(Context ctx) {

        try {
            Socket serv = new Socket("localhost", 2673);
            StringBuilder builder = new StringBuilder();
            BufferedOutputStream send = new BufferedOutputStream(serv.getOutputStream());
            String mensagemEntrada =ctx.get("ISO_CONDUCTOR_SEND");
            System.out.println("Mensagem Entrada: " + mensagemEntrada);
            send.write(mensagemEntrada.getBytes());
            System.out.println("mensagem de retorno" + send.toString());
            send.close();
            serv.close();
            return send.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {

        }
        return null;
    }
}
