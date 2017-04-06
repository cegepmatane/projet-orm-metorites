package modele;

import java.util.LinkedList;
import java.util.List;

public abstract class RechercheTemplate 
{
	protected Exoplanete [] planetesOriginales;
	protected List<Exoplanete> planetesFinales;
	
	public RechercheTemplate(Exoplanete [] planetes)
	{
		this.planetesOriginales = planetes;
		planetesFinales=new LinkedList<Exoplanete>();
	}
	
	public void afficherDonneesOriginales()
	{
		System.out.print("Données originales : ");
		for(int position=0; position < this.planetesOriginales.length; position++)
		{
			System.out.print(this.planetesOriginales[position].getInfos() + " ");
		}
		System.out.println("");
	}
	
	public abstract void trier();
	
	public void afficherDonneesTriees()
	{
		System.out.print("Données triées : ");
		for(int position=0; position < this.planetesFinales.size(); position++)
		{
			System.out.print(this.planetesFinales.get(position).getInfos() + " ");
		}
		System.out.println("");
	}
	
	// fonction qui ne sera jamais surchargée
	public void executer()
	{
		this.afficherDonneesOriginales();
		this.trier();
		this.afficherDonneesTriees();
	}
	
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
}
