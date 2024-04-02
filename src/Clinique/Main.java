package Clinique;


import java.util.List;

public class Main{
    public static void main(String[] args) {


        // FONCTIONNEMENT SANS MENU
//        System.out.println();
//
//        GestionPatient gestionPatient[] = {
//            new GestionPatient(1, "Doe", "John", 25),
//            new GestionPatient(2, "Mochael", "Jane", 30),
//            new GestionPatient(3, "Pruma", "Jackie", 35),
//        };
//
//        for (int i = 0; i < gestionPatient.length ; i++) {
//            System.out.println(gestionPatient[i]);
//        }
//
//        System.out.println();
//
//        GestionMedecin gestionMedecin[] = {
//            new GestionMedecin(1, "Maroille", "Matheo", "Cardiologue",10),
//            new GestionMedecin(2, "Coegnet", "Ines", "Dentiste",75),
//            new GestionMedecin(3, "Louis", "nolwenn", "Pediatre",12),
//        };
//
//        for (int i = 0; i < gestionMedecin.length ; i++) {
//            System.out.println(gestionMedecin[i]);
//        }
//
//        System.out.println();
//
//        GestionRdv gestionRdv[] = {
//            new GestionRdv(gestionMedecin[0].getIdMed(), gestionPatient[0].getIdPatient(), true),
//            new GestionRdv(gestionMedecin[1].getIdMed(), gestionPatient[2].getIdPatient(), true),
//            new GestionRdv(gestionMedecin[2].getIdMed(), gestionPatient[1].getIdPatient(), true),
//        };
//
//        for (int i = 0; i < gestionRdv.length ; i++) {
//            System.out.println(gestionRdv[i]);
//        }
//
//        System.out.println();
//
//        Medicament medicament[] = {
//            new Medicament(1,"Doliprane", 25 , 10),
//            new Medicament(2,"Paracetamol", 25, 24),
//            new Medicament(3,"OmegaNatural", 25, 59),
//        };
//
//        for (int i = 0; i < medicament.length ; i++) {
//            System.out.println(medicament[i]);
//        }
//
//        System.out.println();
//
//        System.out.println(medicament[0].getNomMed());
//        System.out.println(medicament[1].getNomMed());
//
//        System.out.println();
//
//        GestionOrdonnances gestionOrdonnances[] = {
//            new GestionOrdonnances(1,1,2,"2", 4, Prise.MATIN,true),
//            new GestionOrdonnances(2,2,3,"2", 4, Prise.SOIR,true),
//        };
//
//
//
//        gestionOrdonnances[0].addMedicament(medicament[0]);
//        gestionOrdonnances[0].addMedicament(medicament[1]);
//        gestionOrdonnances[0].addMedicament(medicament[2]);
//        gestionOrdonnances[1].addMedicament(medicament[0]);
//
//        for (int i = 0; i < gestionOrdonnances.length ; i++) {
//            System.out.println(gestionOrdonnances[i]);
//        }
//
//        System.out.println();
//
//        System.out.println(gestionOrdonnances[0].getMedicament(0));
//
//        System.out.println();
//
//        HistoriquePatient historiquePatient1 = new HistoriquePatient(gestionPatient, gestionOrdonnances, gestionRdv);
//
//        System.out.println(historiquePatient1.getGestionPatients());
//        System.out.println();
//        System.out.println(historiquePatient1.getGestionOrdonnances());
//        System.out.println();
//        System.out.println(historiquePatient1.getGestionRdvs());
//
//        Recherche recherche = new Recherche(List.of(gestionPatient), List.of(gestionMedecin));
//        System.out.println(recherche.rechercherMedecinParNom("Maroille"));
//        System.out.println();
//        System.out.println(recherche.rechercherPatientParNom("Doe"));
//        System.out.println();
//        System.out.println(recherche.rechercherMedecinParSpecialite("Cardiologue"));
//        System.out.println();
//
//        Facturation facturation[] = {
//                new Facturation(1, 0,0,medicament[0],gestionMedecin[0]),
//                new Facturation(2, 0,0,medicament[1],gestionMedecin[1]),
//        }; // 0 = null
//
//        facturation[1].genererFacture(gestionOrdonnances[0]);
//        facturation[0].genererFacture(gestionOrdonnances[1]);
//
//        facturation[0].payerFacture();
//        System.out.println();
//
//        facturation[1].genererFacture(gestionOrdonnances[0]);
//        facturation[0].genererFacture(gestionOrdonnances[1]);
//
//
//        System.out.println();
//
//        gestionPatient[1].laisserFeedback(2, "Excellent service", 5);
//        gestionPatient[0].laisserFeedback(3, "Deplorable", 1);
//
//        gestionPatient[0].lireFeedback();
//        gestionPatient[1].lireFeedback();


//          AVEC MENU
        new Menu().menu() ;



    }
}
