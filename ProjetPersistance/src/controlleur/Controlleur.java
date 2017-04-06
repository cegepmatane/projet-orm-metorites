package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;

import javax.swing.JTextField;

import modele.*;
import vue.*;

public class Controlleur 
{
	ExoplaneteORM modeleORM;
	FenetrePrincipale vue;
	static Exoplanete[] planetes;
	String[] planeteString;
	Memorisation memorisation;
	
	public Controlleur()
	{
		modeleORM = new ExoplaneteORM();
		vue = new FenetrePrincipale();
		memorisation = new Memorisation();
	}
	
	public void afficherPlanetes() throws IOException
	{		
		planetes = modeleORM.lire();
		String[] planeteString = new String[planetes.length];
		planeteString = new String[planetes.length];
		ActionListener[] action = new ActionListener[planetes.length];
		
		for(int i=0;i<planetes.length;i++)
		{
			planeteString[i]=planetes[i].getInfos();
			action[i] = new ActionListenerModifier(i);
		}
		
		vue.afficherExo(planeteString, action);
	}
	
	public class ActionListenerModifier implements ActionListener
	{
		int id;
		
		public ActionListenerModifier(int id) 
		{
			this.id=id;
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			MementoExoplanete memento = new MementoExoplanete(planetes[id]);
			memorisation.ajouterMemento(new Date().getTime(), memento);
			vue.afficherMemento(memorisation.getListeMemento());

		}
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		Controlleur controlleur = new Controlleur();
		controlleur.afficherPlanetes();
		new RechercheRobot(planetes).executer();
	}
}
