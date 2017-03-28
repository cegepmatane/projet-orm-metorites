package modele;

public class Exoplanete {
	private String nom;
	private String nomEtoile;
	private float masse;
	private float rayon;
	private float flux;
	private int temperature;
	private float periode;
	private float distance;
	private String zone;
	private float ist;
	private float sph;
	private float hzd;
	private float hzc;
	private float hza;
	private String pClasse;
	private String hClasse;
	private float phi;
	private String status;
	private String decouverte;

	public Exoplanete() {
	}
	
	public String getInfos()
	{
		return "" + nom + " " + masse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomEtoile() {
		return nomEtoile;
	}

	public void setNomEtoile(String nomEtoile) {
		this.nomEtoile = nomEtoile;
	}

	public float getMasse() {
		return masse;
	}

	public void setMasse(float masse) {
		this.masse = masse;
	}

	public float getRayon() {
		return rayon;
	}

	public void setRayon(float rayon) {
		this.rayon = rayon;
	}

	public float getFlux() {
		return flux;
	}

	public void setFlux(float flux) {
		this.flux = flux;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public float getPeriode() {
		return periode;
	}

	public void setPeriode(float periode) {
		this.periode = periode;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public float getIst() {
		return ist;
	}

	public void setIst(float ist) {
		this.ist = ist;
	}

	public float getSph() {
		return sph;
	}

	public void setSph(float sph) {
		this.sph = sph;
	}

	public float getHzd() {
		return hzd;
	}

	public void setHzd(float hzd) {
		this.hzd = hzd;
	}

	public float getHzc() {
		return hzc;
	}

	public void setHzc(float hzc) {
		this.hzc = hzc;
	}

	public float getHza() {
		return hza;
	}

	public void setHza(float hza) {
		this.hza = hza;
	}

	public String getpClasse() {
		return pClasse;
	}

	public void setpClasse(String pClasse) {
		this.pClasse = pClasse;
	}

	public String gethClasse() {
		return hClasse;
	}

	public void sethClasse(String hClasse) {
		this.hClasse = hClasse;
	}

	public float getPhi() {
		return phi;
	}

	public void setPhi(float phi) {
		this.phi = phi;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDecouverte() {
		return decouverte;
	}

	public void setDecouverte(String decouverte) {
		this.decouverte = decouverte;
	}
}