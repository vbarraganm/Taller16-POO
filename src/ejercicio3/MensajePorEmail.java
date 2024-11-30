
package ejercicio3;

public class MensajePorEmail extends Mensajero {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje por email: " + mensaje);
    }
}
