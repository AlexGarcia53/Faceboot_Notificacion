/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import dominio.Mensaje;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import dominio.Usuario;

/**
 * Clase encargada del envío de notificaciones mediante SMS utilizando Twilio.
 * @author Equipo Broker.
 */
public class TwilioSms implements INotificador  {
    /**
     * Atributo que contiene la SID de la cuenta para envíar notificaciones.
     */
    private static final String ACCOUNT_SID = "AC319d66e57a12cfe70c06f03ae755b11f";
    /**
     * Atributo que contiene el toker de autentificación para poder enviar notificaciones.
     */
    private static final String AUTH_TOKEN = "7285f5e62412372cb227e8c7d3e379f9";
    /**
     * Atributo que contiene el número desde el que se enviarán las notificaciones.
     */
    public String numeroEmisor = "+19378882681";
    /**
     * Método constructor de la clase.
     */
    public TwilioSms() {
    }
    /**
     * Método encargado de notificar un mensaje mediante el tipo dado.
     * @param mensaje Mensaje a enviar mediante la notificación
     */
    @Override
    public void notificar(Mensaje mensaje) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                //Numero de a quien se le envia el mensaje
                new com.twilio.type.PhoneNumber("+52" + mensaje.getReceptor().getCelular()),
                // Numero del telefoo que proporciona TwilioSms
                new com.twilio.type.PhoneNumber(numeroEmisor),
                "Nuevo mensaje desde Faceboot \n"+"Enviado por: " + mensaje.getUsuario().getUsuario() + "   \n" + mensaje.getTextoPlano())
                .create();

    }
    
}
