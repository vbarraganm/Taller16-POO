
package ejercicio1;

public class Principal {

    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(50);
        Descuento descuentoFijo = new DescuentoFijo(80);
        
        double monto = 200;
        
        double montoConDescuentoPorcentaje = descuentoPorcentaje.descontar(monto);
        System.out.println("Monto con descuento porcentual: " + montoConDescuentoPorcentaje);
        
        double montoConDescuentoFijo = descuentoFijo.descontar(monto);
        System.out.println("Monto con descuento fijo: " + montoConDescuentoFijo);
    }
}
