/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Jarol
 */
public class TipoNotificadorFactory {
    private static SimpleJavaMail simpleJavaMail = null;
    private static TwilioSms twilio = null;

    public TipoNotificadorFactory() {
    }

    public static INotificador crearNotificadorSimpleJavaMail() {
        synchronized (TipoNotificadorFactory.class) {
            if (simpleJavaMail == null) {
                simpleJavaMail = new SimpleJavaMail();
            }

        }
        return simpleJavaMail;
    }

    public static INotificador crearNotificadorTwilio() {
        synchronized (TipoNotificadorFactory.class) {
            if (twilio == null) {
                twilio = new TwilioSms();
            }
            return twilio;
        }
    }

}
