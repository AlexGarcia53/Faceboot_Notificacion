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
public class FNotificaciones implements INotificaciones{
    
 private INotificacion notificacionCorreo,notificacionMensaje,notificacionNormal;


    public FNotificaciones() {
      
          notificacionNormal=NotificacionBase.crearNotificacionBase();
    }
 

    @Override
    public void enviarNotificacion(Mensaje mensaje) {
        if(mensaje.getEnvioSms()==true&&mensaje.getEnvioCorreo()==false)
        {
           
          notificacionMensaje= new DecoradorSMS(notificacionNormal);
            notificacionMensaje.notificar(mensaje);
        }else if(mensaje.getEnvioSms()==false&&mensaje.getEnvioCorreo()==true)
        {
            notificacionCorreo=new DecoradorEmail(notificacionNormal);
            notificacionCorreo.notificar(mensaje);
        }else if(mensaje.getEnvioSms()==true&&mensaje.getEnvioCorreo()==true)
        { 
            notificacionCorreo= new DecoradorEmail(notificacionNormal);
            notificacionMensaje= new DecoradorSMS(notificacionCorreo);
            notificacionMensaje.notificar(mensaje);
        }
        
       
    }
    
}
