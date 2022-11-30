/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;
import dominio.Usuario;
import factory.TipoNotificadorFactory;

/**
 *
 * @author Jarol
 */
public class DecoradorEmail extends DecoradorNotificacionBase{
    
  
    public DecoradorEmail(INotificacion decoracion) {
        super(decoracion);
       
    }

    public DecoradorEmail() {
    }

  
    
    @Override
    public void notificar(Mensaje mensaje) {
        super.notificar(mensaje);
       TipoNotificadorFactory.crearNotificadorSimpleJavaMail().notificar(mensaje);
    }

   
}
