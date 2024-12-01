package rexamensuj1;

public class OrganiseEvtMois {
	private int mois;
	private ThemeEvt theme;
	private Evenement tab1[];
	public int nbMax()
	{
		int nbMax=0;
		if(mois==1 || mois==3 || mois==5 || mois==7 || mois==8 || mois==10 || mois==12)
		{
			nbMax=31;
		}
		else
		{
			if(mois==2)
			{
				nbMax=28;
			}
			else
			{
				nbMax=30;
			}
		}
		return nbMax;
	}
	public OrganiseEvtMois(int mois, ThemeEvt theme) {
		this.mois = mois;
		this.theme = theme;
		tab1=new  Evenement[nbMax()];
	}
	public void ajouter(Evenement Evt,int jour) throws EvtException
	{
		if(this.theme.theme(Evt))
		{
			if(jour<1 || jour>nbMax())
			{
				throw new EvtException("jour incorrect");
			}
			else{
				if(tab1[jour-1]==null) {
					tab1[jour-1]=Evt;
				}
				else
				{
					int i;
					for(i=0;i<nbMax();i++)
					{
						if(tab1[i]!=null)
						{
							tab1[i]=Evt;
							break;
							
						}
					}
					if(i==nbMax())
					{
						throw new EvtException("complet");
					}
				}
			}
		}
		else
		{
			System.out.println("le evt ets hors theme");
		}
		}
	
	public void afficherCalendrierEvts()
	{
		for(int i=0;i<tab1.length;i++)
		{
			System.out.println(tab1[i]);
		}
	}
	public ThemeEvt getTheme() {
		return theme;
	}
	public void setTheme(ThemeEvt theme) {
		this.theme = theme;
	}
	
	

}
