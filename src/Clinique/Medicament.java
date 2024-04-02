package Clinique;

public class Medicament {
    private String nomMed;
    private int quantite , prix ;

    public Medicament(String nomMed, int quantite, int prix) {
        this.nomMed = nomMed;
        this.quantite = quantite;
        this.prix = prix ;
    }

    public String getNomMed() {
        return nomMed;
    }

    public int getQuantite() {
        return quantite;
    }
    public int getprix(){
        return prix ;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "nomMed='" + nomMed + '\'' +
                ", quantite=" + quantite + "x" +
                prix + '}';
    }
}