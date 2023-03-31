import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Accessories implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ImageIcon i1 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\Accessories1.jpg");
	JButton btn1 = new JButton(i1); 
	ImageIcon i2 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\Accessories2.jpg");
	JButton btn2 = new JButton(i2); 
	ImageIcon i3 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\Accessories3.jpg");
	JButton btn3 = new JButton(i3); 
	ImageIcon i4 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\Accessories4.jpg");
	JButton btn4 = new JButton(i4);
	ImageIcon i5 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\Accessories5.jpg");
	JButton btn5 = new JButton(i5);
	ImageIcon i6 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\Accessories6.jpg");
	JButton btn6 = new JButton(i6);
	ImageIcon i7 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\Accessories7.jpg");
	JButton btn7 = new JButton(i7);    
	ImageIcon i8 = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\Accessories8.jpg");
	JButton btn8 = new JButton("Back");    
	JButton btn9 = new JButton(i8);  
	JTextField cloth = new JTextField();
	JButton cart = new JButton("Add");
	JLabel text = new JLabel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();
	JPanel p8 = new JPanel();
	JPanel p9 = new JPanel();
	String item = cloth.getText();
	WelcomePage wp = new WelcomePage();
	JTextField price = new JTextField();
	Icon img = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\3.png");
	JButton b1 = new JButton(img);
	
	Accessories()
	{
		btn1.setActionCommand("Wallet");
		btn2.setActionCommand("Waist Belt");
		btn3.setActionCommand("Deodarant");
		btn4.setActionCommand("Razor");
		btn5.setActionCommand("Tie");
		btn6.setActionCommand("Bow Tie");
		btn7.setActionCommand("Tie Attachment");
		btn9.setActionCommand("Combo");

		panel.setBounds(0,100,1542,725);
		
		btn1.setFocusable(false);
		btn1.addActionListener(this);
		btn2.setFocusable(false);
		btn2.addActionListener(this);
		btn3.setFocusable(false);
		btn3.addActionListener(this);
		btn4.setFocusable(false);
		btn4.addActionListener(this);
		btn5.setFocusable(false);
		btn5.addActionListener(this);
		btn6.setFocusable(false);
		btn6.addActionListener(this);
		btn7.setFocusable(false);
		btn7.addActionListener(this);
		btn8.setFocusable(false);
		btn8.addActionListener(this);
		btn9.setFocusable(false);
		btn9.addActionListener(this);
		
		btn8.setBounds(10,10,100,50);
		
		b1.setBounds(1430,10,40,40);
		b1.setFocusable(false);
		b1.addActionListener(this);
		
		cart.setBounds(850,5,100,30);
		cart.setFocusable(false);
		cart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae)
			{
				wp.CT.item.add(cloth.getText());
				wp.CT.cost.add(price.getText());
				text.setText("Item- "+cloth.getText()+" added to the cart");
			}
		});
	
		cloth.setBounds(625,5,150,30);
		price.setBounds(775,5,75,30);
		
		text.setBounds(625,45,800,20);
		text.setFont(new Font(null,Font.PLAIN,20));
		
		frame.add(text);
		frame.add(btn8);
			p1.setLayout(new FlowLayout());
			p1.add(btn1);
		panel.add(p1);
		panel.add(p2);
			p2.setLayout(new FlowLayout());
			p2.add(btn2);
		panel.add(p3);
			p3.setLayout(new FlowLayout());
			p3.add(btn3);
		panel.add(p4);
			p4.setLayout(new FlowLayout());
			p4.add(btn4);
		panel.add(p5);
			p5.setLayout(new FlowLayout());
			p5.add(btn5);
		panel.add(p6);
			p6.setLayout(new FlowLayout());
			p6.add(btn6);
		panel.add(p7);
			p7.setLayout(new FlowLayout());
			p7.add(btn7);
		panel.add(p8);
			p8.setLayout(new FlowLayout());
		panel.add(p9);
			p9.setLayout(new FlowLayout());
			p9.add(btn9);
		frame.add(panel);
		frame.add(cloth);
		frame.add(cart);
		frame.add(b1);
		frame.add(price);
		panel.setLayout(new GridLayout(3,3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1542,825);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		
		cloth.setText(ae.getActionCommand());
		
		if(ae.getSource() == btn8)
		{
			WelcomePage wp = new WelcomePage("1");
			frame.dispose();
		}
		
		if(ae.getSource() == b1)
		{
			wp.CT.displayCart();
			frame.dispose();
		}
	
		if(ae.getSource() == btn1)
		{
			price.setText("Rs.1019");
		}
	
		if(ae.getSource() == btn2)
		{
			price.setText("Rs.494");
		}
		
		if(ae.getSource() == btn3)
		{
			price.setText("Rs.149");
		}
		
		if(ae.getSource() == btn4)
		{
			price.setText("Rs.897");
		}
		
		if(ae.getSource() == btn5)
		{
			price.setText("Rs.353");
		}
		
		if(ae.getSource() == btn6)
		{
			price.setText("Rs.287");
		}
		
		if(ae.getSource() == btn7)
		{
			price.setText("Rs.379");
		}
		
		if(ae.getSource() == btn9)
		{
			price.setText("Rs.839");
		}	
		
	}
	
}