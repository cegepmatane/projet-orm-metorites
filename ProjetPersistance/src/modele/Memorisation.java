package modele;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

//Class "Gardien" du pattern Mémento
public class Memorisation {
	
protected Hashtable<MementoExoplanete, Date> listeExoplanete;
	
	public Memorisation()
	{
		this.listeExoplanete = new Hashtable<MementoExoplanete, Date>();
	}

	public void ajouterMemento(MementoExoplanete memento, Date date)
	{
		this.listeExoplanete.put(memento, date);
	}
	
	public Hashtable<MementoExoplanete, Date> getListeMessage()
	{
		return listeExoplanete;
	}

	public void setListeMessage(Hashtable<MementoExoplanete, Date> listeExoplanete) {
		this.listeExoplanete = listeExoplanete;
	}
}
