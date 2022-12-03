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
 * Clase encargada del envío de notificaciones vía Email utilizando SimpleJavaMail.
 * @author Equipo Broker.
 */
public class SimpleJavaMail implements INotificador {
    /**
     * Atributo que contiene el correo desde el que se enviará la notificación.
     */
    private static final String CORREO = "faceboot23a@gmail.com";
    /**
     * Atributo que contiene la contraseña del correo desde el que se enviará la notificación.
     */
    private static final String CONTRASENIA = "keziysbkwqhfxpzl";
    /**
     * Método constructor de la clase.
     */
    public SimpleJavaMail() {

    }
    /**
     * Método encargado de notificar un mensaje mediante el tipo dado.
     * @param mensaje Mensaje a enviar mediante la notificación
     */
    @Override
    public void notificar(Mensaje mensaje) {

        Email email = EmailBuilder.startingBlank()
                .from(mensaje.getUsuario().getUsuario(), CORREO)
                .to(mensaje.getReceptor().getUsuario(), mensaje.getReceptor().getEmail())
                .withSubject("Notificación de " + mensaje.getUsuario().getUsuario())
                .withPlainText(mensaje.getTextoPlano())
                .buildEmail();

//Correo faceboot23a@gmail.com
        MailerBuilder
                // facebootA28L./
                //  keziysbkwqhfxpzl
                .withSMTPServer("smtp.gmail.com", 587, CORREO, CONTRASENIA).withTransportStrategy(TransportStrategy.SMTP_TLS)
                .buildMailer()
                .sendMail(email);

    }

}

