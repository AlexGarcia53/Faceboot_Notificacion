/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;


/**
 * Interfaz que contiene el método necesario para decidir los métodos de envío de la notificación.
 * @author Equipo Broker.
 */
public interface INotificaciones {
    /**
     * Método encargado de analizar y establecer los métodos para el envio de la notificación, además 
     * de enviar el mensaje de la notificación mediante los métodos establecidos.
     * @param mensaje Mensaje con la notificación.
     * @return Mensaje enviado.
     */
    public Mensaje enviarNotificacion(Mensaje mensaje);
}
