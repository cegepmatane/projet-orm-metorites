package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modele.*;
import vue.*;

public class Controlleur 
{
	ExoplaneteORM modeleORM;
	FenetrePrincipale vue;
	Exoplanete[] planetes;
	
	public Controlleur()
	{
		modeleORM = new ExoplaneteORM();
		vue = new FenetrePrincipale();
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
				
				vue.viderAjouter();
			}
		};
		vue.ajouterActionAuBoutonAjouter(action);
	}
	
	private void ajouterPlaneteSuprimmer()
	{
		planetes = modeleORM.lire();
		String[] planeteString = new String[planetes.length];
		ActionListener[] actions = new ActionListener[planetes.length];
		
		for(int i=0;i<planetes.length;i++)
		{
			planeteString[i]=planetes[i].getInfos();
			actions[i]=new ActionListenerSupprimmer(i);
		}
		vue.afficherExoplanetes(planeteString, actions);
	}
	
	public class ActionListenerSupprimmer implements ActionListener
	{
		int id;
		
		public ActionListenerSupprimmer(int id) 
		{
			this.id=id;
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			supprimmerPlanete(planetes[id]);
			ajouterPlaneteSuprimmer();
		}
		
	}
	
	public static void main(String[] args) 
	{
		Controlleur controlleur = new Controlleur();
		controlleur.ajouterActionAuBoutonAjouter();
		controlleur.ajouterPlaneteSuprimmer();
	}
}
