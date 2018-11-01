/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Carlos Olivares
 */
public class Mail {

    private final String Username = "solomaj12@gmail.com";
    private final String PassWord = "xaoxagmjgsnawvfj";
    private static final String BASE_URI = "http://localhost:80/WsCineUNA/ws";
    public String Mensage;
    public String To = "";
    public String Subject = "";
    private static Mail INSTANCE = null;

    public Mail() {
    }
    
    private static void createInstance() {
        if (INSTANCE == null) {
            synchronized (Mail.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Mail();
                }
            }
        }
    }

    public static Mail getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }
    
    public void enviarMailActivacion(String correo, String usuario) {
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        Session session;
        session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(Username, PassWord);
                    }
                });

        try {

            Message message = new MimeMessage(session);
           
            message.setFrom(new InternetAddress(Username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(correo));
       
            message.setSubject("Activacion de Usuario");
            Mensage = "Este es un correo de activacion. Al tocar el siguiente link tu usuario sera activado, de lo contrario solo ignora este mensaje \n"+
            BASE_URI+ "/activar/"+usuario;
            message.setText(Mensage);
            // message.setFileName("C:\\Users\\Carlos Olivares\\Pictures\\Imagenes\\Ballenas\\DSC00382.jpg");
            Transport.send(message);
            System.out.println("MENSAJE ENVIADO");
            
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
