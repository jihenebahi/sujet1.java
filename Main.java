package rexamensuj1;

public class Main {
	public static void main(String[] args) {
		ThemeArtiste ta=new ThemeArtiste("Mohamed");
		String tArtistes1[]= {"Ahmed","Salah","Mohamed"};
		String tArtistes2[]= {"Sana","Imene","Mouna"};
		OrganiseEvtMois MJuillet=new OrganiseEvtMois (7,ta);
		Evenement e1= new Film("Film1",2 , tArtistes1, "Sami", "Youssef", "action");
		Evenement e2= new Film("Film2",1 , tArtistes2, "Dalel", "Asma", "Drame");
		Evenement e3=new Theatre("theatre1", 3, null, "Nour", "Mohamed");
		try {
			MJuillet.ajouter(e1,2);
			MJuillet.afficherCalendrierEvts();
		}catch(EvtException ee){
			System.out.println(ee.getMessage());
			
		}
		try
		{
			MJuillet.ajouter(e2,3);	
			MJuillet.afficherCalendrierEvts();
		}
		catch(EvtException ee){
			System.out.println(ee.getMessage());}
		try {
			MJuillet.ajouter(e3,4);
			MJuillet.afficherCalendrierEvts();
		}
		catch(EvtException ee){
			System.out.println(ee.getMessage());
		
	}
		}
}