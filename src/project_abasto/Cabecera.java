/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_abasto;

import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceCmyk;

public class Cabecera implements IEventHandler {
     private  Document documento;
     String   Ubicacion;
     String   fecha;
 
    public Cabecera(Document doc,String Ubicacion,String fecha) {
        documento = doc;
        this.Ubicacion=Ubicacion;
        this.fecha=fecha;
    }
     
    /**
     * Crea el rectangulo donde pondremos el encabezado
     * @param docEvent Evento de documento
     * @return Area donde colocaremos el encabezado
     */
    private Rectangle crearRectanguloEncabezado(PdfDocumentEvent docEvent) {
        PdfDocument pdfDoc = docEvent.getDocument();
        PdfPage page = docEvent.getPage();        
         
        float xEncabezado = pdfDoc.getDefaultPageSize().getX() + documento.getLeftMargin();
        float yEncabezado = pdfDoc.getDefaultPageSize().getTop() - documento.getTopMargin();
        float anchoEncabezado = page.getPageSize().getWidth() - 36;
        float altoEncabezado = 50F;
 
        Rectangle rectanguloEncabezado = new Rectangle(xEncabezado, yEncabezado, anchoEncabezado, altoEncabezado);
         
        return rectanguloEncabezado;        
    }
     
    /**
     * Crea el rectangulo donde pondremos el pie de pagina
     * @param docEvent Evento del documento
     * @return Area donde colocaremos el pie de pagina
     */
    private Rectangle crearRectanguloPie(PdfDocumentEvent docEvent) {
        PdfDocument pdfDoc = docEvent.getDocument();
        PdfPage page = docEvent.getPage();
         
        float xPie = pdfDoc.getDefaultPageSize().getX() + documento.getLeftMargin();
        float yPie = pdfDoc.getDefaultPageSize().getBottom() ;
        float anchoPie = page.getPageSize().getWidth() - 72;
        float altoPie = 50F;
 
        Rectangle rectanguloPie = new Rectangle(xPie, yPie, anchoPie, altoPie);
         
        return rectanguloPie;
    }
     
    /**
     * Crea la tabla que contendra el mensaje del encabezado
     * @param mensaje Mensaje que desplegaremos
     * @return Tabla con el mensaje de encabezado
     */
    private Table crearTablaEncabezado(String mensaje) {
        float[] anchos = {1F};
        Table tablaEncabezado = new Table(anchos);
        tablaEncabezado.setWidth(527F);
 
        tablaEncabezado.addCell(mensaje);
         
        return tablaEncabezado;
    }
     
    /**
     * Crea la tabla de pie de pagina, con el numero de pagina
     * @param docEvent Evento del documento
     * @return Pie de pagina con el numero de pagina
     */
    private Table crearTablaPie(PdfDocumentEvent docEvent) {
        PdfPage page = docEvent.getPage();
        float[] anchos = {1F};
        Table tablaPie = new Table(anchos);
        tablaPie.setWidth(527F);
        Integer pageNum = docEvent.getDocument().getPageNumber(page);
         
        tablaPie.addCell(pageNum+"\t\t\t\t\t\t\t\t\t\t\t\t\t\tProyecto BocApp");
         
        return tablaPie;
    }
     
 
    /**
     * Manejador del evento de cambio de pagina, agrega el encabezado y pie de pagina
     * @param event Evento de pagina
     */
    public void handleEvent(Event event) {
        PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
        PdfDocument pdfDoc = docEvent.getDocument();
        PdfPage page = docEvent.getPage();
        PdfCanvas canvas = new PdfCanvas(page.newContentStreamBefore(), page.getResources(), pdfDoc);        
         
        Table tablaEncabezado = this.crearTablaEncabezado("Fecha: "+ fecha + "\n" + "UBICACIÓN DE LA BOCATOMA: "+Ubicacion);
        Rectangle rectanguloEncabezado = this.crearRectanguloEncabezado(docEvent);        
        Canvas canvasEncabezado = new Canvas(canvas, pdfDoc, rectanguloEncabezado);        
        canvasEncabezado.add(tablaEncabezado);      
 
        Table tablaNumeracion = this.crearTablaPie(docEvent);
        Rectangle rectanguloPie = this.crearRectanguloPie(docEvent);
        Canvas canvasPie = new Canvas(canvas, pdfDoc, rectanguloPie);        
        canvasPie.add(tablaNumeracion);
    }
}
