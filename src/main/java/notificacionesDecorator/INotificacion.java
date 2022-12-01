/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;


/**
 *
 * @author Jarol
 */
public interface INotificacion {
    //El usuario agregado es el receptor
    public Mensaje notificar(Mensaje mensaje);
}
