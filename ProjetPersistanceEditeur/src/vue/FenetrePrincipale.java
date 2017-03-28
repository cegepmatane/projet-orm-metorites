package vue;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class FenetrePrincipale extends JFrame
{
	private JPanel panneauPrincipal;
	
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
		
		JPanel jp1 = new JPanel(new GridLayout(30,0));
		JPanel jp2 = new JPanel(new GridLayout(30,0));
		JPanel jp3 = new JPanel(new GridLayout(30,0));
		
		jtp.addTab("onglet 1", jp1);
		jtp.addTab("onglet 2", jp2);
		jtp.addTab("onglet 3", jp3);
		
		setSize(650, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
