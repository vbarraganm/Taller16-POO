
package ejercicio3;

public class Principal {

    public static void main(String[] args) {
        Mensajero email = new MensajePorEmail();
        Mensajero sms = new MensajePorSMS();
        Mensajero push = new MensajePorPush();
        
        email.enviar("Contenido del email");
        sms.enviar("Contenido del SMS");
        push.enviar("Contenido de la notificación push");
    }
}
