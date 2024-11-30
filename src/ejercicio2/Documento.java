
package ejercicio2;

public abstract class Documento {
    
    private String contenido;
    
    public Documento(String contenido) {
        this.contenido = contenido;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public abstract void exportar();
}
