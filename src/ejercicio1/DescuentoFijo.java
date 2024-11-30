
package ejercicio1;

public class DescuentoFijo extends Descuento {
    
    private double descuentoFijo;
    
    public DescuentoFijo(double descuentoFijo) {
        if (descuentoFijo < 0) {
            System.out.println("El descuento fijo no puede ser negativo.");
        }
        this.descuentoFijo = descuentoFijo;
    }
    
    @Override
    public double descontar(double monto) {
        if (monto < 0) {
            System.out.println("El monto no puede ser negativo.");
        }
        return monto - descuentoFijo;
    }
}
