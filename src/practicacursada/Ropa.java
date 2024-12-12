
package practicacursada;


public class Ropa extends Producto {

   private String talle;
   private int unidadesVendidas;

    public Ropa() {
    }

    public Ropa(String talle, int unidadesVendidas) {
        this.talle = talle;
        this.unidadesVendidas = unidadesVendidas;
    }

    public Ropa(String talle, int unidadesVendidas, String nombre, int Precio, int Stock) {
        super(nombre, Precio, Stock);
        this.talle = talle;
        this.unidadesVendidas = unidadesVendidas;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

   
  
}
