package utils;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender{
	public static void sendEmail(String toEmail,String message){
		Properties props = new Properties();

		props.put("mail.transport.protocol","smtp");
		props.put("mail.smtp.auth","true");
		props.put("mail.smtp.starttls.enable","true");
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.port","587");

		Session session = Session.getInstance(props,new ImproAuthenticator());

		MimeMessage mm = new MimeMessage(session);
		
		try{
			mm.setFrom(new InternetAddress("impro.isrdc@gmail.com"));
			mm.setRecipient(Message.RecipientType.TO,
                         new InternetAddress(toEmail));
			mm.setSubject("Welcome to Impro");
			mm.setContent(message, "text/html");

			Transport.send(mm);
		}catch(MessagingException me){
			me.printStackTrace();	
		}
	}
}

class ImproAuthenticator extends Authenticator{
	public PasswordAuthentication getPasswordAuthentication(){
		return new PasswordAuthentication("impro.isrdc@gmail.com","AnoopIsrdc22");
	}
}