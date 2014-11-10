package logicaDeNegocios;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import logicaDeNegocios.Sistema;

public class EnviarMail {
     public static String correoDestinatario ;
     public static String mensaje ;
     public static String subject ;
    


     public static void main(String[] args){
    	 enviarMail();
   	  
     }
     
          public static void enviarMail(){

          try
       { 
            // Propiedades de la conexión
        //     JOptionPane.showMessageDialog(null, "Entre al metodo");
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "dogs1lovers@gmail.com");
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");


          // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("dogs1lovers@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(correoDestinatario)); //Sitio de destino del msj
            
            message.setSubject(subject); //"Subject o motivo del correo"
            message.setText(
                    mensaje); //Correo

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect("dogs1lovers@gmail.com", "46@5aF1o.Dogs"); //Aqui va el correo de donde se va a enviar y la contrasena
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
        
            t.close();
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        

          
          }

    

     
     


}