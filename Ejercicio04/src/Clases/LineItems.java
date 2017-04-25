package Clases;

/**
 *
 * @author stalin
 */
public class LineItems {
    //Variable de la clase
    public double dbCantidad;
    //Se declara una variable de tipo Producto
    Producto objProducto;

    //Constructor
    public LineItems(double dbCantidad, Producto objProducto) {
        this.dbCantidad = dbCantidad;
        this.objProducto = objProducto;
    }
    
    //Metodo para obtener el precio total del producto
    public double getPrecioTotal (){
        return objProducto.getDbPrecio() * dbCantidad;
    }

    //Mostrar
    @Override
    public String toString() {
        return "LineItems{" + "dbCantidad=" + dbCantidad + ", objProducto=" + objProducto.getDbPrecio() +"El precio Total es:"+getPrecioTotal()+  '}'+" \n";
    }
    
    
    
    
}
