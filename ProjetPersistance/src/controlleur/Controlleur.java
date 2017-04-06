package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.List;

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
		
		vue.afficherExoplanetes(planeteString, action);
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
			boolean doublon = false;
			for(Long key : memorisation.getListeMemento().keySet())
			{
				if(memorisation.getListeMemento().get(key).getExoplanete().getId() == memento.getExoplanete().getId()){
					doublon = true;
				}
			}
			if(memorisation.getListeMemento().size() == 0 || doublon == false)
			{
				memorisation.ajouterMemento(new Date().getTime(), memento);
				vue.afficherMemento(memorisation.getListeMemento());
			}
			doublon = false;
		}
		
	}
	
	public void ajouterRecherche(String recherche)
	{
		List<Exoplanete> planetesVoulues;
		
		if(recherche.equals("robot"))
			planetesVoulues = new RechercheRobot(planetes).executer();
		
		else if(recherche.equals("humain"))
			planetesVoulues = new RechercheHumain(planetes).executer();
		
		else
			return;
		
		String[] planetesVouluesString = new String[planetesVoulues.size()];
		
		for(int index=0 ; index < planetesVouluesString.length ; index++)
		{
			planetesVouluesString[index]=planetesVoulues.get(index).getInfos();
		}
		if(recherche.equals("robot"))
			vue.afficherExoplanetesRechercheRobot(planetesVouluesString);
		
		else if(recherche.equals("humain"))
			vue.afficherExoplanetesRechercheHumain(planetesVouluesString);
	}
	
	public static void main(String[] args) throws IOException 
	{
		Controlleur controlleur = new Controlleur();
		controlleur.afficherPlanetes();
		controlleur.ajouterRecherche("robot");
		controlleur.ajouterRecherche("humain");
	}
}
