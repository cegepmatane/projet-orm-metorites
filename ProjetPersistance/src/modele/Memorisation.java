package modele;

import java.util.LinkedHashMap;

//Class "Gardien" du pattern Mémento
public class Memorisation {
	
protected LinkedHashMap<Long, MementoExoplanete> listeExoplanete;
	
	public Memorisation()
	{
		this.listeExoplanete = new LinkedHashMap<Long, MementoExoplanete>();
	}

	public void ajouterMemento(Long date, MementoExoplanete memento)
	{
		this.listeExoplanete.put(date, memento);
	}
	
	public LinkedHashMap<Long, MementoExoplanete> getListeMemento()
	{
		return listeExoplanete;
	}

	public void setListeMemento(LinkedHashMap<Long, MementoExoplanete> listeExoplanete) {
		this.listeExoplanete = listeExoplanete;
	}
}
