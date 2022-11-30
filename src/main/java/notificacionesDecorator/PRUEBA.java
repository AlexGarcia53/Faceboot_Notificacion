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
public class PRUEBA {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Mensaje m=new Mensaje();
    
    m.setTextoPlano("Mensaje texto plano");
    m.setId(Long.MIN_VALUE);
   Usuario emisor = new Usuario();
   
   emisor.setUsuario("Jose Lopez");

   //faceboot23a
   
    Usuario receptor= new Usuario();
   receptor.setCelular("6731471748");
   receptor.setUsuario("jarol4");
   receptor.setEmail("tellezjarol89@gmail.com");
    m.setReceptor(receptor);
    m.setEnvioCorreo(true);
    m.setEnvioSms(false);
    m.setUsuario(emisor);
   
    INotificaciones n= new FNotificaciones();
    n.enviarNotificacion(m);
    
    
    
    
    }
    
}
