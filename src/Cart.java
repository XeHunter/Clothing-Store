import java.awt.Component;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Cart implements ActionListener{

	JFrame frame = new JFrame();
	ImageIcon img;
	JLabel l1;
	JButton b1 = new JButton("Order");
	JButton b2 = new JButton("Back");
	JComboBox cb1;
	JComboBox cb2;
	JLabel msg = new JLabel();
	JLabel toit = new JLabel();
	
	Vector<String>item = new Vector<String>();
	Vector<String>cost = new Vector<String>();

	public void displayCart()
	{
   	
		img = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\2.png");
		l1 = new JLabel(img);
		l1.setBounds(700,30,200,200);
		
		cb1 = new JComboBox(item);
		cb1.setBounds(600,250,200,30);
		
		cb2 = new JComboBox(cost);
		cb2.setBounds(800,250,150,30);
		
		b1.setBounds(680,280,100,50);
		b1.setFocusable(false);
		b1.addActionListener(this);
		
		b2.setBounds(780,280,100,50);
		b2.setFocusable(false);
		b2.addActionListener(this);
		
		msg.setBounds(680,370,300,30);
		msg.setFont(new Font(null,Font.PLAIN,30));
		
		toit.setBounds(720,330,300,50);
		
		frame.add(l1);
		frame.add(cb1);
		frame.add(cb2);
		frame.add(b1);
		frame.add(b2);
		frame.add(msg);
		frame.add(toit);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1542,825);
		frame.setLayout(null);
		frame.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == b1)
		{
			
			int i = cb1.getItemCount();
			System.out.println(""+i);
			toit.setText(i+" items ordered.");
			
			msg.setText("Order Placed!");
			
		}
		
			
		if(e.getSource() == b2)
		{
			WelcomePage wp = new WelcomePage("1");
			frame.dispose();
		}
	}	
}
