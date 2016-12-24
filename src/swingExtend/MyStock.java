package swingExtend;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import net.Crawl;

public class MyStock extends JPanel{
	
	JTable table = new JTable();
	public MyStock(){
		this.setOpaque(false);
		this.setBounds(0, 76, 892, 466);
//		frame.getContentPane().add(panel);
		this.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 45, 850, 411);
		scrollPane.getViewport().setOpaque(false);
		this.add(scrollPane);
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u80A1\u7968\u4EE3\u7801", "\u540D\u79F0", "\u73B0\u4EF7", "\u6628\u6536", "\u6DA8\u8DCC", "\u5F00\u76D8", "\u6700\u9AD8", "\u6700\u4F4E", "\u6210\u4EA4\u91CF", "\u6210\u4EA4\u91D1\u989D"
			}
		));
		
		scrollPane.setViewportView(table);
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
        render.setOpaque(false);
		
        table.setRowHeight(20);
        
        table.setOpaque(false);
        table.setDefaultRenderer(Object.class,render);
        
	}
	
	public void start(){
		int count=table.getRowCount();
		((DefaultTableModel) table.getModel()).setRowCount(0);
		File file=new File("mystock.txt");
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
