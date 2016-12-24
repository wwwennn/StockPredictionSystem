package presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import swingExtend.AllStock;
import swingExtend.MyStock;
import swingExtend.Predict;

public class MainBoard {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	Predict pre=new Predict();
	AllStock all=new AllStock();
	MyStock mystock=new MyStock();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBoard window = new MainBoard();
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
	public MainBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		mystock.setVisible(true);
//		mystock.start();
		Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Simon\\Desktop\\logo.png"));
		frame.setBounds(screenSize.width/2-450, screenSize.height/2-300, 900, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO 自动生成的方法存根
				int x=e.getX();
				int y=e.getY();
//				if()
			}
			
		});
		
		JLabel lblKarlcass = new JLabel("KarlCass股票预测系统",JLabel.CENTER);
		lblKarlcass.setBounds(0, 0, 892, 40);
		frame.getContentPane().add(lblKarlcass);
		
		final JButton current = new JButton("\u5B9E\u65F6\u884C\u60C5");
		final JButton predict = new JButton("\u80A1\u7968\u9884\u6D4B");
		final JButton my = new JButton("\u6211\u7684\u80A1\u6C60");
		final JButton about = new JButton("\u5173\u4E8E\u6211\u4EEC");
//		current.setVisible(false);
//		current.setBorderPainted(false);
//		current.setFocusable(false);
//		current.setOpaque(false);
		current.setIcon(null);
		current.setBounds(21, 50, 131, 40);
		current.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
//				current.setIcon(new ImageIcon("image\\current.png"));
//				about.setIcon(new ImageIcon("image\\aboutOn.png"));
//				predict.setIcon(new ImageIcon("image\\predictOn.png"));
//				my.setIcon(new ImageIcon("image\\myOn.png"));
//				choose.setIcon(new ImageIcon("image\\chooseOn.png"));
				all.setVisible(true);
				pre.setVisible(false);
				mystock.setVisible(false);
				all.start();
				frame.getContentPane().add(all);
				all.setBounds(0, 76, 892, 466);
			}
			
		});
		frame.getContentPane().add(current);
		
		
//		predict.setBorderPainted(false);
//		predict.setFocusable(false);
//		predict.setOpaque(false);
		predict.setIcon(null);
		predict.setBounds(151, 50, 131, 40);
		predict.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
//				predict.setIcon(new ImageIcon("image\\predict.png"));
//				current.setIcon(new ImageIcon("image\\currentOn.png"));
//				about.setIcon(new ImageIcon("image\\aboutOn.png"));
//				my.setIcon(new ImageIcon("image\\myOn.png"));
//				choose.setIcon(new ImageIcon("image\\chooseOn.png"));
				pre.setVisible(true);
				mystock.setVisible(false);
				all.setVisible(false);
//				all.start();
				frame.getContentPane().add(pre);
				pre.setBounds(0, 76, 892, 466);
			}
			
		});
		frame.getContentPane().add(predict);
		
		
//		my.setBorderPainted(false);
//		my.setFocusable(false);
//		my.setOpaque(false);
		my.setIcon(null);
		my.setBounds(280, 50, 131, 40);
		my.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
//				my.setIcon(new ImageIcon("image\\my.png"));
//				current.setIcon(new ImageIcon("image\\currentOn.png"));
//				about.setIcon(new ImageIcon("image\\aboutOn.png"));
//				predict.setIcon(new ImageIcon("image\\predictOn.png"));
//				choose.setIcon(new ImageIcon("image\\chooseOn.png"));
				all.setVisible(false);
				pre.setVisible(false);
				mystock.setVisible(true);
				mystock.start();
				frame.getContentPane().add(mystock);
				mystock.setBounds(0, 76, 892, 466);
				
			}
			
		});
		frame.getContentPane().add(my);
		
		
//		about.setBorderPainted(false);
//		about.setFocusable(false);
//		about.setOpaque(false);
		about.setIcon(null);
		about.setBounds(409, 50, 131, 40);
		about.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
//				about.setIcon(new ImageIcon("image\\about.png"));
//				current.setIcon(new ImageIcon("image\\currentOn.png"));
//				predict.setIcon(new ImageIcon("image\\predictOn.png"));
//				my.setIcon(new ImageIcon("image\\myOn.png"));
//				choose.setIcon(new ImageIcon("image\\chooseOn.png"));
			}
			
		});
		frame.getContentPane().add(about);
		
//		JPanel panel = new JPanel();
//		panel.setOpaque(false);
//		panel.setBounds(0, 96, 892, 466);
//		frame.getContentPane().add(panel);
//		panel.setLayout(null);
//		
//		JComboBox comboBox = new JComboBox();
//		comboBox.setBounds(23, 10, 190, 25);
//		comboBox.setOpaque(false);
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u9009\u62E9\u80A1\u7968\u79CD\u7C7B"}));
//		panel.add(comboBox);
//		
//		JComboBox comboBox_1 = new JComboBox();
//		comboBox_1.setBounds(236, 10, 190, 25);
//		comboBox_1.setOpaque(false);
//		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u9009\u62E9\u80A1\u7968\u884C\u4E1A"}));
//		panel.add(comboBox_1);
//		
//		JLabel lblS = new JLabel("\u641C\u7D22");
//		lblS.setBounds(445, 10, 31, 25);
//		lblS.setForeground(UIManager.getColor("menu"));
//		panel.add(lblS);
//		
//		JButton search = new JButton("");
//		search.setBounds(478, 10, 31, 25);
//		search.setVisible(false);
//		panel.add(search);
//		
//		textField = new JTextField();
//		textField.setBounds(509, 10, 130, 25);
//		panel.add(textField);
//		textField.setColumns(10);
//		
//		JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(23, 45, 850, 411);
//		scrollPane.getViewport().setOpaque(false);
//		panel.add(scrollPane);
//		
//		table = new JTable();
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//			},
//			new String[] {
//				"\u80A1\u7968\u4EE3\u7801", "\u540D\u79F0", "\u73B0\u4EF7", "\u6628\u6536", "\u6DA8\u8DCC", "\u5F00\u76D8", "\u6700\u9AD8", "\u6700\u4F4E", "\u6210\u4EA4\u91CF", "\u6210\u4EA4\u91D1\u989D"
//			}
//		));
//		scrollPane.setViewportView(table);
//		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
//        render.setOpaque(false);
//		
//        table.setOpaque(false);
//        table.setDefaultRenderer(Object.class,render);
//        
//		JLabel label_1 = new JLabel()
//		{
//			/**
//			 * 
//			 */
//			private static final long serialVersionUID = -7657578093024207902L;
//
//			protected void paintComponent(Graphics g) {
//				// TODO Auto-generated method stub
//				// super.paintComponent(g);
//				ImageIcon img = new ImageIcon("image\\background.png");
//				g.drawImage(img.getImage(), 0, 0, 900,600,this);
//			}
//		}
//		;
//		Color colorB=new Color(35,35,35);
//		label_1.setOpaque(true);
//		label_1.setBackground(colorB);
		
//		label_1.setBounds(0, 0, 892, 572);
//		frame.getContentPane().add(label_1);
	}
}
