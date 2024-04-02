package Clinique;


public class Facturation {
    private String nomFacture ;

    public Facturation(String nomfacture) {
        this.nomFacture = nomfacture;
    }

    public String getFacture() {
        return nomFacture;
    }

    public double PrixTotMedi(GestionOrdonnances ordonnance, Medicament [] medicament) {
        int total = 0;

        for(int i = 0 ; i < GestionOrdonnances.listMedicament.length ; i++ ) {
            for(int j = 0 ;  j < medicament.length; j++) {
                if(ordonnance.getMedicament(i).equals(medicament[j])) {
                    total = total + medicament[j].getPrix;
                    System.out.println("Nom du médicament : "+ medicament[j] + " Prix :"+ medicament[j].getPrix );
                }

            }
        }
        return total ;
    }

    public double PrixMed(GestionOrdonnances ordonnance) {
        int medecin = ordonnance.idMedecin.getprixConsult();
        int SommeTotal = total + medecin ;
        return medecin  ;
    }

    public void PrixTotal(GestionOrdonnances ordonnace, Medicament [] medicament ) {
        System.out.println("Le prix detaillé des medicaments est:"+ PrixTotMedi(GestionOrdonnances ordonnace, Medicament [] medicament));
        System.out.println("Le prix de la consultation est de :"+ medecin );
        System.out.println("Le prix total est de :"+ medecin + total )
    }


}