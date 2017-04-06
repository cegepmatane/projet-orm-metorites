package modele;

public class RechercheRobot extends RechercheTemplate
{
	public RechercheRobot(Exoplanete[] planetes) 
	{
		super(planetes);
	}
	
	@Override
	protected void trierAtteignable()
	{
		for(Exoplanete p : planetesAvant)
		{
			if(isNumeric(p.getDistance()))
			{
				Float distance=Float.parseFloat(p.getDistance());
				
				if(distance <= 200)
					planetesApres.add(p);
			}
		}
	}
	@Override
	protected void trierAnalysable()
	{
		for(Exoplanete p : planetesAvant)
		{
			if(isNumeric(p.getPeriode()))
			{
				Float periode=Float.parseFloat(p.getPeriode());
				if(periode <= 40)
					planetesApres.add(p);
			}
		}
	}
}
