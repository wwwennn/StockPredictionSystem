package net;

public class SendMail {
	 public static void main(String[] args) {  
	        SendMail.sendMail();  
	    }  
	      
	    // 163����  
	    public static void sendMail() {  
	        // �������Ҫ�������ʼ�  
	        MailSenderInfo mailInfo = new MailSenderInfo();  
	        mailInfo.setMailServerHost("smtp.gmail.com");  
	        mailInfo.setMailServerPort("25");  
	        mailInfo.setValidate(true);  
	        mailInfo.setUserName("karlcassnet@gmail.com"); // ʵ�ʷ�����  
	        mailInfo.setPassword("NJU2014KC");// ������������  
	        mailInfo.setFromAddress("karlcassnet@gmail.com"); // ���÷����������ַ  
	        mailInfo.setToAddress("wsf12@software.nju.edu.cn"); // ���ý����������ַ  
	        mailInfo.setSubject("KarlCass��֤��Ϣ");  
	        int verify=(int)(Math.random()*100000);
	        String verifyStr=String.valueOf(verify);
	        StringBuffer textbuf = new StringBuffer();
	        textbuf.append("\r\n");
	        mailInfo.setContent("�𾴵��û����ã���ӭʹ��KarlCassϵͳ��"+textbuf+"ע����֤�����£�"+verifyStr+textbuf+"�����������ʼ���ѯkarlcassnet@gmail.com"+textbuf+"ף��������죡"+textbuf+"KarlCass");  
	        // �������Ҫ�������ʼ�  
	        SimpleMailSender sms = new SimpleMailSender();  
	        sms.sendTextMail(mailInfo); // ���������ʽ  
//	        sms.sendHtmlMail(mailInfo); // ����html��ʽ  
	    }  
}
