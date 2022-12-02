/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;
import dominio.Usuario;
import factory.TipoNotificadorFactory;

/**
 * Clase que representa al decorador del tipo SMS (Twilio).
 * @author Equipo Broker.
 */
public class DecoradorSMS extends DecoradorNotificacionBase{
    /**
     * Método constructor de la clase.
     * @param decoracion Objeto al que decora.
     */
    public DecoradorSMS(INotificacion decoracion) {

        super(decoracion);

    }
    /**
     * Método encargado de enviar el mensaje al usuario receptor.
     * @param mensaje Mensaje a enviar.
     * @return El mensaje enviado.
     */
    @Override
    public Mensaje notificar(Mensaje mensaje) {
        TipoNotificadorFactory.crearNotificadorTwilio().notificar(mensaje);
        return super.notificar(mensaje);
    }
}
