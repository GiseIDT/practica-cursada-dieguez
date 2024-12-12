
package practicacursada;

import java.util.List;


public class Cliente {
    
    private String Nombre;
    private int codigoPostal;
    private String Ciudad;
    private List<Producto> ProductoComprado;

    public Cliente() {
    }

    public Cliente(String Nombre, int codigoPostal, String Ciudad, List<Producto> ProductoComprado) {
        this.Nombre = Nombre;
        this.codigoPostal = codigoPostal;
        this.Ciudad = Ciudad;
        this.ProductoComprado = ProductoComprado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public List<Producto> getProductoComprado() {
        return ProductoComprado;
    }

    public void setProductoComprado(List<Producto> ProductoComprado) {
        this.ProductoComprado = ProductoComprado;
    }
    
    
    
    
    
}
   
