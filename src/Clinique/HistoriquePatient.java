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

    public GestionPatient[] getGestionPatients() {
        System.out.println("Liste des patients : ");
        for (int i = 0; i < gestionPatients.length ; i++) {
            System.out.println(gestionPatients[i]+" , ");
        }
        System.out.println();
        return gestionPatients;
    }

    public GestionOrdonnances[] getGestionOrdonnances(){
        System.out.println("Liste des Ordonnances : ");
        for (int i = 0; i < gestionOrdonnances.length ; i++) {
            System.out.println(gestionOrdonnances[i]+" , ");
        }
        System.out.println();
        return gestionOrdonnances;
    }


    public GestionRdv[] getGestionRdvs() {
        System.out.println("Liste des Rdvs : ");
        for (int i = 0; i < gestionRdvs.length ; i++) {
            System.out.println(gestionRdvs[i]+" , ");
        }
        System.out.println();
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