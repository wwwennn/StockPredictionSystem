package swingExtend;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import net.Crawl;

public class AllStock extends JPanel{
	JTable table = new JTable();
	JPopupMenu m_popupMenu=new JPopupMenu();
	int row=0;
	
	public AllStock(){
		this.setOpaque(false);
		this.setBounds(0, 76, 892, 466);
//		frame.getContentPane().add(panel);
		this.setLayout(null);
		
//		JComboBox comboBox = new JComboBox();
//		comboBox.setBounds(23, 10, 190, 25);
//		comboBox.setOpaque(false);
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u9009\u62E9\u80A1\u7968\u79CD\u7C7B"}));
//		this.add(comboBox);
//		
//		JComboBox comboBox_1 = new JComboBox();
//		comboBox_1.setBounds(236, 10, 190, 25);
//		comboBox_1.setOpaque(false);
//		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u9009\u62E9\u80A1\u7968\u884C\u4E1A"}));
//		this.add(comboBox_1);
//		
//		JLabel lblS = new JLabel("\u641C\u7D22");
//		lblS.setBounds(445, 10, 31, 25);
//		lblS.setForeground(UIManager.getColor("menu"));
//		this.add(lblS);
//		
//		JButton search = new JButton("");
//		search.setBounds(478, 10, 31, 25);
////		search.setVisible(false);
//		this.add(search);
//		
//		JTextField textField = new JTextField();
//		textField.setBounds(509, 10, 130, 25);
//		this.add(textField);
//		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 45, 850, 411);
		scrollPane.getViewport().setOpaque(false);
		this.add(scrollPane);
		
		createPopupMenu();
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u80A1\u7968\u4EE3\u7801", "\u540D\u79F0", "\u73B0\u4EF7", "\u6628\u6536", "\u6DA8\u8DCC", "\u5F00\u76D8", "\u6700\u9AD8", "\u6700\u4F4E", "\u6210\u4EA4\u91CF", "\u6210\u4EA4\u91D1\u989D"
			}
		));

		table.setRowHeight(20);
		
		table.addMouseListener(new MouseAdapter() {
	          public void mousePressed(MouseEvent e) {
	        	  row=e.getY()/table.getRowHeight();
	        	  if   (e.getButton()==e.BUTTON3)   { 
	        	  int focusedRowIndex = table.rowAtPoint(e.getPoint());  
	              if (focusedRowIndex == -1) {  
	                  return;  
	              }  
	              //将表格所选项设为当前右键点击的行  
	              table.setRowSelectionInterval(focusedRowIndex, focusedRowIndex);  
	              //弹出菜单  
	              m_popupMenu.show(table, e.getX(), e.getY());  
//	              if (evt.getButton()==evt.BUTTON3) { 
//	            	  int row=evt.getY()/table.getRowHeight();
//	            	  showPopup(evt);
//	            	  System.out.println(row);
//	              }
	        	  }
	          } 
		});
		
		scrollPane.setViewportView(table);
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
        render.setOpaque(false);
		
        table.setOpaque(false);
        table.setDefaultRenderer(Object.class,render);
        
	}
	
    private void createPopupMenu() {  
        m_popupMenu = new JPopupMenu();  
//        final int row=e.getY()/table.getRowHeight();
        JMenuItem delMenItem = new JMenuItem();  
        delMenItem.setText("  加入我的股池  ");  
        delMenItem.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {  
                //该操作需要做的事  
                try {
                	File file=new File("mystock.txt");
        			InputStreamReader read = new InputStreamReader( new FileInputStream(file));
	       			 BufferedReader line = new BufferedReader(read);
	       			 String content=null;
	       			 while((content=line.readLine())!=null){
	       				 if(content.equals(table.getValueAt(row, 0))){
	       					JOptionPane.showMessageDialog(null,"您已关注此股票！");
	       					break;
	       				 }
	       			 }
					FileWriter writer=new FileWriter("mystock.txt",true);
					String stock=(String) table.getValueAt(row, 0);
					writer.write(stock);
					writer.write("\r\n");
					writer.flush();
					writer.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
            }  
        });  
        m_popupMenu.add(delMenItem);  
    }  
	
	public void start(){
		int count=table.getRowCount();
		((DefaultTableModel) table.getModel()).setRowCount(0);
		File file=new File("code.txt");
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
//		tableModel.addRow(new Object[]{"col1","col2","coln"});
		try {
			InputStreamReader read = new InputStreamReader( new FileInputStream(file));
			 BufferedReader line = new BufferedReader(read);
			 String content=null;
			while((content =line.readLine()) != null){
				String currentStock=Crawl.getStock(content);
				String[] stockInfo=currentStock.split("\"");
				String[] stockData=stockInfo[1].split(",");
				float fluct=Float.parseFloat(stockData[3])-Float.parseFloat(stockData[2]);;
				tableModel.addRow(new Object[]{content,stockData[0],stockData[3],stockData[2],fluct,stockData[1],stockData[4],stockData[5],stockData[8],stockData[9]});
			}
			 
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
