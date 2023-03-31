import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;

public class WelcomePage implements ActionListener {

	private static final String String = null;
	JFrame frame = new JFrame();
	Icon i1 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\4.png");
	JButton b2 = new JButton(i1);
	JPanel panel = new JPanel();
	JButton shirt = new JButton("Tops");
	JButton pants = new JButton("Bottoms");
	JButton formals = new JButton("Formals");
	JButton ethnics = new JButton("Ethnics");
	JButton acce = new JButton("Accessories");
	JLabel l2;
	ImageIcon i2;
	JLabel l3;
	JLabel title = new JLabel("Group 19 Clothing Store");
	JPanel pan = new JPanel();

	
	WelcomePage(){
		
	}
	
	WelcomePage(String userID){	
		 
		
		i2 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\2.png"); 
		l3 = new JLabel(i2);
		l3.setBounds(700,30,200,200);
		
		title.setBounds(530,200,800,100);
		title.setFont(new Font("TIMES_NEW_ROMAN",Font.BOLD,50));
		Color logoYellow = new Color(255,160,14);
		title.setForeground(logoYellow);
		
		pan.setBounds(520,205,600,100);
		pan.setBackground(Color.black);
		
		shirt.setBounds(520,310,150,50);
		shirt.setFocusable(false);
		shirt.addActionListener(this);
		
		pants.setBounds(720,310,150,50);
		pants.setFocusable(false);
		pants.addActionListener(this);
		
		formals.setBounds(920,310,150,50);
		formals.setFocusable(false);
		formals.addActionListener(this);
		
		ethnics.setBounds(620,510,150,50);
		ethnics.setFocusable(false);
		ethnics.addActionListener(this);
		
		acce.setBounds(820,510,150,50);
		acce.setFocusable(false);
		acce.addActionListener(this);
		
		frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\1.png")));
		l2 = new JLabel();
		
		b2.setBounds(1480,10,40,40);
		b2.setFocusable(false);
		b2.addActionListener(this);
				
		frame.add(b2);
		frame.add(shirt);
		frame.add(pants);
		frame.add(formals);
		frame.add(ethnics);
		frame.add(acce);
		frame.add(l3);
		frame.add(title);
		frame.add(pan);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1542,825);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == b2 )
		{
			LoginPage loginpage = new LoginPage(null);
			frame.dispose();
		}
		
		if(e.getSource() == shirt)
		{
			Tops top = new Tops();
			frame.dispose();
		}
		
		if(e.getSource() == pants)
		{
			Bottoms down = new Bottoms();
			frame.dispose();
		}
		
		if(e.getSource() == formals)
		{
			Formals form = new Formals();
			frame.dispose();
		}
		
		if(e.getSource() == ethnics)
		{
			Ethnics eth = new Ethnics();
			frame.dispose();
		}
		
		if(e.getSource() == acce)
		{
			Accessories acc = new Accessories();
			frame.dispose();
		}
		
	}
	
}
