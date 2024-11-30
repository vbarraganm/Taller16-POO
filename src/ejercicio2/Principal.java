
package ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Documento pdf = new DocumentoPDF("Contenido del documento en PDF");
        Documento word = new DocumentoWord("Contenido del documento en Word");
        Documento excel = new DocumentoExcel("Contenido del documento en Excel");

        pdf.exportar();
        word.exportar();
        excel.exportar();
    }
}

