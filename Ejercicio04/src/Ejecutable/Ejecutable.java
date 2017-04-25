package Ejecutable;

import Clases.ArchivoTexto;
import Clases.Domicilio;
import Clases.Factura;
import Clases.Producto;

/**
 *
 * @author stalin
 */
public class Ejecutable {
    public static void main(String[] args) {
        ArchivoTexto aplicacion = new ArchivoTexto(); 
        aplicacion.abrir_archivo();
        aplicacion.agregar_informacion();
        aplicacion.cerrar_archivo();
        
       
    }
    
}
