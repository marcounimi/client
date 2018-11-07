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
            risultatoMinuto = "cfgeaibhjaibhjdkl";
            return risultatoMinuto;
        }
        else if(minuto == 2){
            risultatoMinuto = "hfbecliaecliadgjk";
            return risultatoMinuto;
        }
        else if(minuto == 3){
            risultatoMinuto = "glicdbefjahkfjahk";
            return risultatoMinuto;
        }
        else if(minuto == 4){
            risultatoMinuto = "gedbfkahifkahijlc";
            return risultatoMinuto;
        }
        else if(minuto == 5){
            risultatoMinuto = "ehlijkabijkabgdcf";
            return risultatoMinuto;
        }
        else if(minuto == 6){
            risultatoMinuto = "ejhbejhbigafcdkl";
            return risultatoMinuto;
        }
        else if(minuto == 7){
            risultatoMinuto = "fegbcdhkaijhkaijl";
            return risultatoMinuto;
        }
        else if(minuto == 8){
            risultatoMinuto = "cdfghijakhijakleb";
            return risultatoMinuto;
        }
        else if(minuto == 9){
            risultatoMinuto = "icdkcdkbejafghl";
            return risultatoMinuto;
        }
        else if(minuto == 0){
            risultatoMinuto = "jgkdciedcieabhfl";
            return risultatoMinuto;
        }
        else{
            risultatoMinuto ="ighbjcklecklefadc";
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
