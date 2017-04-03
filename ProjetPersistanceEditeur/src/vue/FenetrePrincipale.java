package vue;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



@SuppressWarnings("serial")
public class FenetrePrincipale extends JFrame
{
	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	
	JLabel jlNom;
	JLabel jlNomEtoile;
	JLabel jlMasse;
	JLabel jlRayon;
	JLabel jlFlux;
	JLabel jlTemperature;
	JLabel jlPeriode;
	JLabel jlDistance;
	JLabel jlZone;
	JLabel jlIst;
	JLabel jlSph;
	JLabel jlHzd;
	JLabel jlHzc;
	JLabel jlHza;
	JLabel jlPClasse;
	JLabel jlHClasse;
	JLabel jlPhi;
	JLabel jlStatus;
	JLabel jlDecouverte;
	
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
		
		jlNom = new JLabel();
		jlNomEtoile = new JLabel();
		jlMasse = new JLabel();
		jlRayon = new JLabel();
		jlFlux = new JLabel();
		jlTemperature = new JLabel();
		jlPeriode = new JLabel();
		jlDistance = new JLabel();
		jlZone = new JLabel();
		jlIst = new JLabel();
		jlSph = new JLabel();
		jlHzd = new JLabel();
		jlHzc = new JLabel();
		jlHza = new JLabel();
		jlPClasse = new JLabel();
		jlHClasse = new JLabel();
		jlPhi = new JLabel();
		jlStatus = new JLabel();
		jlDecouverte = new JLabel();
		
		jtp.addTab("ajouter", jp1);
		jtp.addTab("onglet 2", jp2);
		jtp.addTab("onglet 3", jp3);
		
		jp1.add(jlNom);
		jp1.add(jlNomEtoile);
		jp1.add(jlMasse);
		jp1.add(jlRayon);
		jp1.add(jlFlux);
		jp1.add(jlTemperature);
		jp1.add(jlPeriode);
		jp1.add(jlDistance);
		jp1.add(jlZone);
		jp1.add(jlIst);
		jp1.add(jlSph);
		jp1.add(jlHzd);
		jp1.add(jlHzc);
		jp1.add(jlHza);
		jp1.add(jlPClasse);
		jp1.add(jlHClasse);
		jp1.add(jlPhi);
		jp1.add(jlStatus);
		jp1.add(jlDecouverte);
		
		
		
		setSize(700, 1000);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void afficherExo(String[] planeteString)
	{
		jp1.removeAll();
		
		for(String exo : planeteString)
		{
			jp1.add(new JLabel(exo));
		}
		
		jp1.revalidate();
	}

	public JLabel getJlNom() {
		return jlNom;
	}

	public void setJlNom(JLabel jlNom) {
		this.jlNom = jlNom;
	}

	public JLabel getJlNomEtoile() {
		return jlNomEtoile;
	}

	public void setJlNomEtoile(JLabel jlNomEtoile) {
		this.jlNomEtoile = jlNomEtoile;
	}

	public JLabel getJlMasse() {
		return jlMasse;
	}

	public void setJlMasse(JLabel jlMasse) {
		this.jlMasse = jlMasse;
	}

	public JLabel getJlRayon() {
		return jlRayon;
	}

	public void setJlRayon(JLabel jlRayon) {
		this.jlRayon = jlRayon;
	}

	public JLabel getJlFlux() {
		return jlFlux;
	}

	public void setJlFlux(JLabel jlFlux) {
		this.jlFlux = jlFlux;
	}

	public JLabel getJlTemperature() {
		return jlTemperature;
	}

	public void setJlTemperature(JLabel jlTemperature) {
		this.jlTemperature = jlTemperature;
	}

	public JLabel getJlPeriode() {
		return jlPeriode;
	}

	public void setJlPeriode(JLabel jlPeriode) {
		this.jlPeriode = jlPeriode;
	}

	public JLabel getJlDistance() {
		return jlDistance;
	}

	public void setJlDistance(JLabel jlDistance) {
		this.jlDistance = jlDistance;
	}

	public JLabel getJlZone() {
		return jlZone;
	}

	public void setJlZone(JLabel jlZone) {
		this.jlZone = jlZone;
	}

	public JLabel getJlIst() {
		return jlIst;
	}

	public void setJlIst(JLabel jlIst) {
		this.jlIst = jlIst;
	}

	public JLabel getJlSph() {
		return jlSph;
	}

	public void setJlSph(JLabel jlSph) {
		this.jlSph = jlSph;
	}

	public JLabel getJlHzd() {
		return jlHzd;
	}

	public void setJlHzd(JLabel jlHzd) {
		this.jlHzd = jlHzd;
	}

	public JLabel getJlHzc() {
		return jlHzc;
	}

	public void setJlHzc(JLabel jlHzc) {
		this.jlHzc = jlHzc;
	}

	public JLabel getJlHza() {
		return jlHza;
	}

	public void setJlHza(JLabel jlHza) {
		this.jlHza = jlHza;
	}

	public JLabel getJlPClasse() {
		return jlPClasse;
	}

	public void setJlPClasse(JLabel jlPClasse) {
		this.jlPClasse = jlPClasse;
	}

	public JLabel getJlHClasse() {
		return jlHClasse;
	}

	public void setJlHClasse(JLabel jlHClasse) {
		this.jlHClasse = jlHClasse;
	}

	public JLabel getJlPhi() {
		return jlPhi;
	}

	public void setJlPhi(JLabel jlPhi) {
		this.jlPhi = jlPhi;
	}

	public JLabel getJlStatus() {
		return jlStatus;
	}

	public void setJlStatus(JLabel jlStatus) {
		this.jlStatus = jlStatus;
	}

	public JLabel getJlDecouverte() {
		return jlDecouverte;
	}

	public void setJlDecouverte(JLabel jlDecouverte) {
		this.jlDecouverte = jlDecouverte;
	}

}
