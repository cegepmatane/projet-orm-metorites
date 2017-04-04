package controlleur;

import modele.*;
import vue.*;

public class Controlleur 
{
	ExoplaneteORM modeleORM;
	FenetrePrincipale vue;
	
	public Controlleur()
	{
		modeleORM = new ExoplaneteORM();
		vue = new FenetrePrincipale();
	}
	
	public void afficherPlanetes()
	{		
		Exoplanete[] planetes = modeleORM.lire();
		String[] planeteString = new String[planetes.length];
		
		for(int i=0;i<planetes.length;i++)
		{
			planeteString[i]=planetes[i].getInfos();
		}
		
		vue.afficherExo(planeteString);
	}
	
	public void ajouterPlanete(Exoplanete e)
	{
		modeleORM.ecrire(e);
	}
	
	public void supprimmerPlanete(Exoplanete e)
	{
		modeleORM.supprimmer(e);
	}
	
	public static void main(String[] args) 
	{
		Controlleur controlleur = new Controlleur();
	}
}
