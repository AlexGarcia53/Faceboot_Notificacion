/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notificacionesDecorator;

import dominio.Mensaje;
import dominio.Usuario;


/**
 * Clase que representa al decorador base.
 * @author Equipo Broker.
 */
public abstract class DecoradorNotificacionBase implements INotificacion{
    /**
     * Atributo que contiene al objeto decoración.
     */
    private final INotificacion decoracion;
    /**
     * Método constructor de la clase.
     * @param decoracion Objeto al que decora.
     */
    public DecoradorNotificacionBase(INotificacion decoracion) {
        this.decoracion = decoracion;

    }
    /**
     * Método constructor de la clase.
     */
    public DecoradorNotificacionBase() {
        this.decoracion = null;

    }
    /**
     * Método encargado de enviar el mensaje al usuario receptor.
     * @param mensaje Mensaje a enviar.
     * @return El mensaje enviado.
     */
    @Override
    public Mensaje notificar(Mensaje mensaje) {
        return decoracion.notificar(mensaje);
    }
}
