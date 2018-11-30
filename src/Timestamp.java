import java.util.Calendar;

public class Timestamp{

    protected int CalcoloAnno() {
        Calendar annoValore = Calendar.getInstance();
        int anno = annoValore.get(Calendar.YEAR);
        return anno;
    }


    protected int CalcoloMese(){
        Calendar meseValore = Calendar.getInstance();
        int mese = meseValore.get(Calendar.MONTH);
        return mese;
    }


    protected int CalcoloGiorno(){
        Calendar giornoValore = Calendar.getInstance();
        int giorno = giornoValore.get(Calendar.DAY_OF_MONTH);
        return giorno;
    }


    protected int CalcoloOra(){
        Calendar valoreOra = Calendar.getInstance();
        int ora = valoreOra.get(Calendar.HOUR);
        return ora;
    }


    protected int CalcoloMinuto(){
        Calendar MinutoValore = Calendar.getInstance();
        int minuto = MinutoValore.get(Calendar.MINUTE);
        return minuto;
    }

}