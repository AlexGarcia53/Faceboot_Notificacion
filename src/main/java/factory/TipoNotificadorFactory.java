/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 * Clase encargada de construir y devolver instancias de las clases notificadoras.
 * @author Equipo Broker.
 */
public class TipoNotificadorFactory {
    /**
     * Instancia estática de la clase encarga de notificar mediante SimpleJavaMail.
     */
    private static SimpleJavaMail simpleJavaMail = null;
    /**
     * Instancia estática de la clase encarga de notificar mediante Twilio.
     */
    private static TwilioSms twilio = null;
    /**
     * Método constructor de la clase.
     */
    public TipoNotificadorFactory() {
    }
    /**
     * Método utilizado para obtener una instancia del notificador SimpleJavaMail, en caso 
     * de que no este inicializada la inicializa.
     * @return Instancia del notificador.
     */
    public static INotificador crearNotificadorSimpleJavaMail() {
        synchronized (TipoNotificadorFactory.class) {
            if (simpleJavaMail == null) {
                simpleJavaMail = new SimpleJavaMail();
            }

        }
        return simpleJavaMail;
    }
    /**
     * Método utilizado para obtener una instancia del notificador Twilio, en caso 
     * de que no este inicializada la inicializa.
     * @return Instancia del notificador.
     */
    public static INotificador crearNotificadorTwilio() {
        synchronized (TipoNotificadorFactory.class) {
            if (twilio == null) {
                twilio = new TwilioSms();
            }
            return twilio;
        }
    }

}
