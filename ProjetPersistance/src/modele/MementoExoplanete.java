package modele;

//Class "Mémento" du pattern Mémento
public class MementoExoplanete {
	protected Exoplanete exoplanete;
	
	public MementoExoplanete(){
		this.exoplanete = new Exoplanete();
	}
	
	public Exoplanete getExoplanete(){
		return exoplanete;
	}
	
	public void setExoplanete(Exoplanete exoplanete){
		this.exoplanete = exoplanete;
	}
	
}
