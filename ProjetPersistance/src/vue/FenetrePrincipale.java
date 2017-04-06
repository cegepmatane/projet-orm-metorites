package vue;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedHashMap;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import modele.MementoExoplanete;



@SuppressWarnings("serial")
public class FenetrePrincipale extends JFrame
{
	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	JPanel jp4;
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
		jp2 = new JPanel();
		jp3 = new JPanel(new GridLayout(30,0));
		jp4 = new JPanel(new GridLayout(30,0));
		
		new GroupLayout(jp1);
		new GroupLayout(jp2);
		
		/*
		jp1Scroll = new JScrollPane(jp1);
		jp1Scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Dimension dimension = new Dimension(100,100);
		jp1Scroll.setPreferredSize(dimension);
		*/
		
		jtp.addTab("Liste d'exoplanètes", jp1);
		jtp.addTab("Mémento", jp2);
		jtp.addTab("Recherche Robot", jp3);
		jtp.addTab("Recherche Humain", jp4);
		
		
		setSize(600, 1000);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void afficherExoplanetes(String[] planeteString, ActionListener action[]) throws IOException
	{
		jp1.removeAll();
		Image img = ImageIO.read(getClass().getResource("../ressources/icone-sauvegarder2.png"));
		for(int i = 0; i<planeteString.length;i++)
		{
			JButton bouton = new JButton(new ImageIcon(img));
			bouton.setMargin(new Insets(0, 0, 0, 0));
			bouton.addActionListener(action[i]);
			
			jp1.add(new JLabel(planeteString[i]));
			jp1.add(bouton);
		}
		jp1.revalidate();
	}
	
	public void afficherExoplanetesRechercheRobot(String[] planeteString)
	{
		jp3.removeAll();
		for(int i = 0; i<planeteString.length;i++)
		{
			jp3.add(new JLabel(planeteString[i]));
		}
		jp3.revalidate();
	}
	
	public void afficherExoplanetesRechercheHumain(String[] planeteString)
	{
		jp4.removeAll();
		for(int i = 0; i<planeteString.length;i++)
		{
			jp4.add(new JLabel(planeteString[i]));
		}
		jp4.revalidate();
	}
	
	public void afficherMemento(LinkedHashMap<Long, MementoExoplanete> planetes)
	{
		jp2.removeAll();
		for(Long key : planetes.keySet()){
			jp2.add(new JTextField(planetes.get(key).getExoplanete().getInfos()));
		}
		jp2.revalidate();
		jp2.repaint();
	}

}
