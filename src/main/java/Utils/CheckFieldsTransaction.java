package Utils;

import java.util.Objects;

public class CheckFieldsTransaction {

    private final String mtiCompra = "0200";
    private final String mtiConsulta = "0900";
    private final String mtiConsulta2 = "0900";
    private final String mtiCancelamento ="0400";
    private final String mtiDesfazimento ="0420";
    private final String mtiAvisoCompra ="0220";
    private final String mtiEchoTest ="0800";
    private final String compra ="00";
    private final String saque ="01";
    private final String cancelamentoCompra ="20";
    private final String consultaSaldo ="30";
    private final String moneySand ="28";

    public boolean chekPanLength(String pan){
        if(Objects.isNull(pan) || pan.isEmpty()){
            return false;
        }
        return pan.length() >19;
    }

    public  boolean checkMTI( String mti){
        return mtiCompra.equalsIgnoreCase(mti) || mtiConsulta.equalsIgnoreCase(mti) || mtiConsulta2.equalsIgnoreCase(mti)
                || mtiCancelamento.equalsIgnoreCase(mti) || mtiDesfazimento.equalsIgnoreCase(mti) || mtiAvisoCompra.equalsIgnoreCase(mti)
                || mtiEchoTest.equalsIgnoreCase(mti);
    }

    public boolean checkProcessingCode(String processingCode){
        String processingCodeSubField = processingCode.substring(1,2);
        return (processingCodeSubField.equalsIgnoreCase(compra) || processingCodeSubField.equalsIgnoreCase(saque) || processingCodeSubField.equalsIgnoreCase(cancelamentoCompra)
                || processingCodeSubField.equalsIgnoreCase(consultaSaldo) || processingCodeSubField.equalsIgnoreCase(moneySand))
                && processingCode.length() == 6;
    }

    public boolean checkTransactionValue( String value){
        return value.length() == 12;
    }

    public boolean checkDateHourGMT(String dateHourGMT){
        return dateHourGMT.length() == 10;
    }

    public boolean checkNsu(String nsu){
        return nsu.length() == 6;
    }

    public boolean checkHour( String hour){
        return hour.length() ==6;
    }

    public boolean checkDate(String date){
        return date.length() ==4;
    }

    public boolean checkNetworkCode(String networkCode){
        return networkCode.length() ==11;
    }

    public boolean checkTerminal(String terminal){
        return terminal.length() == 8;
    }

    public boolean checkEstablishmentName(String establishmentName){
        return establishmentName.length() ==40;
    }

    public boolean checkCurrencyCode(String currencyCode){
        return currencyCode.length() == 3;
    }

    public boolean checkExternalCode(String externalCode){
        return externalCode.length() == 3;
    }

    public boolean checkCashOutRate(String cashOutRate){
        return cashOutRate.length() == 10;
    }

    public boolean checkCashOutRateValue(String cashOutRateValue){
        return cashOutRateValue.length() == 10;
    }

    public boolean checkTime(String time){
        return time.length() == 5;
    }

    public boolean checkIOFCode(String iofCode){
        return iofCode.length() == 3;
    }

    public boolean checkIOFValue(String iofValue){
        return iofValue.length() == 12;
    }

}
