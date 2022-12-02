/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

/**
 * Clase encargada de crear instancias de objetos para llevar a cabo notificaciones de mensajes.
 * @author Equipo Broker.
 */
public class FabricaNotificaciones {
    /**
     * Atributo que contiene una instancia estática de la clase.
     */
    private static FabricaNotificaciones fabricaNotificaciones;
    /**
     * Método constructor de la clase.
     */
    private FabricaNotificaciones(){
        
    }
    /**
     * Método utilizado para obtener una instancia de la clase, en caso de que no este 
     * inicializada la incializa.
     * @return Instancia de la clase.
     */
    public static FabricaNotificaciones getInstancia(){
        if(fabricaNotificaciones==null){
            fabricaNotificaciones= new FabricaNotificaciones();
        }
        return fabricaNotificaciones;
    }
    /**
     * Método utilizado para obtener una instancia del tipo INotificaciones.
     * @return Instancia de INotificaciones.
     */
    public INotificaciones obtenerNotificaciones(){
        return new FuncionalidadNotificaciones();
    }
}
