import java.util.Scanner;           //libreria per l'input


public class Main {

    public static void main(String[] args) {
        //stampa Titolo iniziale
        String RisultatoFinale;
        Title StampaTitoloIniziale = new Title();
        StampaTitoloIniziale.StampaIniziale();

        //Richiesta input
        System.out.println("Inserisci la tua Passkey : ");
        Scanner input = new Scanner(System.in);
        String passkey = input.nextLine();



        //controlli
        //----------------PRIMO----------------
        Controls CaratteriLunghezza = new Controls();
        Controls Segni = new Controls();
        if(!CaratteriLunghezza.LunghezzaCaratteri(passkey)){
            System.out.println("Errore nell'inserimento della passkey");
            CaratteriLunghezza.RegolaPasskey();
            return;

        }
        if(!Segni.InserimentoSegni(passkey)){
            System.out.println("Hai inserito uno o più caratteri/segni vietati");

        }else{
            System.out.println("passkey inserita con successo");
        }


        //----------------GENERATORE VOCABOLARIO----
        /*
        Number VocabolarioMinuto = new Number();
        Timestamp Minuto = new Timestamp();
        VocabolarioMinuto.VocabolarioMinuto(Minuto.CalcoloMinuto());

        */


        //----test----valoriannomese ecc

        Timestamp valore = new Timestamp();
        System.out.println("anno = " + valore.CalcoloAnno());
        System.out.println("mese = " + valore.CalcoloMese());
        System.out.println("giorno = " + valore.CalcoloGiorno());
        System.out.println("ora = " + valore.CalcoloOra());
        System.out.println("minuto = " + valore.CalcoloMinuto());


        //-------test-------TimestampNumber Generazione Vocabolario





        //----------------test----------------

        Nonce Valore = new Nonce();
        Number val = new Number();
        /*
        for(int i = 0; i <= passkey.length(); i++) {
            char carattere = Valore.RotorePadre(passkey);
            System.out.println("Il carattere "+ i +" è : " + carattere);
        }
        */
        RisultatoFinale = Valore.RotorePadre(passkey);
        System.out.println(RisultatoFinale);
        System.out.println(Valore.VocabolarioStringa);
    }
}