public class Controls {
    //controlli
    boolean LunghezzaCaratteri(String passkey){
        if(passkey == null){
            return false;
        }
        else if(passkey.length() <= 5){
            return false;
        }
        else if(passkey.length() > 15){
            return false;
        }
        else{
            return true;
        }
    }

    //Controllo caratteri speciali[BLACKLIST]
    boolean InserimentoSegni(String passkey){
        char[] charArray = passkey.toCharArray();       //converto la stringa passkey in array
        String stringaCaratteriSpeciali = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~èòàù";
        char[] arrayCaratteriSpeciali = stringaCaratteriSpeciali.toCharArray();
        for(int i = 0; i < passkey.length(); i++){
            for(int j = 0; j < stringaCaratteriSpeciali.length(); j++) {
                if (charArray[i] == arrayCaratteriSpeciali[j]) {
                    return false;
                }

            }
        }
        return true;
    }

    //Controllo Se all'interno della stringa ci sono caratteri
    boolean ControlloSeCiSonoCaratteri(String passkey){
        String Caratteri = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char[] charCaratteri = Caratteri.toCharArray();
        char[] charPasskey = passkey.toCharArray();
        for(int i = 0 ; i < passkey.length(); i++){
            for(int j = 0; j < Caratteri.length(); j++){
                if(charPasskey[i] == charCaratteri[j]){
                    return true;
                }
            }
        }
        return false;
    }



    //Controllo Se all'interno della stringa ci sono numeri
    boolean ControlloSeCiSonoNumeri(String passkey){
        String numeri = "1234567890";
        char[] intNumeri = numeri.toCharArray();
        char[] charPasskey = passkey.toCharArray();
        for(int i = 0 ; i < passkey.length(); i++){
            for(int j = 0; j < numeri.length(); j++){
                if(charPasskey[i] == intNumeri[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //ritorno valore numero array delle posizione in cui ci sono i numeri
    int ControlloValoreNumeriArrayDeiNumeriIdentificati(String passkey){
        String numeri = "1234567890";
        int QuantitaNumericaAllinternoDiPasskey = 0;
        char[] intNumeri = numeri.toCharArray();
        char[] charPasskey = passkey.toCharArray();
        for(int i = 0 ; i < passkey.length(); i++){
            for(int j = 0; j < numeri.length(); j++){
                if(charPasskey[i] == intNumeri[j]){
                    QuantitaNumericaAllinternoDiPasskey++;  //quanti numeri ci sono all'interno dell'array passkey
                    return i;
                }

            }
        }
        return 0;

    }

    //regole passkey
    void RegolaPasskey(){
        System.out.println("<=====Deve contenere minimo 5 caratteri/numeri=====>");
        System.out.println("<=====Non deve superare i 15 caratteri/numeri =====>");
        System.out.println("<=====Non bisogna inserire segni              =====>");
    }
//  da testare perchè potrebbe non essere eseguita quando c'è un errore in timestamp
    void ErroreTimestamp(){
        System.out.println("Errore sulla classe Timestamp");
    }

}
