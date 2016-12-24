package swingExtend;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.Crawl;

public class Predict extends JPanel{
	
	JTable table = new JTable();
	
	public Predict(){
		this.setBounds(0,76, 892, 466);
		this.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 40, 446, 428);
		this.add(scrollPane);
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"股票代码", "股票名称","预测最高价", "预测最低价", "预测平均值"
			}
		));
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		tableModel.addRow(new Object[]{"sh600000","浦发银行",10.0991,9.7688,10.4314});
		scrollPane.setViewportView(table);
		
		table.setRowHeight(20);
		
		JLabel label_1 = new JLabel("\u672A\u6765\u4E94\u65E5\u8D70\u52BF\u9884\u6D4B",JLabel.CENTER);
		label_1.setFont(new Font("宋体", Font.PLAIN, 14));
		label_1.setBounds(0, 12, 446, 36);
		this.add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("image\\sh600000\\example.png"));
		label.setBounds(444, 42, 430, 400);
		this.add(label);
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
//			while((content =line.readLine()) != null){
//				String currentStock=Crawl.getStock(content);
//				String[] stockInfo=currentStock.split("\"");
//				String[] stockData=stockInfo[1].split(",");
//				float fluct=Float.parseFloat(stockData[3])-Float.parseFloat(stockData[2]);;
//				tableModel.addRow(new Object[]{content,stockData[0],up,down,r});
//			}
			 tableModel.addRow(new Object[]{"sh600000","浦发银行",10.0991,9.7688,10.4314});
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
