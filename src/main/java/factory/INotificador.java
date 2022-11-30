/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import dominio.Mensaje;
import dominio.Usuario;

/**
 *
 * @author Jarol
 */
public interface INotificador {
    
    public void notificar(Mensaje mensaje);
    
}
