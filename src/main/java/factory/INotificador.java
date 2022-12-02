/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import dominio.Mensaje;
import dominio.Usuario;

/**
 * Interfaz que contiene el método necesario para que los notificadores puedan llevar a cabo
 * la operación.
 * @author Equipo Broker.
 */
public interface INotificador {
    /**
     * Método encargado de notificar un mensaje mediante el tipo dado.
     * @param mensaje Mensaje a enviar mediante la notificación
     */
    public void notificar(Mensaje mensaje);
    
}
