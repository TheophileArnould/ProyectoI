import items.Ropa;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Ropa> carritoContent;

    public void addToCarrito(Ropa r){
        carritoContent.add(r);
    }

    public void removefromCarrito(Ropa r){
        carritoContent.remove(r);
    }

    public void seeCarrito(){

    }

    public double carritoPrecio(){
        double precio = 0;
        for (Ropa r: carritoContent) {
            precio += r.getPrecio();
        }

        return  precio;
    }
}
