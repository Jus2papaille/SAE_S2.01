package Clinique;



public class Main {
    public static void main(String[] args) {

        GestionPatient patient1= new GestionPatient(1, "Doe", "John", 25);
        GestionPatient patient2= new GestionPatient(2, "Mochael", "Jane", 30);
        GestionPatient patient3= new GestionPatient(3, "Pruma", "Jackie", 35);

        GestionMedecin medecin1= new GestionMedecin(1, "Maroille", "Matheo", "Cardiologue");
        GestionMedecin medecin2= new GestionMedecin(2, "Coegnet", "Ines", "Dentiste");
        GestionMedecin medecin3= new GestionMedecin(3, "Louis", "nolwenn", "Pediatre");

        GestionRdv rdv1= new GestionRdv(medecin1.getIdMed(), patient1.getIdPatient(), true);

        Medicament medicament1 = new Medicament("Doliprane", 25);
        Medicament medicament2 = new Medicament("Paracetamol", 25);
        Medicament medicament3 = new Medicament("OmegaNatural", 25);

        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);
        System.out.println(medecin1);
        System.out.println(medecin2);
        System.out.println(medecin3);
        System.out.println(rdv1);
        System.out.println(medicament1);
        System.out.println(medicament2);

        GestionOrdonnances Ord1 = new GestionOrdonnances(1,2,"2", 4, Prise.MATIN);
        Ord1.addMedicament(medicament1);
        Ord1.addMedicament(medicament2);
        Ord1.addMedicament(medicament3);
        System.out.println(Ord1);
        System.out.println(medicament1.getNomMed());
        System.out.println(medicament2.getNomMed());
        System.out.println(Ord1.getListMedicament());
    }
}
