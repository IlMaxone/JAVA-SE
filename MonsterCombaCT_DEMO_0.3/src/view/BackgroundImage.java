package view;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BackgroundImage extends JPanel
{
	private Image pic;
	JFrame f = new JFrame("Monster Combact DEMO 0.3");
	
	public BackgroundImage()
	{
		ImageIcon obj = new ImageIcon("img/m1a.png");
		setPic(obj.getImage());
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(pic,0,0,null);
		
	}
	
	public void visualizzaImmagine()
	{
		JFrame f = new JFrame("Background Image");
		BackgroundImage pic = new BackgroundImage();
	}

	public Image getPic() {
		return pic;
	}

	public void setPic(Image pic) {
		this.pic = pic;
	}
	
	
}
