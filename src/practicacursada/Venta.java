
package practicacursada;


public class Venta {
    private Cliente cliente;
    private Producto producto;
    private int cantidadVendida;
    private int precioUnitario;

    public Venta() {
    }

    public Venta(Cliente cliente, Producto producto, int cantidadVendida, int precioUnitario) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    

   
    
    
   
    }

    
    