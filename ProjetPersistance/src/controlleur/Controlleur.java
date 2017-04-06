package controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

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
			memento.setKey(new Date().getTime());
			boolean doublon = false;
			for(Long key : memorisation.getListeMemento().keySet())
			{
				if(memorisation.getListeMemento().get(key).getExoplanete().getId() == memento.getExoplanete().getId()){
					doublon = true;
				}
			}
			if(memorisation.getListeMemento().size() == 0 || doublon == false)
			{
				memorisation.ajouterMemento(memento.getKey(), memento);
				vue.afficherMemento(memorisation.getListeMemento());
				try {
					ExoplaneteHelper.write(memento.getExoplanete(), "sauvegarde-" + memento.getKey());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
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
	
	public void initialiserMemento() throws Exception
	{
		File dossier = new File("src/sauvegardes/");
		File[] dossierListe = dossier.listFiles();
		for (File fichier : dossierListe) {
			Exoplanete exo = ExoplaneteHelper.read(fichier.getName());
			MementoExoplanete memento = new MementoExoplanete(exo);
			memorisation.ajouterMemento(new Date().getTime(), memento);
		}
		vue.afficherMemento(memorisation.getListeMemento());

	}
	
	public static void main(String[] args) throws Exception 
	{
		Controlleur controlleur = new Controlleur();
		controlleur.afficherPlanetes();
		controlleur.initialiserMemento();
		controlleur.ajouterRecherche("robot");
		controlleur.ajouterRecherche("humain");
	}
}
