// Taha Zaryab
// GUI program that displays a login page where a user may enter a username and their password
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener {

	private static JLabel userLabel;
	private static JLabel passwordLabel;
	private static JLabel success;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JTextField userText;
	private static JPanel panel;
	private static JFrame frame;
	
	public static void main(String[] args) {
		
		panel = new JPanel();
		
		frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new Login());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		
		frame.setVisible(true);

	}

	@Override
	
	// Method that checks for the username and password. 
	// If they match, a message will indicate a successful login.
	// Vice versa, an incorrect login will have a message indicating an unsuccessful login.
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + ", "+ password);
		
		if(user.equals("Taha") && password.equals("soccer123")) {
			success.setText("Login successful!");
		}
		else {
			success.setText("Incorrect login, please try again.");
		}
	}

}
