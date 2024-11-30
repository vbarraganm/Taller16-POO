
package ejercicio1;

public class DescuentoPorcentaje extends Descuento {
    
    private double porcentaje;
    
    public DescuentoPorcentaje(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("El porcentaje debe estar entre 0 y 100.");
        }
        this.porcentaje = porcentaje;
    }
    
    @Override
    public double descontar(double monto) {
        if (monto < 0) {
            System.out.println("El monto no puede ser negativo.");
        }
        return monto - (monto * (porcentaje / 100));
    }
}
