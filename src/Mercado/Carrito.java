package Mercado;

import Mercado.items.Ropa;
import java.util.ArrayList;

public class Carrito {
    private ArrayList<Ropa> carritoContent;

    // Constructor para inicializar el carrito
    public Carrito() {
        carritoContent = new ArrayList<>();
    }

    // Método para agregar un elemento al carrito
    public void addToCarrito(Ropa r) {
        carritoContent.add(r);
    }

    // Método para eliminar un elemento del carrito
    public void removeFromCarrito(Ropa r) {
        carritoContent.remove(r);
    }

    // Método para mostrar el contenido del carrito
    public void seeCarrito() {
        if (carritoContent.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Contenido del carrito:");
            for (Ropa r : carritoContent) {
                System.out.println("- " + r.getClass() + " - Precio: " + r.getPrecio());
            }
        }
    }

    // Método para calcular el precio total del carrito
    public double carritoPrecio() {
        double precio = 0;
        for (Ropa r : carritoContent) {
            precio += r.getPrecio();
        }
        return precio;
    }

    public ArrayList<Ropa> getCarritoContent() {
        return carritoContent;
    }
}

