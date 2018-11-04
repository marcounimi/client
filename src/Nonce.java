import java.security.SecureRandom;
import java.util.Base64;
import java.util.Arrays;

public class Nonce {
    String RisultatoArrayInStringa;

    String VocabolarioStringa = "abcdefghilmnopqrstuvzABCDEFGHILMNOPQRSTUVZ"; //abcdefghijklmnopqrstuvwxyz
    char[] ArrayVocabolarioCarattere = VocabolarioStringa.toCharArray();

    /*
Rotore principale ha come input la stringa intera della password.
Deve creare un array con ogni lettera al suo interno
Ci deve essere un controllo esterno che identifichi i numeri(se ne trova salta quell'array)
Tutte le lettere vengono aumentate di posizione di 4 caratteri del Vocabolario.



*/
    String RotorePadre(String passkey) {
        char[] ArrayPasskey = passkey.toCharArray();

        //Inizializzo il nuovo array che dovrà contenere l'array finale con le lettere già cambiate
        char[] ArrayPasskeyRisultato = passkey.toCharArray();
        /*
        for(int x = 0; x <= passkey.length(); x++){
            ArrayPasskeyRisultato[x] = '-';
        }
        */



        for (int i = 0; i < passkey.length(); i++){
            int Spostamento = 4;
            for (int j = 0; j < VocabolarioStringa.length(); j++) {
                if (ArrayPasskey[i] == ArrayVocabolarioCarattere[j]) {
                ArrayPasskeyRisultato[i] = ArrayVocabolarioCarattere[j+Spostamento];

                }
                }
            }
            RisultatoArrayInStringa = Arrays.toString(ArrayPasskeyRisultato);
            return RisultatoArrayInStringa;
        }

    }