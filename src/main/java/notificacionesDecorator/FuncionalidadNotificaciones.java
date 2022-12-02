/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;


/**
 *
 * @author Jarol
 */
public class FuncionalidadNotificaciones implements INotificaciones{
    
    private INotificacion notificacionCorreo, notificacionMensaje, notificacionNormal;


    public FuncionalidadNotificaciones() {
        notificacionNormal=NotificacionBase.crearNotificacionBase();
    }
 

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
