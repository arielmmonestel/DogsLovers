
/*Autores:
*Ariel Montero 
*Giaccomo Ubaldo
*Fabi�n Monge
*Jefri C�rdenas
<<<<<<< HEAD
*Fecha de Creacion: 4/11/2014
*
*Descripci�n: Esta es la clase EnviarMail , su funci�n es enviar correos sin adjunto
=======
*Fecha de Creacion: 21/10/2014
*
*Descripci�n: Esta es la clase EnviarMail, su funci�n es ocuparse de todo lo relacionado al env�o de correos a otros usuarios.
>>>>>>> origin/master
*
*/


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
     
 	
 	public static String emailG = "dogsloverspoo@gmail.com";
 	public static String passG = "dogslovers1234";
 	
     
     
          public static void enviarMail(){

          try
       { 
            // Propiedades de la conexi�n
        //     JOptionPane.showMessageDialog(null, "Entre al metodo");
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", emailG);
            props.setProperty("mail.smtp.auth", "true");
            props.put("mail.smtp.ssl.trust", "smtp.gmail.com");


          // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailG));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(correoDestinatario)); //Sitio de destino del msj
            
            message.setSubject(subject); //"Subject o motivo del correo"
            message.setText(
                    mensaje); //Correo

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect(emailG, passG); //Aqui va el correo de donde se va a enviar y la contrasena
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