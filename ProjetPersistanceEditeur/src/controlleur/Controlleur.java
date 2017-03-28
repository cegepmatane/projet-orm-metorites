package controlleur;

import modele.*;
import vue.*;

public class Controlleur 
{
	public Controlleur()
	{
		afficherPlanetes();
	}
	
	public void afficherPlanetes()
	{
		ExoplaneteORM exoORM = new ExoplaneteORM();
		FenetrePrincipale vue = new FenetrePrincipale();
		
		Exoplanete[] planetes = exoORM.lire();
		String[] planeteString = new String[planetes.length];
		
		for(int i=0;i<planetes.length;i++)
		{
			planeteString[i]=planetes[i].getInfos();
		}
		
	}
}
