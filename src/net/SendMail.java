package net;

public class SendMail {
	 public static void main(String[] args) {  
	        SendMail.sendMail();  
	    }  
	      
	    // 163邮箱  
	    public static void sendMail() {  
	        // 这个类主要是设置邮件  
	        MailSenderInfo mailInfo = new MailSenderInfo();  
	        mailInfo.setMailServerHost("smtp.gmail.com");  
	        mailInfo.setMailServerPort("25");  
	        mailInfo.setValidate(true);  
	        mailInfo.setUserName("karlcassnet@gmail.com"); // 实际发送者  
	        mailInfo.setPassword("NJU2014KC");// 您的邮箱密码  
	        mailInfo.setFromAddress("karlcassnet@gmail.com"); // 设置发送人邮箱地址  
	        mailInfo.setToAddress("wsf12@software.nju.edu.cn"); // 设置接受者邮箱地址  
	        mailInfo.setSubject("KarlCass验证消息");  
	        int verify=(int)(Math.random()*100000);
	        String verifyStr=String.valueOf(verify);
	        StringBuffer textbuf = new StringBuffer();
	        textbuf.append("\r\n");
	        mailInfo.setContent("尊敬的用户您好！欢迎使用KarlCass系统！"+textbuf+"注册验证码如下："+verifyStr+textbuf+"如有疑问请邮件咨询karlcassnet@gmail.com"+textbuf+"祝您体验愉快！"+textbuf+"KarlCass");  
	        // 这个类主要来发送邮件  
	        SimpleMailSender sms = new SimpleMailSender();  
	        sms.sendTextMail(mailInfo); // 发送文体格式  
//	        sms.sendHtmlMail(mailInfo); // 发送html格式  
	    }  
}
