import items.Camisa;
import items.Camiseta;
import items.Ropa;
import items.Vestido;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App { // Create user interface

    Carrito car = new Carrito();
    private ArrayList<Ropa> ropaDisponible = new ArrayList<>(
            List.of(new Camisa(56.0, 'M', Ropa.exitanteTallaje.M, Ropa.exitanteColor.RED),
                    new Camiseta(20.0, 'M', Ropa.exitanteTallaje.XL, Ropa.exitanteColor.GREEN),
                    new Vestido(56.0, 'M', Ropa.exitanteTallaje.M, Ropa.exitanteColor.RED, 10))); // , ImageIO.read(new
                                                                                                  // File("images/camisa.jpg"))

    public void dispMercado() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        System.out.println("que quieres comprar ? :");
        while (!salir) {

            System.out.println("1. Opcion 1 camisa");
            System.out.println("2. Opcion 2 camiseta");
            System.out.println("3. Opcion 3 vestido");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1 camisa");
                    System.out.println("Ingressa la talleja");

                    for(Ropa.exitanteTallaje tallaje : Ropa.exitanteTallaje.values()){
                        System.out.println(tallaje);
                    }
                    opcion = sn.nextInt();

                    for (Ropa.exitanteColor color: Ropa.exitanteColor.values()) {
                        System.out.println(color);
                    }
                    opcion = sn.nextInt();

                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2 camiseta");
                    System.out.println("Camiseta: Precio: 20.0 Talla: XL Color: GREEN ");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3 vastido");
                    System.out.println("Vestido: Precio: 56.0 Talla: M Color: RED ");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
    }

    public void pickItem(Ropa r) {
        car.addToCarrito(r);
    }
}
