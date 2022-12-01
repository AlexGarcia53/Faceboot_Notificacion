/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import dominio.Mensaje;
import dominio.Usuario;
import org.simplejavamail.api.email.Email;
import org.simplejavamail.api.mailer.config.TransportStrategy;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.MailerBuilder;



/**
 *
 * @author Jarol
 */
public class SimpleJavaMail implements INotificador {
    public String correo = "faceboot23a@gmail.com";
    public String contrasena = "keziysbkwqhfxpzl";

    public SimpleJavaMail() {

    }

    @Override
    public void notificar(Mensaje mensaje) {

        Email email = EmailBuilder.startingBlank()
                .from(mensaje.getUsuario().getUsuario(), correo)
                .to(mensaje.getReceptor().getUsuario(), mensaje.getReceptor().getEmail())
                .withSubject("Notificación de " + mensaje.getUsuario().getUsuario())
                .withPlainText(mensaje.getTextoPlano())
                .buildEmail();

//Correo faceboot23a@gmail.com
        MailerBuilder
                // facebootA28L./
                //  keziysbkwqhfxpzl
                .withSMTPServer("smtp.gmail.com", 587, correo, contrasena).withTransportStrategy(TransportStrategy.SMTP_TLS)
                .buildMailer()
                .sendMail(email);

    }

}

