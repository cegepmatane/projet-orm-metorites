package modele;

public class RechercheHumain extends RechercheTemplate
{
	public RechercheHumain(Exoplanete[] planetes) 
	{
		super(planetes);
	}

	@Override
	protected void trierHabitable() 
	{
		for(Exoplanete p : planetesAvant)
		{
			if(isNumeric(p.getFlux()) && isNumeric(p.getTemperature()))
			{
				Float flux=Float.parseFloat(p.getFlux());
				Float Temperature=Float.parseFloat(p.getTemperature());
				
				if(flux <= 1 && flux >= 0 && Temperature>240)
					planetesApres.add(p);
			}
		}
	}
	
	@Override
	protected void trierAtteignable()
	{
		for(Exoplanete p : planetesAvant)
		{
			if(isNumeric(p.getDistance()))
			{
				Float distance=Float.parseFloat(p.getDistance());
				
				if(distance <= 25)
					planetesApres.add(p);
			}
		}
	}
	
}
