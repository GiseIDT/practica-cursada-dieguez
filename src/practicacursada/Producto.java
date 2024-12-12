
package practicacursada;


public class Producto {
    String nombre;
    int Precio;
    int Stock=200;

    public Producto() {
    }

    public Producto(String nombre, int Precio, int Stock) {
        this.nombre = nombre;
        this.Precio = Precio;
        this.Stock = Stock;
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
    
      @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + Precio + ", Stock: " + Stock;
}

   
   
}
