package modele;

import java.util.LinkedList;
import java.util.List;

public abstract class RechercheTemplate 
{
	protected List<Exoplanete> planetesAvant;
	protected List<Exoplanete> planetesApres;
	
	public RechercheTemplate(Exoplanete[] planetes)
	{
		planetesAvant=new LinkedList<Exoplanete>();
		planetesApres=new LinkedList<Exoplanete>();
		
		for(Exoplanete e : planetes)
			planetesAvant.add(e);
	}
	
	private void afficherDonneesOriginales()
	{
		System.out.print("Données originales : ");
		for(int position=0; position < this.planetesAvant.size(); position++)
		{
			System.out.print(this.planetesAvant.get(position).getInfos() + " ");
		}
		System.out.println("");
	}
	
	protected void trierHabitable()
	{
		planetesApres.addAll(planetesAvant);
	}
	
	protected void trierAtteignable()
	{
		planetesApres.addAll(planetesAvant);
	}
	
	protected void trierAnalysable()
	{
		planetesApres.addAll(planetesAvant);
	}
	
	private void traiterPlanetes()
	{
		planetesAvant.removeAll(planetesAvant);
		planetesAvant.addAll(planetesApres);
		planetesApres.removeAll(planetesApres);
	}
	
	private void afficherDonneesTriees()
	{
		System.out.print("Données triées : ");
		for(int position=0; position < this.planetesApres.size(); position++)
		{
			System.out.print(this.planetesApres.get(position).getInfos() + " ");
		}
		System.out.println("");
	}
	
	// fonction qui ne sera jamais surchargée
	public void executer()
	{
		this.afficherDonneesOriginales();
		this.trierHabitable();
		this.traiterPlanetes();
		this.trierAtteignable();
		this.traiterPlanetes();
		this.trierAnalysable();
		this.afficherDonneesTriees();
	}
	
	public static boolean isNumeric(String str)
	{
		if(str!=null)
			return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
		
		return false;
	}
}
