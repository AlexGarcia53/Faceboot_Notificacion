/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;
import dominio.Usuario;


/**
 *
 * @author Jarol
 */
public abstract class DecoradorNotificacionBase implements INotificacion{
private final INotificacion decoracion;

   

public  DecoradorNotificacionBase(INotificacion decoracion)
    {  
        this.decoracion = decoracion;
        
    }

public  DecoradorNotificacionBase()
    {  
    this.decoracion = null;
      
        
    }


 
    @Override
    public void notificar(Mensaje mensaje) {
     
        decoracion.notificar(mensaje);
    }
    
   
}
