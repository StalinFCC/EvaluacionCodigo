package Clases;

/**
 *
 * @author stalin
 */
public class Domicilio {
    //Variables de la clase
    private String strNombre;
    private String strCalle;
    private String strCiudad;
    private String strEstado;

    //Constructor
    public Domicilio(String strNombre, String strCalle, String strCiudad, String strEstado) {
        this.strNombre = strNombre;
        this.strCalle = strCalle;
        this.strCiudad = strCiudad;
        this.strEstado = strEstado;
    }

    // Mostrar lo que tiene cada variable
    @Override
    public String toString() {
        return "Domicilio{" + "strNombre=" + strNombre + ", strCalle=" + strCalle + ", strCiudad=" + strCiudad + ", strEstado=" + strEstado + '}';
    }
    
    
}
