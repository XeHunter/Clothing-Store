import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class LoginPage implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField  idField = new JTextField();
	JPasswordField pass = new JPasswordField(); 
	JLabel userLabel = new JLabel("UserID:");
	JLabel passLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();
	JLabel l2;
	JLabel title = new JLabel("Group 19 Clothing Store");
	JPanel pan = new JPanel();
	JLabel img1;
	ImageIcon img;
	JButton su = new JButton("Sign Up"); 
	
	HashMap<String,String> logininfo = new HashMap<String,String>();

	LoginPage(HashMap<String,String>loginInfoOriginal){
	
		logininfo = loginInfoOriginal;
		
		userLabel.setBounds(650,400,75,25);
		userLabel.setForeground(Color.white);
		passLabel.setBounds(650,450,75,25);
		passLabel.setForeground(Color.white);
		
		messageLabel.setBounds(670,610,250,25);
		messageLabel.setFont(new Font(null,Font.PLAIN,25));
		
		idField.setBounds(725,400,200,25);
		pass.setBounds(725,450,200,25);
		
		loginButton.setBounds(650,500,136,50);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(786,500,136,50);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\1.png")));
		l2 = new JLabel();
		
		title.setBounds(530,200,800,100);
		title.setFont(new Font("TIMES_NEW_ROMAN",Font.BOLD,50));
		Color logoYellow = new Color(255,160,14);
		title.setForeground(logoYellow);
		
		pan.setBounds(520,205,600,100);
		pan.setBackground(Color.black);
		
		img = new ImageIcon("C:\\Users\\aryan\\aryan_java\\Microproject\\Images\\2.png"); 
		img1 = new JLabel(img);
		img1.setBounds(700,30,200,200);
		
		su.setBounds(720,550,136,50);
		su.setFocusable(false);
		su.addActionListener(this);
		
		frame.add(l2);
		frame.add(userLabel);
		frame.add(passLabel);
		frame.add(messageLabel);
		frame.add(idField);
		frame.add(pass);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(title);
		frame.add(pan);
		frame.add(img1);
		frame.add(su);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1542,825);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			
			idField.setText("");
			pass.setText("");
			
		}
		
		if(e.getSource()==loginButton) {
			
			String userID = idField.getText();
			String password = String.valueOf(pass.getPassword());
			
			if(logininfo.containsKey(userID)) {
				
				if(logininfo.get(userID).equals(password)) {
					
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					WelcomePage wp = new WelcomePage(userID);
					frame.dispose();
					
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong Password");
				}
				
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username Not Found");
			
			}
		
		}
		
		if(e.getSource()==su) {
			
			SignUp su = new SignUp();
			frame.dispose();			
		}
	
	}
	
}
