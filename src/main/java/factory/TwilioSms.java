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
 *
 * @author Jarol
 */
public class TwilioSms implements INotificador  {
    private static final String ACCOUNT_SID = "AC319d66e57a12cfe70c06f03ae755b11f";
    private static final String AUTH_TOKEN = "7285f5e62412372cb227e8c7d3e379f9";
    public String numeroEmisor = "+19378882681";

    public TwilioSms() {
    }

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
