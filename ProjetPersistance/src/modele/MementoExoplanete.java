package modele;

//Class "Mémento" du pattern Mémento
public class MementoExoplanete {
	protected Exoplanete exoplanete;
	protected Long key;
	
	public MementoExoplanete(Exoplanete exoplanete){
		this.exoplanete = new Exoplanete();
		setExoplanete(exoplanete);
	}
	
	public Exoplanete getExoplanete(){
		return exoplanete;
	}
	
	public void setExoplanete(Exoplanete exoplanete){
		this.exoplanete = exoplanete;
	}
	
	public void setKey(Long key)
	{
		this.key = key;
	}
	
	public Long getKey()
	{
		return key;
	}
	
}
