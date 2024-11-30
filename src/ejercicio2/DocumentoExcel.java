
package ejercicio2;

public class DocumentoExcel extends Documento {
    
    public DocumentoExcel(String contenido) {
        super(contenido);
    }
    
    @Override
    public void exportar() {
        System.out.println("Exportando documento.xlsx: " + getContenido());
    }
}
