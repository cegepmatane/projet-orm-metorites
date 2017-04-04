package vue;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class FenetrePrincipale extends JFrame
{
	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	
	JTextField jlNom;
	JTextField jlNomEtoile;
	JTextField jlMasse;
	JTextField jlRayon;
	JTextField jlFlux;
	JTextField jlTemperature;
	JTextField jlPeriode;
	JTextField jlDistance;
	JTextField jlZone;
	JTextField jlIst;
	JTextField jlSph;
	JTextField jlHzd;
	JTextField jlHzc;
	JTextField jlHza;
	JTextField jlPClasse;
	JTextField jlHClasse;
	JTextField jlPhi;
	JTextField jlStatus;
	JTextField jlDecouverte;
	
	JButton btnAjouter;
	
	
	
	public FenetrePrincipale()
	{
		super();		
		afficherFenetre();
	}
	
	private void afficherFenetre()
	{
		setTitle("Planètes");
		JTabbedPane jtp = new JTabbedPane();
		getContentPane().add(jtp);
		
		jp1 = new JPanel(new GridLayout(45,0));
		jp2 = new JPanel(new GridLayout(30,0));
		jp3 = new JPanel(new GridLayout(30,0));
		
		jlNom = new JTextField();
		JLabel nom = new JLabel("Nom");
		jlNomEtoile = new JTextField();
		JLabel nomEtoile = new JLabel("NomEtoile");
		jlMasse = new JTextField();
		JLabel masse = new JLabel("Masse");
		jlRayon = new JTextField();
		JLabel rayon = new JLabel("Rayon");
		jlFlux = new JTextField();
		JLabel flux = new JLabel("Flux");
		jlTemperature = new JTextField();
		JLabel temperature = new JLabel("Temperature");
		jlPeriode = new JTextField();
		JLabel periode = new JLabel("Periode");
		jlDistance = new JTextField();
		JLabel distance = new JLabel("Distance");
		jlZone = new JTextField();
		JLabel zone = new JLabel("Zone");
		jlIst = new JTextField();
		JLabel ist = new JLabel("Ist");
		jlSph = new JTextField();
		JLabel sph = new JLabel("Sph");
		jlHzd = new JTextField();
		JLabel hzd = new JLabel("Hzd");
		jlHzc = new JTextField();
		JLabel hzc = new JLabel("Hzc");
		jlHza = new JTextField();
		JLabel hza = new JLabel("Hza");
		jlPClasse = new JTextField();
		JLabel pClasse = new JLabel("PClasse");
		jlHClasse = new JTextField();
		JLabel hClasse = new JLabel("HClasse");
		jlPhi = new JTextField();
		JLabel phi = new JLabel("Phi");
		jlStatus = new JTextField();
		JLabel status = new JLabel("Status");
		jlDecouverte = new JTextField();
		JLabel decouverte = new JLabel("Decouverte");
		
		btnAjouter = new JButton("Ajouter");
		
		
		jtp.addTab("ajouter", jp1);
		jtp.addTab("onglet 2", jp2);
		jtp.addTab("onglet 3", jp3);
		
		jp1.add(nom);
		jp1.add(jlNom);
		
		jp1.add(nomEtoile);
		jp1.add(jlNomEtoile);
		
		jp1.add(masse);
		jp1.add(jlMasse);
		
		jp1.add(rayon);
		jp1.add(jlRayon);
		
		jp1.add(flux);
		jp1.add(jlFlux);
		
		jp1.add(temperature);
		jp1.add(jlTemperature);
		
		jp1.add(periode);
		jp1.add(jlPeriode);
		
		jp1.add(distance);
		jp1.add(jlDistance);
		
		jp1.add(zone);
		jp1.add(jlZone);
		
		jp1.add(ist);
		jp1.add(jlIst);
		
		jp1.add(sph);
		jp1.add(jlSph);
		
		jp1.add(hzd);
		jp1.add(jlHzd);
		
		jp1.add(hzc);
		jp1.add(jlHzc);
		
		jp1.add(hza);
		jp1.add(jlHza);
		
		jp1.add(pClasse);
		jp1.add(jlPClasse);
		
		jp1.add(hClasse);
		jp1.add(jlHClasse);
		
		jp1.add(phi);
		jp1.add(jlPhi);
		
		jp1.add(status);
		jp1.add(jlStatus);
		
		jp1.add(decouverte);
		jp1.add(jlDecouverte);
		
		jp1.add(btnAjouter);
		
		setSize(700, 1000);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void afficherExo(String[] planeteString)
	{
		jp2.removeAll();
		
		for(String exo : planeteString)
		{
			jp2.add(new JTextField(exo));
			jp2.add(new JButton());
		}
		
		jp2.revalidate();
	}

	public JTextField getJlNom() {
		return jlNom;
	}

	public void setJlNom(JTextField jlNom) {
		this.jlNom = jlNom;
	}

	public JTextField getJlNomEtoile() {
		return jlNomEtoile;
	}

	public void setJlNomEtoile(JTextField jlNomEtoile) {
		this.jlNomEtoile = jlNomEtoile;
	}

	public JTextField getJlMasse() {
		return jlMasse;
	}

	public void setJlMasse(JTextField jlMasse) {
		this.jlMasse = jlMasse;
	}

	public JTextField getJlRayon() {
		return jlRayon;
	}

	public void setJlRayon(JTextField jlRayon) {
		this.jlRayon = jlRayon;
	}

	public JTextField getJlFlux() {
		return jlFlux;
	}

	public void setJlFlux(JTextField jlFlux) {
		this.jlFlux = jlFlux;
	}

	public JTextField getJlTemperature() {
		return jlTemperature;
	}

	public void setJlTemperature(JTextField jlTemperature) {
		this.jlTemperature = jlTemperature;
	}

	public JTextField getJlPeriode() {
		return jlPeriode;
	}

	public void setJlPeriode(JTextField jlPeriode) {
		this.jlPeriode = jlPeriode;
	}

	public JTextField getJlDistance() {
		return jlDistance;
	}

	public void setJlDistance(JTextField jlDistance) {
		this.jlDistance = jlDistance;
	}

	public JTextField getJlZone() {
		return jlZone;
	}

	public void setJlZone(JTextField jlZone) {
		this.jlZone = jlZone;
	}

	public JTextField getJlIst() {
		return jlIst;
	}

	public void setJlIst(JTextField jlIst) {
		this.jlIst = jlIst;
	}

	public JTextField getJlSph() {
		return jlSph;
	}

	public void setJlSph(JTextField jlSph) {
		this.jlSph = jlSph;
	}

	public JTextField getJlHzd() {
		return jlHzd;
	}

	public void setJlHzd(JTextField jlHzd) {
		this.jlHzd = jlHzd;
	}

	public JTextField getJlHzc() {
		return jlHzc;
	}

	public void setJlHzc(JTextField jlHzc) {
		this.jlHzc = jlHzc;
	}

	public JTextField getJlHza() {
		return jlHza;
	}

	public void setJlHza(JTextField jlHza) {
		this.jlHza = jlHza;
	}

	public JTextField getJlPClasse() {
		return jlPClasse;
	}

	public void setJlPClasse(JTextField jlPClasse) {
		this.jlPClasse = jlPClasse;
	}

	public JTextField getJlHClasse() {
		return jlHClasse;
	}

	public void setJlHClasse(JTextField jlHClasse) {
		this.jlHClasse = jlHClasse;
	}

	public JTextField getJlPhi() {
		return jlPhi;
	}

	public void setJlPhi(JTextField jlPhi) {
		this.jlPhi = jlPhi;
	}

	public JTextField getJlStatus() {
		return jlStatus;
	}

	public void setJlStatus(JTextField jlStatus) {
		this.jlStatus = jlStatus;
	}

	public JTextField getJlDecouverte() {
		return jlDecouverte;
	}

	public void setJlDecouverte(JTextField jlDecouverte) {
		this.jlDecouverte = jlDecouverte;
	}

}
