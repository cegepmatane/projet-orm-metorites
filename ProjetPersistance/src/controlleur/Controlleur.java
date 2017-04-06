package controlleur;

import java.io.IOException;

import modele.*;
import vue.*;

public class Controlleur 
{
	ExoplaneteORM modeleORM;
	FenetrePrincipale vue;
	static Exoplanete[] planetes;
	
	
	public Controlleur()
	{
		modeleORM = new ExoplaneteORM();
		vue = new FenetrePrincipale();
	}
	
	public void afficherPlanetes() throws IOException
	{		
		planetes = modeleORM.lire();
		String[] planeteString = new String[planetes.length];
		
		for(int i=0;i<planetes.length;i++)
		{
			planeteString[i]=planetes[i].getInfos();
		}
		
		vue.afficherExo(planeteString);
	}
	
	public static void main(String[] args) throws IOException 
	{
		Controlleur controlleur = new Controlleur();
		controlleur.afficherPlanetes();
		new RechercheTournesol(planetes).executer();
	}
}
