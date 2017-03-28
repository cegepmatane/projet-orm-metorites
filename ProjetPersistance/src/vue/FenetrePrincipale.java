package vue;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



public class FenetrePrincipale extends JFrame
{
	private JPanel panneauPrincipal;
	
	private String exoPlanete;
	
	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	
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
		
		jp1 = new JPanel(new GridLayout(30,0));
		jp2 = new JPanel(new GridLayout(30,0));
		jp3 = new JPanel(new GridLayout(30,0));
		
		jtp.addTab("onglet 1", jp1);
		jtp.addTab("onglet 2", jp2);
		jtp.addTab("onglet 3", jp3);
		
		
		
		setSize(650, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void afficherExo(String[] planeteString)
	{
		for(String exo : planeteString)
		{
			jp1.add(new JLabel(exo));
		}
		jp1.revalidate();
	}

}
