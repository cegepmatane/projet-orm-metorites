package modele;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ExoplaneteORM 
{
	Session session;
	SessionFactory sessionControleur;
	
	public ExoplaneteORM()
	{
		ouvrirSession();
	}
	
	public void ouvrirSession()
	{
		Configuration configuration = new Configuration();
		configuration.addClass(Exoplanete.class);
		sessionControleur = configuration.buildSessionFactory();
		session = sessionControleur.openSession();
	}
	
	@SuppressWarnings("deprecation")
	public Exoplanete[] lire()
	{
		LinkedList<Exoplanete> planetes = new LinkedList<Exoplanete>();
		
		Iterator listeExoplanete = session.createQuery("from Exoplanete").iterate();
		while(listeExoplanete.hasNext())
		{
			Exoplanete exoplanete = (Exoplanete)listeExoplanete.next(); // ca prend le constructeur vide
			planetes.add(exoplanete);
		}
		return planetes.toArray(new Exoplanete[0]);
	}
	
	public void ecrire(Exoplanete nouveauExoplanete)
	{
		session.save(nouveauExoplanete);
	}
	
	public void fermerSesion()
	{
		session.close();
		sessionControleur.close();
	}
}
