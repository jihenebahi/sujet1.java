package rexamensuj1;

public class ThemeArtiste implements ThemeEvt {
	private String artiste;
	public ThemeArtiste(String artiste) {
		this.artiste = artiste;
	}

	public boolean theme(Evenement Evt)
	{
		boolean test=false;
		if(Evt instanceof Theatre)
		{
			if(Evt.acteurIn(artiste)==true)
			{
				test=true;
			}
			else
			{
				if(Evt.getReialisateur().equals(artiste))
				{
					test=true;
				}
				else
				{
					if(((Theatre) Evt).getAuteur().equals(artiste))
					{
						test=true;
					}
				}
			}
			
			
		}
		else
		{
			if(Evt instanceof Film)
			{
				
				if(Evt.acteurIn(artiste)==true)
				{
					test=true;
				}
				else
				{
					if(Evt.getReialisateur().equals(artiste))
					{
						test=true;
					}
					else
					{
						if(((Film) Evt).getProducteur().equals(artiste))
						{
							test=true;
						}
					}
				}
			}
		}
		return test;
	}

}
 