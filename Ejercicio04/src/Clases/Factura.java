package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stalin
 */
public class Factura {
    
    //variable de tipo domicilio
    private Domicilio objDomicilio;
    //Creacion de un array list de tipo LineItems
    private ArrayList<LineItems> arraylstItems;
    //constructor con parametro Domicilio
    public Factura (Domicilio obDomicilio){
        this.objDomicilio = objDomicilio;
        //???????????
        arraylstItems = new ArrayList<LineItems>();
    }
    //Metodo donde se añade el producto
    public void AddProducto(Producto objProducto, int intCantidad){
        LineItems Item = new LineItems(intCantidad, objProducto);
        arraylstItems.add(Item);
    }

    /*
    private double getCantidadPendiente(){
    double dblMontoP =0;
    for (LineItems lineItems : lstItems) {
    dblMontoP = dblMontoP + lineItems.getPrecioTotal();
    }
    return dblMontoP;
    }
     */
    //mostrar
    @Override
    public String toString() {
        return "Factura{" + "objDomicilio=" + objDomicilio + ", arraylstItems=" + arraylstItems + '}';
    }
    
}
