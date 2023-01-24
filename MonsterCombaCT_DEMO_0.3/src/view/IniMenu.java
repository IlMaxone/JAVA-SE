package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import m.AvvioGioco;
import m.ModalitàGioco;

public class IniMenu extends BackgroundImage
{
	private AvvioGioco avg1 = new AvvioGioco();
	private ModalitàGioco m1 = new ModalitàGioco();
	private BackgroundImage pic = new BackgroundImage();
	//Sfondo img = new Sfondo();
	JLabel screen = new JLabel();
	JButton b1 = new JButton("Gioco Classico");
	JButton b2 = new JButton("Zombie Mode");
	JButton b3 = new JButton("Day Time Only");
	JButton b4 = new JButton("Esci Dal Gioco");
	
	//private JFrame f;
	private JPanel panel;
	
	public IniMenu()
	{
		//this.f = new JFrame("Monster CombaCT Demo " + avg1.getVersion());
		this.panel = new JPanel();
	}
	
	public void Setup()
	{
		f.setSize(1920,1080);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(pic);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		b2.addActionListener(new ClickButton2());
		b3.addActionListener(new CGame());
		b4.addActionListener(new ExitButton());
		f.setSize(1920,1080);
		f.add(panel);
		//f.setContentPane(panel);
		panel.setLayout(null);
		//panel.setBackground(new Color(255, 179, 102));
		//panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void buttons()
	{
		screen.setFont(new Font("Tahoma",Font.BOLD,40));
		screen.setBounds(0, 0, 400, 100);
		panel.add(screen);
		
		b1.setFont(new Font("Tahoma",Font.BOLD,20));
		b1.setBounds(200, 500, 200, 50);
		panel.add(b1);
		b1.addActionListener(new CGame());
		
		b2.setFont(new Font("Tahoma",Font.BOLD,20));
		b2.setBounds(420, 500, 200, 50);
		panel.add(b2);
		
		b3.setFont(new Font("Tahoma",Font.BOLD,20));
		b3.setBounds(640, 500, 200, 50);
		panel.add(b3);
		
		b4.setFont(new Font("Tahoma",Font.BOLD,20));
		b4.setBounds(860, 500, 200, 50);
		panel.add(b4);
	}
	
	public static void main(String[] args) 
	{
		IniMenu mu = new IniMenu();
		
		mu.Setup();
		mu.buttons();
	}
	
	public class ClickButton2 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			screen.setText(e.getActionCommand());
		}
	}
	
	public class ExitButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e){
			/*WindowEvent cw = new WindowEvent(f, WindowEvent.WINDOW_CLOSED);
			Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(cw);*/
			Timer time = new Timer(500,this);
			time.start();
            Container frame = b4.getParent();
            do 
                frame = frame.getParent(); 
            while (!(frame instanceof JFrame));                                      
            ((JFrame) frame).dispose();
        }
	}
	
	public class CGame implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
		    f.setVisible(false);
		    window2 w2 = new window2();
		    w2.showWindows();
		}
	}
	
	public class window2
	{
		public static void showWindows()
		{
			JFrame frame = new JFrame("Window 2");
			frame.setSize(1920,1080);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JButton back = new JButton();
			back.setBounds(860, 500, 200, 50);
			frame.getContentPane().add(back);
			back.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					IniMenu m1 = new IniMenu();
					m1.Setup();
					m1.buttons();
					
				}
			});
			
			frame.setVisible(true);
		}
	}
}
