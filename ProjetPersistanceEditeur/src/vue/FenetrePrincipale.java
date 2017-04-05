package vue;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
	
	JTextField ajouterNom;
	JTextField ajouterNomEtoile;
	JTextField ajouterMasse;
	JTextField ajouterRayon;
	JTextField ajouterFlux;
	JTextField ajouterTemperature;
	JTextField ajouterPeriode;
	JTextField ajouterDistance;
	JTextField ajouterZone;
	JTextField ajouterIst;
	JTextField ajouterSph;
	JTextField ajouterHzd;
	JTextField ajouterHzc;
	JTextField ajouterHza;
	JTextField ajouterPClasse;
	JTextField ajouterHClasse;
	JTextField ajouterPhi;
	JTextField ajouterStatus;
	JTextField ajouterDecouverte;
	
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
		jp2 = new JPanel(new GridLayout(45,0));
		jp3 = new JPanel(new GridLayout(30,0));
		
		ajouterNom = new JTextField();
		JLabel nom = new JLabel("Nom");
		ajouterNomEtoile = new JTextField();
		JLabel nomEtoile = new JLabel("NomEtoile");
		ajouterMasse = new JTextField();
		JLabel masse = new JLabel("Masse");
		ajouterRayon = new JTextField();
		JLabel rayon = new JLabel("Rayon");
		ajouterFlux = new JTextField();
		JLabel flux = new JLabel("Flux");
		ajouterTemperature = new JTextField();
		JLabel temperature = new JLabel("Temperature");
		ajouterPeriode = new JTextField();
		JLabel periode = new JLabel("Periode");
		ajouterDistance = new JTextField();
		JLabel distance = new JLabel("Distance");
		ajouterZone = new JTextField();
		JLabel zone = new JLabel("Zone");
		ajouterIst = new JTextField();
		JLabel ist = new JLabel("Ist");
		ajouterSph = new JTextField();
		JLabel sph = new JLabel("Sph");
		ajouterHzd = new JTextField();
		JLabel hzd = new JLabel("Hzd");
		ajouterHzc = new JTextField();
		JLabel hzc = new JLabel("Hzc");
		ajouterHza = new JTextField();
		JLabel hza = new JLabel("Hza");
		ajouterPClasse = new JTextField();
		JLabel pClasse = new JLabel("PClasse");
		ajouterHClasse = new JTextField();
		JLabel hClasse = new JLabel("HClasse");
		ajouterPhi = new JTextField();
		JLabel phi = new JLabel("Phi");
		ajouterStatus = new JTextField();
		JLabel status = new JLabel("Status");
		ajouterDecouverte = new JTextField();
		JLabel decouverte = new JLabel("Decouverte");
		
		btnAjouter = new JButton("Ajouter");
		
		
		jtp.addTab("ajouter", jp1);
		jtp.addTab("onglet 2", jp2);
		jtp.addTab("onglet 3", jp3);
		
		jp1.add(nom);
		jp1.add(ajouterNom);
		
		jp1.add(nomEtoile);
		jp1.add(ajouterNomEtoile);
		
		jp1.add(masse);
		jp1.add(ajouterMasse);
		
		jp1.add(rayon);
		jp1.add(ajouterRayon);
		
		jp1.add(flux);
		jp1.add(ajouterFlux);
		
		jp1.add(temperature);
		jp1.add(ajouterTemperature);
		
		jp1.add(periode);
		jp1.add(ajouterPeriode);
		
		jp1.add(distance);
		jp1.add(ajouterDistance);
		
		jp1.add(zone);
		jp1.add(ajouterZone);
		
		jp1.add(ist);
		jp1.add(ajouterIst);
		
		jp1.add(sph);
		jp1.add(ajouterSph);
		
		jp1.add(hzd);
		jp1.add(ajouterHzd);
		
		jp1.add(hzc);
		jp1.add(ajouterHzc);
		
		jp1.add(hza);
		jp1.add(ajouterHza);
		
		jp1.add(pClasse);
		jp1.add(ajouterPClasse);
		
		jp1.add(hClasse);
		jp1.add(ajouterHClasse);
		
		jp1.add(phi);
		jp1.add(ajouterPhi);
		
		jp1.add(status);
		jp1.add(ajouterStatus);
		
		jp1.add(decouverte);
		jp1.add(ajouterDecouverte);
		
		jp1.add(btnAjouter);
		
		setSize(700, 1000);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void afficherExoplanetes(String[] planeteString, ActionListener[] actions)
	{
		jp2.removeAll();
		
		for(int i=0 ; i<planeteString.length ; i++)
		{
			JButton bouton = new JButton("X");
			bouton.addActionListener(actions[i]);
			jp2.add(new JTextField(planeteString[i]));
			jp2.add(bouton);
		}
		
		jp2.revalidate();
	}
	
	public void ajouterActionAuBoutonAjouter(ActionListener action)
	{
		btnAjouter.addActionListener(action);
	}
	
	public void viderAjouter()
	{
		ajouterNom.setText("");
		ajouterNomEtoile.setText("");
		ajouterMasse.setText("");
		ajouterRayon.setText("");
		ajouterFlux.setText("");
		ajouterTemperature.setText("");
		ajouterPeriode.setText("");
		ajouterDistance.setText("");
		ajouterZone.setText("");
		ajouterIst.setText("");
		ajouterSph.setText("");
		ajouterHzd.setText("");
		ajouterHzc.setText("");
		ajouterHza.setText("");
		ajouterPClasse.setText("");
		ajouterHClasse.setText("");
		ajouterPhi.setText("");
		ajouterStatus.setText("");
		ajouterDecouverte.setText("");
	}

	public String getAjouterNom() {
		return ajouterNom.getText();
	}

	public void setAjouterNom(String nom) {
		this.ajouterNom.setText(nom);
	}

	public String getAjouterNomEtoile() {
		return ajouterNomEtoile.getText();
	}

	public void setAjouterNomEtoile(String nomEtoile) {
		this.ajouterNomEtoile.setText(nomEtoile);
	}

	public String getAjouterMasse() {
		return ajouterMasse.getText();
	}

	public void setAjouterMasse(String masse) {
		this.ajouterMasse.setText(masse);
	}

	public String getAjouterRayon() {
		return ajouterRayon.getText();
	}

	public void setAjouterRayon(String rayon) {
		this.ajouterRayon.setText(rayon);
	}

	public String getAjouterFlux() {
		return ajouterFlux.getText();
	}

	public void setAjouterFlux(String flux) {
		this.ajouterFlux.setText(flux);
	}

	public String getAjouterTemperature() {
		return ajouterTemperature.getText();
	}

	public void setAjouterTemperature(String temperature) {
		this.ajouterTemperature.setText(temperature);
	}

	public String getAjouterPeriode() {
		return ajouterPeriode.getText();
	}

	public void setAjouterPeriode(String periode) {
		this.ajouterPeriode.setText(periode);
	}

	public String getAjouterDistance() {
		return ajouterDistance.getText();
	}

	public void setAjouterDistance(String distance) {
		this.ajouterDistance.setText(distance);
	}

	public String getAjouterZone() {
		return ajouterZone.getText();
	}

	public void setAjouterZone(String zone) {
		this.ajouterZone.setText(zone);
	}

	public String getAjouterIst() {
		return ajouterIst.getText();
	}

	public void setAjouterIst(String ist) {
		this.ajouterIst.setText(ist);
	}

	public String getAjouterSph() {
		return ajouterSph.getText();
	}

	public void setAjouterSph(String sph) {
		this.ajouterSph.setText(sph);
	}

	public String getAjouterHzd() {
		return ajouterHzd.getText();
	}

	public void setAjouterHzd(String hzd) {
		this.ajouterHzd.setText(hzd);
	}

	public String getAjouterHzc() {
		return ajouterHzc.getText();
	}

	public void setAjouterHzc(String hzc) {
		this.ajouterHzc.setText(hzc);
	}

	public String getAjouterHza() {
		return ajouterHza.getText();
	}

	public void setAjouterHza(String hza) {
		this.ajouterHza.setText(hza);
	}

	public String getAjouterPClasse() {
		return ajouterPClasse.getText();
	}

	public void setAjouterPClasse(String pClasse) {
		this.ajouterPClasse.setText(pClasse);
	}

	public String getAjouterHClasse() {
		return ajouterHClasse.getText();
	}

	public void setAjouterHClasse(String hClasse) {
		this.ajouterHClasse.setText(hClasse);
	}

	public String getAjouterPhi() {
		return ajouterPhi.getText();
	}

	public void setAjouterPhi(String phi) {
		this.ajouterPhi.setText(phi);
	}

	public String getAjouterStatus() {
		return ajouterStatus.getText();
	}

	public void setAjouterStatus(String status) {
		this.ajouterStatus.setText(status);
	}

	public String getAjouterDecouverte() {
		return ajouterDecouverte.getText();
	}

	public void setAjouterDecouverte(String decouverte) {
		this.ajouterDecouverte.setText(decouverte);
	}

}
