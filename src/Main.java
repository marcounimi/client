import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;           //libreria per l'input


public class Main{

    public static void main(String[] args) {
        String RisultatoFinale;
        Timestamp valore = new Timestamp();
        Nonce Valore = new Nonce();
        Number val = new Number();

        //stampa Titolo iniziale
        Title.StampaIniziale();

        //Richiesta input
        System.out.println("Inserisci la tua Passkey : ");
        Scanner input = new Scanner(System.in);
        String passkey = input.nextLine();



        //controlli
        //----------------PRIMO----------------


            if (!Controls.LunghezzaCaratteri(passkey)) {
                System.out.println("Errore nell'inserimento della passkey");
                Controls.RegolaPasskey();
                return;  //eliminare per far vedere l'esecuzione totale
            }
            if (!Controls.InserimentoSegni(passkey)) {
                System.out.println("Hai inserito uno o più caratteri/segni vietati");

            } else {
                System.out.println("passkey inserita con successo");
            }

        //ECCEZIONE
        //verifica eccezione
        //boolean eccezioneUno = EccezioneData.ValiditaData(4, 50, 2000);

        boolean eccezioneUno = Controls.ValiditaData(valore.CalcoloGiorno(), valore.CalcoloMese(), valore.CalcoloAnno());
        if(!eccezioneUno){
            System.out.println("eccezione rilevata : Data");
        }

        //----------------GENERATORE VOCABOLARIO----
        /*
        Number VocabolarioMinuto = new Number();
        Timestamp Minuto = new Timestamp();
        VocabolarioMinuto.VocabolarioMinuto(Minuto.CalcoloMinuto());

        */


        //----Orario generazione


        System.out.println("Generato alle  = "+ valore.CalcoloOra() + ":"+ valore.CalcoloMinuto());
        System.out.println();

        //----------------test----------------
        /*
        for(int i = 0; i <= passkey.length(); i++) {
            char carattere = Valore.RotorePadre(passkey);
            System.out.println("Il carattere "+ i +" è : " + carattere);
        }
        */

        RisultatoFinale = Valore.RotorePadre(passkey);
        System.out.println("Alfabeto usato : " + Valore.VocabolarioStringa);
        //System.out.println("Risultato : " + RisultatoFinale);


        byte[] message = RisultatoFinale.getBytes(StandardCharsets.UTF_8);
        String encoded = Base64.getEncoder().encodeToString(message);

        char[] ArrayRisultato = encoded.toCharArray();
        System.out.println("risultato: [" + ArrayRisultato[val.CalcoloMinuto()%10] + "," + ArrayRisultato[(val.CalcoloMinuto()%10)+2]+","+ ArrayRisultato[(val.CalcoloMinuto()%10)+5]+","+ ArrayRisultato[(val.CalcoloMinuto()%10)+7]+","+ ArrayRisultato[(val.CalcoloMinuto()%10)+12]+","+ ArrayRisultato[(val.CalcoloMinuto()%10)+15]+","+ ArrayRisultato[(val.CalcoloMinuto()%10)+18]+"]");

    }
}