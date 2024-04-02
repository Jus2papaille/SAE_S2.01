package Clinique;

public class Medicament {
    private String nomMed;
    private int idMed, quantite , prix ;

    public Medicament(int idMed, String nomMed, int quantite, int prix) {
        this.idMed = idMed;
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

    public int getPrix() {
        return prix;
    }
    public int getprix() {
        return prix;
    }
    public int getIdMed() {
        return idMed;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "nomMed='" + nomMed + '\'' +
                ", quantite=" + quantite + "x" +
                ", prix=" + prix
                    + '}';
    }


}