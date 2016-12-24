package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Regist {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regist window = new Regist();
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
	public Regist() {
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
		
		JLabel label_1 = new JLabel("\u90AE\u7BB1\uFF1A");
		label_1.setBounds(85, 59, 101, 37);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(196, 57, 220, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u7528\u6237\u540D\uFF1A");
		label_2.setBounds(85, 106, 101, 37);
		frame.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 104, 220, 37);
		frame.getContentPane().add(textField_1);
		
		JLabel label_3 = new JLabel("\u5BC6\u7801\uFF1A");
		label_3.setBounds(85, 153, 101, 37);
		frame.getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(196, 151, 220, 37);
		frame.getContentPane().add(textField_2);
		
		JLabel label_4 = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		label_4.setBounds(85, 200, 101, 37);
		frame.getContentPane().add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 198, 220, 37);
		frame.getContentPane().add(textField_3);
		
		JLabel label_5 = new JLabel("\u8F93\u5165\u9A8C\u8BC1\u7801");
		label_5.setBounds(85, 247, 101, 37);
		frame.getContentPane().add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(195, 245, 110, 37);
		frame.getContentPane().add(textField_4);
		
		JButton button = new JButton("\u53D1\u9001\u9A8C\u8BC1\u7801");
		button.setBounds(315, 245, 101, 37);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u5B8C\u6210\u6CE8\u518C");
		button_1.setBounds(196, 317, 101, 37);
		frame.getContentPane().add(button_1);
	}

}
