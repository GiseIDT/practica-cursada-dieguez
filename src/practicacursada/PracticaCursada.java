
package practicacursada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PracticaCursada {

   
    public static void main(String[] args) {
      
       
       Ropa camisa = new Ropa("m", 1, "camisa", 15000, 0);
       Ropa remera = new Ropa("s", 2, "remera",12000, 0);
       Ropa pantalon = new Ropa("xxl", 1,"pantalon",1, 0);
       
       
       Electrodomestico lavadora = new Electrodomestico("LG", "Lavarropa", 990000, 5);
       Electrodomestico lavarropa = new Electrodomestico("Samsung", "Lavarropa", 800000, 2);
       Electrodomestico secador = new Electrodomestico("Electrolux", "Lavarropa", 1200000, 1);
       
     
       List<Cliente> clientes = new  ArrayList<>();
       clientes.add(new Cliente("Juan", 7203, "Ruch","Lavarropa" )) ;
       clientes.add(new Cliente("Pablo",8890,"Tandil","Remera"));
       clientes.add(new Cliente("Dylan",7203,"Ruch","Pantalon"));
           
       List <Venta> ventas = new ArrayList<>();
       ventas.add(new Venta(clientes.get(0),"Lavarropa"));
       ventas.add(new Venta(clientes.get(1),"Remera,1,12000"));
       
       
      
           
        
           
           
       String nombreBuscado = "Juan Perez" ; 
       boolean encontrado = false;
       int i=0;
         while (i< ventas.size() && ! encontrado) {            
            Venta nombreActual = ventas.get(i);
             if (ventas.get(i).getCliente().getNombre().equalsIgnoreCase(nombreBuscado)) {
                 System.out.println("El cliente es " + nombreActual.getCliente() + nombreActual.getProducto());
                encontrado = true;
             }
             i++;
        }   
         if (encontrado) {
             System.out.println("El cliente no se encuentra en la lista");
            
        }
    }         
}

        
    
    

 