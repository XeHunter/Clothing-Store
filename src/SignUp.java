import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class SignUp implements ActionListener {

	JFrame frame = new JFrame();
	JLabel user = new JLabel("Username");
	JLabel pass = new JLabel("Password");
	JLabel confirm = new JLabel("Confirm Password");
	JLabel l1;
	ImageIcon img;
	JLabel l2;
	JTextField usertext = new JTextField();
	JPasswordField passfield = new JPasswordField();
	JPasswordField confirmfield = new JPasswordField();
	JLabel msg = new JLabel(); 
	JLabel msg1 = new JLabel(); 
	JButton btn = new JButton("Reveal Passwords");
	JButton sign = new JButton("Sign Up");
	JPanel pan = new JPanel();
	JLabel title = new JLabel("Group 19 Clothing Store");

	SignUp(){
		
		frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\1.png")));
		l1 = new JLabel();
		
		img = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\2.png"); 
		l2 = new JLabel(img);
		l2.setBounds(700,30,200,200);
		
		user.setBounds(625,400,75,25);
		user.setForeground(Color.white);
		
		pass.setBounds(625,450,75,25);
		pass.setForeground(Color.white);
		
		confirm.setBounds(625,500,200,25);
		confirm.setForeground(Color.white);
		
		usertext.setBounds(750,400,200,25);
		passfield.setBounds(750,450,200,25);
		confirmfield.setBounds(750,500,200,25);
		
		msg.setBounds(950,450,200,25);
		msg.setFont(new Font(null,Font.PLAIN,25));
		
		msg1.setBounds(950,500,200,25);
		msg1.setFont(new Font(null,Font.PLAIN,25));
		
		btn.setBounds(635,550,150,50);
		btn.setFocusable(false);
		btn.addActionListener(this);
		
		sign.setBounds(785,550,150,50);
		sign.setFocusable(false);
		sign.addActionListener(this);
		
		title.setBounds(530,200,800,100);
		title.setFont(new Font("TIMES_NEW_ROMAN",Font.BOLD,50));
		Color logoYellow = new Color(255,160,14);
		title.setForeground(logoYellow);
		
		pan.setBounds(520,205,600,100);
		pan.setBackground(Color.black);
		
		frame.add(user);
		frame.add(pass);
		frame.add(confirm);
		frame.add(l1);
		frame.add(l2);
		frame.add(usertext);
		frame.add(passfield);
		frame.add(confirmfield);
		frame.add(msg);
		frame.add(msg1);
		frame.add(btn);
		frame.add(title);
		frame.add(pan);
		frame.add(sign);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1542,825);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn)
		{
			String pass = String.valueOf(passfield.getPassword());
			String conf = String.valueOf(confirmfield.getPassword());
			
			msg.setForeground(Color.white);
			msg.setText(pass);
			msg1.setForeground(Color.white);
			msg1.setText(conf);
			
		}
		if(e.getSource() == sign)
		{
			String userID = usertext.getText();
			String pass = String.valueOf(passfield.getPassword());
			System.out.println(userID+pass);
			IDandPasswords obj = new IDandPasswords(userID,pass);
			LoginPage lp = new LoginPage(obj.logininfo);
			
			frame.dispose();
		}
		
	}

}
