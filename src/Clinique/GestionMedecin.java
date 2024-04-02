package Clinique;

public class GestionMedecin {
	private int RPPS, prixConsult ;
	private String nom, prenom, specialisation ;

	public GestionMedecin(int RPPS, String nom, String prenom, String specialisation, int prixConsult) {
		this.RPPS = RPPS ; // identifiant des medecins
		this.nom = nom;
		this.prenom = prenom;
		this.specialisation = specialisation;
		this.prixConsult = prixConsult ;
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
	public int getPrixConsult(){
		return prixConsult;
	}


	@Override
	public String toString() {
		return "Medecin [idMed=" + RPPS + ", nom=" + nom + ", prenom=" + prenom + ", specialisation=" + specialisation
				+ "prixConsult=" + prixConsult + "]";
	}

}