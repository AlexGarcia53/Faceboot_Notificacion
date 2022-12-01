/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

import com.mycompany.logicafaceboot.FabricaLogica;
import dominio.Mensaje;
import excepciones.ErrorEnviarMensajeException;
import interfaces.ILogica;

/**
 *
 * @author Jarol
 */
public class NotificacionBase implements INotificacion {
    private static NotificacionBase notificacionBase = null;
    private ILogica logica;

    public NotificacionBase() {
        this.logica= FabricaLogica.crearLogica();
    }

    public static INotificacion crearNotificacionBase() {
        synchronized (NotificacionBase.class) {
            if (notificacionBase == null) {
                notificacionBase = new NotificacionBase();
            }

        }
        return notificacionBase;
    }

    @Override
    public Mensaje notificar(Mensaje mensaje) {
        try{
            return this.logica.enviarNotificacion(mensaje);
        } catch (ErrorEnviarMensajeException e){
            throw new ErrorEnviarMensajeException(e.getMessage());
        }
    }
    
}
