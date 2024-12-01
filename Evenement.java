package rexamensuj1;

import java.util.Arrays;

public class Evenement {
	protected String titre;
	protected int duree;
	protected String tab[];
	protected String reialisateur;
	public Evenement(String titre, int duree, String[] tab, String reialisateur) {
		this.titre = titre;
		this.duree = duree;
		this.tab = tab;
		this.reialisateur = reialisateur;
	}
	@Override
	public String toString() {
		return "Evenement [titre=" + titre + ", duree=" + duree + ", tab=" + Arrays.toString(tab) + ", reialisateur="
				+ reialisateur + "]";
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getReialisateur() {
		return reialisateur;
	}
	public void setReialisateur(String reialisateur) {
		this.reialisateur = reialisateur;
	}
	public boolean acteurIn(String s)
	{
		boolean test=false;
		if(tab !=null)
		{
			for(int i=0;i<tab.length;i++)
			{
				if(tab[i].equalsIgnoreCase(s))
				{
					test=true;
				}
				else
				{
					 test=false;
				}
			}
			return test;
		}
		else
		{
			return false;
		}
		
	}
	

}
