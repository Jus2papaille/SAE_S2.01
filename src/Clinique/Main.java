package Clinique;



public class Main {
    public static void main(String[] args) {

        System.out.println();

        GestionPatient gestionPatient[] = {
            new GestionPatient(1, "Doe", "John", 25),
            new GestionPatient(2, "Mochael", "Jane", 30),
            new GestionPatient(3, "Pruma", "Jackie", 35),
        };

        for (int i = 0; i < gestionPatient.length ; i++) {
            System.out.println(gestionPatient[i]);
        }

        System.out.println();

        GestionMedecin gestionMedecin[] = {
            new GestionMedecin(1, "Maroille", "Matheo", "Cardiologue"),
            new GestionMedecin(2, "Coegnet", "Ines", "Dentiste"),
            new GestionMedecin(3, "Louis", "nolwenn", "Pediatre"),
        };

        for (int i = 0; i < gestionMedecin.length ; i++) {
            System.out.println(gestionMedecin[i]);
        }

        System.out.println();

        GestionRdv gestionRdv[] = {
            new GestionRdv(gestionMedecin[0].getIdMed(), gestionPatient[0].getIdPatient(), true),
            new GestionRdv(gestionMedecin[1].getIdMed(), gestionPatient[2].getIdPatient(), true),
            new GestionRdv(gestionMedecin[2].getIdMed(), gestionPatient[1].getIdPatient(), true),
        };

        for (int i = 0; i < gestionRdv.length ; i++) {
            System.out.println(gestionRdv[i]);
        }

        System.out.println();

        Medicament medicament[] = {
            new Medicament("Doliprane", 25 , 1),
            new Medicament("Paracetamol", 25, 2),
            new Medicament("OmegaNatural", 25, 3),
        };

        for (int i = 0; i < medicament.length ; i++) {
            System.out.println(medicament[i]);
        }

        System.out.println();

        System.out.println(medicament[0].getNomMed());
        System.out.println(medicament[1].getNomMed());

        System.out.println();

        GestionOrdonnances gestionOrdonnances[] = {
            new GestionOrdonnances(1,1,2,"2", 4, Prise.MATIN,true),
            new GestionOrdonnances(2,2,3,"2", 4, Prise.SOIR,true),
        };



        gestionOrdonnances[0].addMedicament(medicament[0]);
        gestionOrdonnances[0].addMedicament(medicament[1]);
        gestionOrdonnances[0].addMedicament(medicament[2]);
        gestionOrdonnances[1].addMedicament(medicament[0]);

        for (int i = 0; i < gestionOrdonnances.length ; i++) {
            System.out.println(gestionOrdonnances[i]);
        }

        System.out.println();

        System.out.println(gestionOrdonnances[0].getMedicament(0));

        System.out.println();

        HistoriquePatient historiquePatient1 = new HistoriquePatient(gestionPatient, gestionOrdonnances, gestionRdv);

        System.out.println(historiquePatient1.getGestionPatients(1));

    }
}
