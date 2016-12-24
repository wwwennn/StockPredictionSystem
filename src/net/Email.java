package net;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
//import org.demo.form.DemoForm;

public class Email {

	private static final String CONTENT_TYPE = "test/html;charset=GB2312";
	
	public void sendEmail(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response){
		try {
			response.setContentType(CONTENT_TYPE);
			String smtphost = "hotmail.com"; // �����ʼ�������
			String user = "karlcassnet"; // �ʼ���������¼�û���
			String password = "NJU2014KC"; // �ʼ���������¼����
			String from = "karlcassnet@hotmail.com"; // 
			String to = "309146375@qq.com"; // �ռ����ʼ���ַ
//			String subject = demoForm.getBiaoti(); // �ʼ�����
//			String body = demoForm.getNeirong(); // �ʼ�����
			Properties props = new Properties();
			props.put("mail.smtp.host", smtphost);
			props.put("mail.smtp.auth", "true");
			Session ssn = Session.getInstance(props, null);


			MimeMessage message = new MimeMessage(ssn);


			InternetAddress fromAddress = new InternetAddress(from);
			message.setFrom(fromAddress);
			InternetAddress toAddress = new InternetAddress(to);
			message.addRecipient(Message.RecipientType.TO, toAddress);
			message.setSubject("Hello");
			message.setText("Welcome");
			Transport transport = ssn.getTransport("smtp");

			transport.connect(smtphost, user, password);

			transport.sendMessage(message, message
			.getRecipients(Message.RecipientType.TO));
			// transport.send(message);
			transport.close();
//			return mapping.findForward("succ");
			} catch (Exception e) {
			e.printStackTrace();
//			return mapping.findForward("fail");
			}
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
	}

}
