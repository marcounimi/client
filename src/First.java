import java.util.Calendar;

public class First{

    int CalcoloAnno() {
        Calendar annoValore = Calendar.getInstance();
        int anno = annoValore.get(Calendar.YEAR);
        return anno;
    }


    int CalcoloMese(){
        Calendar meseValore = Calendar.getInstance();
        int mese = meseValore.get(Calendar.MONTH);
        return mese;
    }


    int CalcoloGiorno(){
        Calendar giornoValore = Calendar.getInstance();
        int giorno = giornoValore.get(Calendar.DAY_OF_MONTH);
        return giorno;
    }


    int CalcoloOra(){
        Calendar valoreOra = Calendar.getInstance();
        int ora = valoreOra.get(Calendar.HOUR);
        return ora;
    }


    int CalcoloMinuto(){
        Calendar MinutoValore = Calendar.getInstance();
        int minuto = MinutoValore.get(Calendar.MINUTE);
        return minuto;
    }
}