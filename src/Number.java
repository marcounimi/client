public class Number {

//abcdefghijkl  mnopqrstuv  wxyzABCDEF  GHIJKLMNOP  QRSTUVWXYZ
    Controls Errore = new Controls();
    String risultatoMinuto,risultatoOra, errore, risultatoGiorno, risultatoMese
    , risultatoAnno;

    Timestamp valore = new Timestamp();

    String VocabolarioMinuto(){
        int minuto = valore.CalcoloMinuto();
        minuto = minuto%10;
        if(minuto == 1){
            risultatoMinuto = "dghabcijefkl";
            return risultatoMinuto;
        }
        else if(minuto == 2){
            risultatoMinuto = "defbcijghakl";
            return risultatoMinuto;
        }
        else if(minuto == 3){
            risultatoMinuto = "abgicdefjhkl";
            return risultatoMinuto;
        }
        else if(minuto == 4){
            risultatoMinuto = "ijdefkaghlbc";
            return risultatoMinuto;
        }
        else if(minuto == 5){
            risultatoMinuto = "eabghidjcfkl";
            return risultatoMinuto;
        }
        else if(minuto == 6){
            risultatoMinuto = "abfgjhicdekl";
            return risultatoMinuto;
        }
        else if(minuto == 7){
            risultatoMinuto = "aefgkbchijdl";
            return risultatoMinuto;
        }
        else if(minuto == 8){
            risultatoMinuto = "akdcghijlefb";
            return risultatoMinuto;
        }
        else if(minuto == 9){
            risultatoMinuto = "ajcdkbefghil";
            return risultatoMinuto;
        }
        else if(minuto == 0){
            risultatoMinuto = "jkcdeabhifgl";
            return risultatoMinuto;
        }
        else{
            risultatoMinuto ="adijklefghbc";
            return risultatoMinuto;
        }



    }
    String VocabolarioOra(){
        int ora = valore.CalcoloOra();
        if(ora < 24 && ora > 0) {
            if (ora == 4) {
                risultatoOra = "mstnopqruv";
                return risultatoOra;
            } else if (ora == 8) {
                risultatoOra = "mnorstuvpq";
                return risultatoOra;
            } else if (ora == 12) {
                risultatoOra = "opqrstuvmn";
                return risultatoOra;
            } else if (ora == 16) {
                risultatoOra = "mntuopqrsv";
                return risultatoOra;
            } else if (ora == 20) {
                risultatoOra = "qrstuvmnop";
                return risultatoOra;
            } else {
                risultatoOra = "umnopqrstv";
                return risultatoOra;
            }
        }
        /* da controllare il funzionamento dell'errore
        else{
            errore = "errore in vocabolarioOra";
            Errore.ErroreTimestamp();
        }
        */
        return risultatoOra;
    }
    String VocabolarioGiorno(){
        int giorno = valore.CalcoloGiorno();
        if(giorno%2 == 0){
            risultatoGiorno = "wyDEzABxCF";
            return risultatoGiorno;
        }
        else{
            risultatoGiorno = "wxEyzABCDF";
            return risultatoGiorno;

        }
    }

    String VocabolarioMese(){
        int mese = valore.CalcoloMese();
        if(mese%2 == 0){
            risultatoMese = "GMNHIJKLOP";
            return risultatoMese;
        }
        else{
            risultatoMese = "GHKLMNOPIJ";
            return risultatoMese;
        }

    }

    String VocabolarioAnno(){
        int anno = valore.CalcoloAnno();
        if(anno%10 == 8){
            risultatoAnno = "QYRSTUVWXZ";
            return risultatoAnno;

        }else{
            risultatoAnno = "TUVWXYZQRS";
            return risultatoAnno;

        }


    }
/*
    void VocabolarioFinale(){
        VocabolarioCompleto = risultatoMinuto + risultatoOra + risultatoGiorno + risultatoMese + risultatoAnno;
    }
*/
// generazione vocabolario totale per l'inserimento in un variabile
/*    VocabolarioCompleto = "ci";
    return VocabolarioCompleto;
*/




}
