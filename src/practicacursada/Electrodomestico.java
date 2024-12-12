
package practicacursada;


public class Electrodomestico extends Producto{
    
    private  String Marca;

    public Electrodomestico() {
    }

    public Electrodomestico(String Marca) {
        this.Marca = Marca;
    }

    public Electrodomestico(String Marca, String nombre, int Precio, int Stock) {
        super(nombre, Precio, Stock);
        this.Marca = Marca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
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
        return super.toString() + ", Marca: " + Marca;
}
}
