package Util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class IsoUtil {

        public  TreeMap<String, String> deserializar(String mensagem) {

            TreeMap<String, String> resultado = new TreeMap<>();

            int fimDoHeader = mensagem.indexOf("[*]") + 3;

            String[] cabecalho = mensagem.substring(0, fimDoHeader).split("[|]");

           // resultado.put(SerializadorEnum.IP_ATF.name(), cabecalho[1]);
            //resultado.put(SerializadorEnum.MTI.name(), cabecalho[3]);
            //resultado.put(SerializadorEnum.EMISSOR.name(), cabecalho[2]);

            String[] bits = mensagem.substring(fimDoHeader, mensagem.length()).split("[|]");
            for (int i = 0; i < bits.length - 1; i += 2) {
                resultado.put(bits[i], bits[i + 1]);
            }

            return resultado;
        }

        public  String serializar(String ip, TreeMap<String, String> bits) {

        //    bits.remove(SerializadorEnum.IP_ATF.name());
         //   bits.remove(SerializadorEnum.UUID_TRANSACAO.name());

            String mensagem = "15/07/2022 11:58:29:4089|10.19.21.169|073|0200|Conductor||8|[*]";

            bits.entrySet().removeIf(bit -> bit.getValue() == null);

            mensagem += bits.entrySet().parallelStream().map(entry -> entry.getKey() + "|" + entry.getValue()).collect(Collectors.joining("|")) + "|";

            int tamamanhoDaMensagem = mensagem.length()  ;

            return "0" + tamamanhoDaMensagem +  mensagem;
        }

        public String implantarTamanhoTag(String entryKey){

            if(entryKey.length()<3) {
                String valor = String.format("%03d", Integer.parseInt(entryKey));
                return valor;
            }
            return entryKey;
        }
}
