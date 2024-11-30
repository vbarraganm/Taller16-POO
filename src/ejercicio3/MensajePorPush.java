
package ejercicio3;

public class MensajePorPush extends Mensajero {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje por notificación push: " + mensaje);
    }
}
