/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;


/**
 * Interfaz que contiene el método necesario para poder hacer el envío de una notificación.
 * @author Equipo Broker.
 */
public interface INotificacion {
    /**
     * Método encargado de enviar el mensaje al usuario receptor.
     * @param mensaje Mensaje a enviar.
     * @return El mensaje enviado.
     */
    public Mensaje notificar(Mensaje mensaje);
}
