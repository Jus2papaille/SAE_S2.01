package Clinique;

public class GestionMedecin {
    private int RPPS;
	private String nom, prenom, specialisation ;
	
	public GestionMedecin(int RPPS, String nom, String prenom, String specialisation) {
		this.RPPS = RPPS ;
		this.nom = nom;
		this.prenom = prenom;
		this.specialisation = specialisation;
	}

	public int getIdMed() {
		return RPPS;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	@Override
	public String toString() {
		return "Medecin [idMed=" + RPPS + ", nom=" + nom + ", prenom=" + prenom + ", specialisation=" + specialisation
				+ "]";
	}

}
