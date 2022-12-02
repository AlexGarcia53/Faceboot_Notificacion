/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

/**
 *
 * @author Admin
 */
public class FabricaNotificaciones {
    private static FabricaNotificaciones fabricaNotificaciones;
    
    private FabricaNotificaciones(){
        
    }
    
    public static FabricaNotificaciones getInstancia(){
        if(fabricaNotificaciones==null){
            fabricaNotificaciones= new FabricaNotificaciones();
        }
        return fabricaNotificaciones;
    }
    
    public INotificaciones obtenerNotificaciones(){
        return new FNotificaciones();
    }
}
