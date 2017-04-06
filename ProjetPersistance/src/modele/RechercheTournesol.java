package modele;

import java.util.List;

public class RechercheTournesol extends RechercheTemplate
{

	public RechercheTournesol(Exoplanete[] planetes) 
	{
		super(planetes);
	}

	@Override
	public void trier() 
	{
		for(Exoplanete p : planetesOriginales)
		{
			if(isNumeric(p.getFlux()))
			{
				Float flux=Float.parseFloat(p.getFlux());
				System.out.println(flux);
				
				if(flux >= 1.6 && flux <= 2.4)
					planetesFinales.add(p);
			}
			
		}
	}
}
