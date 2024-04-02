package Clinique;

public class Medicament {
    String nomMed;
    int quantite;

    public Medicament(String nomMed, int quantite) {
        this.nomMed = nomMed;
        this.quantite = quantite;
    }

    public String getNomMed() {
        return nomMed;
    }

    public int getQuantite() {
        return quantite;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "nomMed='" + nomMed + '\'' +
                ", quantite=" + quantite + "x" +
                '}';
    }
}
