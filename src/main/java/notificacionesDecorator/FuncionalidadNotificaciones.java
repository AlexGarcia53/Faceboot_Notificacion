/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;


/**
 * Clase encargada de hacer la funcionalidad de las notificaciones, analiza los métodos 
 * por los que se enviará el mensaje y hace envio de este.
 * @author Equipo Broker.
 */
public class FuncionalidadNotificaciones implements INotificaciones{
    /**
     * Atributo que representa a la notificación mediante correo.
     */
    private INotificacion notificacionCorreo;
    /**
     * Atributo que representa a la notificación mediante SMS.
     */
    private INotificacion notificacionMensaje;
    /**
     * Atributo que representa a la notificación base.
     */
    private final INotificacion notificacionNormal;
    /**
     * Método constructor de la clase.
     */
    public FuncionalidadNotificaciones() {
        notificacionNormal=NotificacionBase.crearNotificacionBase();
    }
    /**
     * Método encargado de analizar y establecer los métodos para el envio de la notificación, además 
     * de enviar el mensaje de la notificación mediante los métodos establecidos.
     * @param mensaje Mensaje con la notificación.
     * @return Mensaje enviado.
     */
    @Override
    public Mensaje enviarNotificacion(Mensaje mensaje) {
        if (mensaje.getMensajeSMS() == true && mensaje.getMensajeEmail() == false) {
            notificacionMensaje = new DecoradorSMS(notificacionNormal);
            return notificacionMensaje.notificar(mensaje);
        } else if (mensaje.getMensajeSMS() == false && mensaje.getMensajeEmail() == true) {
            notificacionCorreo = new DecoradorEmail(notificacionNormal);
            return notificacionCorreo.notificar(mensaje);
        } else {
            notificacionCorreo = new DecoradorEmail(notificacionNormal);
            notificacionMensaje = new DecoradorSMS(notificacionCorreo);
            return notificacionMensaje.notificar(mensaje);
        }
    } 
}
