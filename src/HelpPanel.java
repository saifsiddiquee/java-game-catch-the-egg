import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import com.sun.corba.se.impl.protocol.BootstrapServerRequestDispatcher;

///////////////////////////////// Help Panel \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
class HelpPanel extends JPanel{

	Image helpbkg = new ImageIcon("src/images/helpbkg.png").getImage(); //help image background
	JButton back = new JButton(""); //back button
	ImageIcon backbtn = new ImageIcon("src/buttons/back.png");

	HelpPanel()
	{
		back.setIcon(backbtn);
		setFocusable(true); //setting the focus
		add(back);			//adding back button in the panel
		
		back.addMouseListener(new MouseAdapter()
		  {
			public void mouseClicked(MouseEvent me)
			{
				CteGame.cl.show(CteGame.cards, "MenuPanel"); // show menuPanel when back button is clicked
			}	
		  });
	}//end constructor
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(helpbkg, 0,0, null); // draw help background
		repaint();
	}//end paintComponent
}//end class
