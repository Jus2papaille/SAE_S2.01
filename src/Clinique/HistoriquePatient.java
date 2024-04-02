package Clinique;

import java.util.Arrays;
import java.util.List;

public class HistoriquePatient {
    private GestionPatient [] gestionPatients;
    private GestionOrdonnances [] gestionOrdonnances;
    private GestionRdv [] gestionRdvs;

    public HistoriquePatient(GestionPatient[] gestionPatients, GestionOrdonnances[] gestionOrdonnances, GestionRdv[] gestionRdvs) {
        this.gestionPatients = gestionPatients;
        this.gestionOrdonnances = gestionOrdonnances;
        this.gestionRdvs = gestionRdvs;
    }

    public GestionPatient[] getGestionPatients(int a) {
        return gestionPatients[];

    }

    public GestionOrdonnances[] getGestionOrdonnances() {
        return gestionOrdonnances;
    }


    public GestionRdv[] getGestionRdvs() {
        return gestionRdvs;
    }



    @Override
    public String toString() {
        return "HistoriquePatient{" +
                "gestionPatients:" + Arrays.toString(gestionPatients) + '\'' +
                ", gestionOrdonnances=" + Arrays.toString(gestionOrdonnances) +
                ", gestionRdvs=" + Arrays.toString(gestionRdvs) +
                '}';
    }
}