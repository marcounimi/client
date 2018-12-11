import java.util.Calendar;

public class Timestamp{

    int CalcoloAnno() {
        Calendar annoValore = Calendar.getInstance();
        final int anno = annoValore.get(Calendar.YEAR);
        return anno;
    }


    int CalcoloMese(){
        Calendar meseValore = Calendar.getInstance();
        final int mese = meseValore.get(Calendar.MONTH);
        return mese;
    }


    int CalcoloGiorno(){
        Calendar giornoValore = Calendar.getInstance();
        final int giorno = giornoValore.get(Calendar.DAY_OF_MONTH);
        return giorno;
    }


    int CalcoloOra(){
        Calendar valoreOra = Calendar.getInstance();
        final int ora = valoreOra.get(Calendar.HOUR);
        return ora;
    }


    int CalcoloMinuto(){
        Calendar MinutoValore = Calendar.getInstance();
        final int minuto = MinutoValore.get(Calendar.MINUTE);
        return minuto;
    }

}