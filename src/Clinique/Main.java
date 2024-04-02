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

        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);
        System.out.println(medecin1);
        System.out.println(medecin2);
        System.out.println(medecin3);

    }
}
