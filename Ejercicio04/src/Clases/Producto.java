package Clases;

/**
 *
 * @author stalin
 */
public class Producto {
    //Variable de la clase
    public String strDescripcion;
    public double dbPrecio;

    //Constructor
    public Producto(String strDescripcion, double dbPrecio) {
        this.strDescripcion = strDescripcion;
        this.dbPrecio = dbPrecio;
    }
    
    //Metodos get de cada atributo
    public String getStrDescripcion() {
        return strDescripcion;
    }

    public double getDbPrecio() {
        return dbPrecio;
    }
}
