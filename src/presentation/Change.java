package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Change {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Change window = new Change();
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
	public Change() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(85, 10, 330, 37);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_1.setBounds(85, 80, 101, 37);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(196, 80, 220, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u539F\u5BC6\u7801\uFF1A");
		label_2.setBounds(85, 127, 101, 37);
		frame.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 127, 220, 37);
		frame.getContentPane().add(textField_1);
		
		JLabel label_3 = new JLabel("\u65B0\u5BC6\u7801\uFF1A");
		label_3.setBounds(85, 174, 101, 37);
		frame.getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 174, 220, 37);
		frame.getContentPane().add(textField_2);
		
		JLabel label_4 = new JLabel("\u786E\u8BA4\u65B0\u5BC6\u7801\uFF1A");
		label_4.setBounds(85, 221, 101, 37);
		frame.getContentPane().add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 221, 220, 37);
		frame.getContentPane().add(textField_3);
		
		JButton button = new JButton("\u5B8C\u6210");
		button.setBounds(155, 291, 152, 37);
		frame.getContentPane().add(button);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(0, 0, 492, 422);
		frame.getContentPane().add(label_5);
	}
}
