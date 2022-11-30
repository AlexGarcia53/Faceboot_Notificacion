/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;
import dominio.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Jarol
 */
public class NotificacionBase implements INotificacion {
  private static NotificacionBase notificacionBase=null;
    public NotificacionBase() {
    }
     
 public  static INotificacion crearNotificacionBase()
 {
     synchronized(NotificacionBase.class)
     {
   if(notificacionBase==null)
   {
         notificacionBase= new NotificacionBase();
   }
        
     }
     return notificacionBase;   
 }
    
 
    @Override
    public void notificar(Mensaje mensaje) {
        
    }
    
}
