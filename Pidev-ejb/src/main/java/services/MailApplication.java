package services;
import java.io.Serializable;
import java.util.Properties;
import javax.mail.internet.AddressException;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;

import javax.mail.Transport;
public class MailApplication implements Serializable  {
	public void sendEmail(String from ,String to ,String subject , String msg) throws AddressException, MessagingException
	   {
		
		   Properties props  = System.getProperties();
		   props.put("mail.smtp.host","in-v3.mailjet.com");
		   props.put("mail.smtp.auth","true");
		   props.put("mail.smtp.port","25");
		   /*props.put("mail.smtp.socketFactory.class","javax.ssl.SSLSocketFactory");
		   props.put("mail.smtp.socketFactory.port","465");
		   props.put("mail.smtp.socketFactory.fallback","false");*/
		   
		   Session mailSession = Session.getDefaultInstance(props,null);
		   mailSession.setDebug(true);
		   
		   Message mailMessage = new MimeMessage(mailSession);
		   mailMessage.setFrom(new InternetAddress(from));
		   mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		   //mailMessage.setDescription(msg);
		   mailMessage.setContent(msg,"text/html; charset=utf-8");
		   mailMessage.setSubject(subject);
		   
		   Transport transport = mailSession.getTransport("smtp");
		   transport.connect("in-v3.mailjet.com","4c303ffc078d798ade07898fbdd10547","db58e0cfc5cb9787561f742a1fe3b7d9");
	       transport.sendMessage(mailMessage,mailMessage.getAllRecipients());

	   }
}
