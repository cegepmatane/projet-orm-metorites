package modele;

//Class "M�mento" du pattern M�mento
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
