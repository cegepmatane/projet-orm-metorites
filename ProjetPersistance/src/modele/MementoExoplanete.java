package modele;

//Class "M�mento" du pattern M�mento
public class MementoExoplanete {
	protected Exoplanete exoplanete;
	
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
	
}
