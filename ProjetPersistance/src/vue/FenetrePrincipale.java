package vue;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;



@SuppressWarnings("serial")
public class FenetrePrincipale extends JFrame
{
	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	JScrollPane jp1Scroll;
	
	public FenetrePrincipale()
	{
		super();		
		afficherFenetre();
	}
	
	private void afficherFenetre()
	{
		setTitle("Exoplanètes");
		JTabbedPane jtp = new JTabbedPane();
		getContentPane().add(jtp);
		
		jp1 = new JPanel();
		jp2 = new JPanel(new GridLayout(30,0));
		jp3 = new JPanel(new GridLayout(30,0));
		
		new GroupLayout(jp1);
		
		/*
		jp1Scroll = new JScrollPane(jp1);
		jp1Scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Dimension dimension = new Dimension(100,100);
		jp1Scroll.setPreferredSize(dimension);
		*/
		
		jtp.addTab("Liste d'exoplanètes", jp1);
		jtp.addTab("Mémento", jp2);
		jtp.addTab("Recherche", jp3);
		
		
		setSize(600, 1000);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void afficherExo(String[] planeteString) throws IOException
	{
		jp1.removeAll();
		Image img = ImageIO.read(getClass().getResource("../ressources/icone-sauvegarder2.png"));
		for(String exo : planeteString)
		{
			JButton bouton = new JButton(new ImageIcon(img));
			bouton.setMargin(new Insets(0, 0, 0, 0));
			jp1.add(new JLabel(exo));
			jp1.add(bouton);
		}
		jp1.revalidate();
	}

}
