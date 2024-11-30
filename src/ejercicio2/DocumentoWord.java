
package ejercicio2;

public class DocumentoWord extends Documento {
    
    public DocumentoWord(String contenido) {
        super(contenido);
    }
    
    @Override
    public void exportar() {
        System.out.println("Exportando documento.docx: " + getContenido());
    }
}
