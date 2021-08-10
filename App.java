package com.lcs;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class App 
{
//  String recipient = "yamabs@gmail.com ,priya@gmail.com ";
//  String[] recipientList = recipient.split(",");
//  InternetAddress[] recipientAddress = new InternetAddress[recipientList.length];
//  int counter = 0;
//  for (String recipient1 : recipientList) {
//      recipientAddress[counter] = new InternetAddress(recipient1.trim());
//      counter++;
//  }
	 final String username = "2001mdsulthan@gmail.com";
        final String password = "9884621812";
        Session session;
        public void authentication()
        {
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        this.session = Session.getInstance(props,new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(username, password);
            }
          });
        }
     public void send(String to)
     {
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("2001mdsulthan@gmail.com"));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("bulk email send:");
            

            
            BodyPart messagepart=new MimeBodyPart();
            messagepart.setText("mail part");
            
            MimeBodyPart attachment=new MimeBodyPart();
            
            try{attachment.attachFile("");}
            catch(Exception b)
            {
            	b.printStackTrace();
            }
            Multipart multi=new MimeMultipart();
            multi.addBodyPart(messagepart);
            multi.addBodyPart(attachment);
            
            
           
            
            message.setContent(multi);
          
            
            message.setContent(multi);
            
            Transport.send(message);

            System.out.println("Done");
            

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    
     }
   

}
    



