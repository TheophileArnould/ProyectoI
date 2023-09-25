import items.Ropa;
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
                System.out.println("- " + r.getNombre() + " - Precio: " + r.getPrecio());
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

    // Método para agregar un elemento del mercado al carrito
    public void agregarAlCarritoDesdeMercado(App app, int indice) {
        if (indice >= 0 && indice < app.ropaDisponible.size()) {
            Ropa ropaSeleccionada = app.ropaDisponible.get(indice);
            addToCarrito(ropaSeleccionada);
            System.out.println("Has agregado " + ropaSeleccionada.getNombre() + " al carrito.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    // Método para eliminar un elemento del carrito basado en su índice en el carrito
    public void eliminarDelCarrito(int indice) {
        if (indice >= 0 && indice < carritoContent.size()) {
            Ropa ropaEliminada = carritoContent.remove(indice);
            System.out.println("Has eliminado " + ropaEliminada.getNombre() + " del carrito.");
        } else {
            System.out.println("Índice no válido.");
        }
    }
}

