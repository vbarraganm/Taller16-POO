
package ejercicio3;

public class MensajePorSMS extends Mensajero {
     @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje por SMS: " + mensaje);
    }
}
