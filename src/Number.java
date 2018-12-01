class Number extends Timestamp {

//abcdefghijkl  mnopqrstuv  wxyzABCDEF  GHIJKLMNOP  QRSTUVWXYZ
     private String risultatoMinuto;
     private String risultatoOra;
     private String risultatoGiorno;
     private String risultatoMese;
     private String risultatoAnno;


    private String VocabolarioMinuto(){
        int minuto = CalcoloMinuto()%10;
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
    private String VocabolarioOra(){
        int ora = CalcoloOra();
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
    private String VocabolarioGiorno(){
        int giorno = CalcoloGiorno();
        if(giorno%2 == 0){
            risultatoGiorno = "wyDEzABxCF";
            return risultatoGiorno;
        }
        else{
            risultatoGiorno = "wxEyzABCDF";
            return risultatoGiorno;

        }
    }

    private String VocabolarioMese(){
        int mese = CalcoloMese();
        if(mese%2 == 0){
            risultatoMese = "GMNHIJKLOP";
            return risultatoMese;
        }
        else{
            risultatoMese = "GHKLMNOPIJ";
            return risultatoMese;
        }

    }

    private String VocabolarioAnno(){
        int anno = CalcoloAnno();
        if(anno%10 == 8){
            risultatoAnno = "QYRSTUVWXZ";
            return risultatoAnno;

        }else{
            risultatoAnno = "TUVWXYZQRS";
            return risultatoAnno;

        }


    }

    String VocabolarioTotale(){
        String Risultato = VocabolarioMinuto() + VocabolarioMese() + VocabolarioAnno() + VocabolarioOra() + VocabolarioMinuto()+ VocabolarioGiorno() + VocabolarioMinuto() +VocabolarioMese() + VocabolarioAnno();
        return Risultato;
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

