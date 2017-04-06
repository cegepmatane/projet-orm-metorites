package modele;

public class Exoplanete {
	private int id;
	private String nom;
	private String nomEtoile;
	private String masse;
	private String rayon;
	private String flux;
	private String temperature;
	private String periode;
	private String distance;
	private String zone;
	private String ist;
	private String sph;
	private String hzd;
	private String hzc;
	private String hza;
	private String pClasse;
	private String hClasse;
	private String phi;
	private String status;
	private String decouverte;

	public Exoplanete() {
	}
	
	public String getInfos()
	{
		return "planete:" + nom + " distance:" + distance + " flux:" + flux + " periode:" + periode + " temperature:" + temperature;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMasse() {
		return masse;
	}

	public void setMasse(String masse) {
		this.masse = masse;
	}

	public String getRayon() {
		return rayon;
	}

	public void setRayon(String rayon) {
		this.rayon = rayon;
	}

	public String getFlux() {
		return flux;
	}

	public void setFlux(String flux) {
		this.flux = flux;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getIst() {
		return ist;
	}

	public void setIst(String ist) {
		this.ist = ist;
	}

	public String getSph() {
		return sph;
	}

	public void setSph(String sph) {
		this.sph = sph;
	}

	public String getHzd() {
		return hzd;
	}

	public void setHzd(String hzd) {
		this.hzd = hzd;
	}

	public String getHzc() {
		return hzc;
	}

	public void setHzc(String hzc) {
		this.hzc = hzc;
	}

	public String getHza() {
		return hza;
	}

	public void setHza(String hza) {
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

	public String getPhi() {
		return phi;
	}

	public void setPhi(String phi) {
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