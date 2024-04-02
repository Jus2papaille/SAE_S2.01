package Clinique;

public class Facturation extends GestionOrdonnances {
    private int idFacture;
    private int coutConsultation;
    private boolean estPaye;
    private double tmp1;
    private double tmp2;

    public Facturation(int idFacture, int idPatient, int idMedecin, Medicament medicament, GestionMedecin gestionMedecin){
        super(idPatient, idMedecin);
        this.idFacture = idFacture;
        this.coutConsultation = medicament.getprix() + gestionMedecin.getPrixConsult();
        this.estPaye = false;
        this.tmp1 = medicament.getprix();
        this.tmp2 = gestionMedecin.getPrixConsult();
    }

    public void genererFacture(GestionOrdonnances args) {
        System.out.println("Facture ID: " + idFacture);
        System.out.println("Patient ID: " + args.getIdPatient());
        System.out.println("Medecin ID: " + args.getIdMedecin());
        System.out.println("Coût de la consultation: " + coutConsultation);
        System.out.println("Détail payement: "+ tmp1 +" "+ tmp2);
        System.out.println("Est payé: " + (estPaye ? "Oui" : "Non"));
        System.out.println();
    }

    public void payerFacture() {
        this.estPaye = true;
        System.out.println();
        System.out.println("La facture a été payée.");
    }
}