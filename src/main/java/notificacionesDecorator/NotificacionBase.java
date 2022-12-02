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
 * Clase que representa la notificación base para el envío de un mensaje, la cuál se encarga 
 * de guardar la operación en base de datos.
 * @author Equipo Broker.
 */
public class NotificacionBase implements INotificacion {
    /**
     * Atributo con una instancia estática de la clase.
     */
    private static NotificacionBase notificacionBase = null;
    /**
     * Atributo que contiene un objeto para poder hacer uso de los métodos de la lógica.
     */
    private ILogica logica;
    /**
     * Método constructor de la clase.
     */
    public NotificacionBase() {
        this.logica= FabricaLogica.crearLogica();
    }
    /**
     * Método utilizado para obtener una instancia de la clase, en caso de que no este 
     * inicializada la incializa.
     * @return Instancia de la clase.
     */
    public static INotificacion crearNotificacionBase() {
        synchronized (NotificacionBase.class) {
            if (notificacionBase == null) {
                notificacionBase = new NotificacionBase();
            }

        }
        return notificacionBase;
    }
    /**
     * Método encargado de enviar el mensaje al usuario receptor.
     * @param mensaje Mensaje a enviar.
     * @return El mensaje enviado.
     */
    @Override
    public Mensaje notificar(Mensaje mensaje) {
        try{
            return this.logica.enviarNotificacion(mensaje);
        } catch (ErrorEnviarMensajeException e){
            throw new ErrorEnviarMensajeException(e.getMessage());
        }
    }
    
}
