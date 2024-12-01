package rexamensuj1;

public class Theatre extends Evenement {
	private String auteur;

	public Theatre(String titre, int duree, String[] tab, String reialisateur, String auteur) {
		super(titre, duree, tab, reialisateur);
		this.auteur = auteur;
	}

	@Override
	public String toString() {
		return super.toString()+"Theatre [auteur=" + auteur + "]";
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	

}
