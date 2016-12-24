package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField idField;
	private JTextField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel logoLabel = new JLabel("");
		logoLabel.setBounds(85, 10, 330, 37);
		frame.getContentPane().add(logoLabel);
		
		JLabel userName = new JLabel("\u7528\u6237\u540D\uFF1A");
		userName.setBounds(97, 81, 97, 37);
		frame.getContentPane().add(userName);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801\uFF1A");
		label_2.setBounds(97, 128, 97, 37);
		frame.getContentPane().add(label_2);
		
		idField = new JTextField();
		idField.setBounds(224, 81, 172, 37);
		frame.getContentPane().add(idField);
		idField.setColumns(10);
		
		passField = new JTextField();
		passField.setColumns(10);
		passField.setBounds(224, 128, 172, 37);
		frame.getContentPane().add(passField);
		
		JButton forget = new JButton("\u5FD8\u8BB0\u5BC6\u7801");
		forget.setBounds(97, 201, 97, 37);
		frame.getContentPane().add(forget);
		
		JButton change = new JButton("\u4FEE\u6539\u5BC6\u7801");
		change.setBounds(279, 201, 97, 37);
		frame.getContentPane().add(change);
		
		JButton login = new JButton("\u767B\u5F55");
		login.setBounds(184, 265, 97, 37);
		frame.getContentPane().add(login);
		
		JLabel label_3 = new JLabel("\u8FD8\u4E0D\u662F\u4F1A\u5458\uFF1F");
		label_3.setBounds(271, 332, 132, 30);
		frame.getContentPane().add(label_3);
		
		JButton regest = new JButton("\u6CE8\u518C");
		regest.setBounds(367, 332, 76, 30);
		frame.getContentPane().add(regest);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 492, 372);
		frame.getContentPane().add(label);
	}
}
