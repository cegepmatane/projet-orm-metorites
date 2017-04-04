package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	private void afficherPlanetes()
	{		
		Exoplanete[] planetes = modeleORM.lire();
		String[] planeteString = new String[planetes.length];
		
		for(int i=0;i<planetes.length;i++)
		{
			planeteString[i]=planetes[i].getInfos();
		}
		
		vue.afficherExo(planeteString);
	}
	
	private void ajouterPlanete(Exoplanete e)
	{
		modeleORM.ecrire(e);
	}
	
	private void supprimmerPlanete(Exoplanete e)
	{
		modeleORM.supprimmer(e);
	}
	
	private void ajouterActionAuBoutonAjouter()
	{
		ActionListener action=new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				Exoplanete e=new Exoplanete(vue.getAjouterNom(),vue.getAjouterNomEtoile(),vue.getAjouterMasse(),vue.getAjouterRayon(),vue.getAjouterFlux(),
						vue.getAjouterTemperature(),vue.getAjouterPeriode(),vue.getAjouterDistance(),vue.getAjouterZone(),vue.getAjouterIst(),vue.getAjouterSph(),
						vue.getAjouterHzd(),vue.getAjouterHzc(),vue.getAjouterHza(),vue.getAjouterPClasse(),vue.getAjouterHClasse(),vue.getAjouterPhi(),vue.getAjouterStatus(),
						vue.getAjouterDecouverte());
				ajouterPlanete(e);
			}
		};
		vue.ajouterActionAuBoutonAjouter(action);
	}
	
	
	
	public static void main(String[] args) 
	{
		Controlleur controlleur = new Controlleur();
		controlleur.ajouterActionAuBoutonAjouter();
		
	}
}
