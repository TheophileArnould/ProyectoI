import items.Camisa;
import items.Camiseta;
import items.Ropa;
import items.Vestido;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App { // Create user interface

    Carrito car = new Carrito();
    private ArrayList<Ropa> ropaDisponible = new ArrayList<>(List.of(new Camisa(56.0, 'M', Ropa.exitanteTallaje.M, Ropa.exitanteColor.RED),
            new Camiseta(20.0, 'M', Ropa.exitanteTallaje.XL,Ropa.exitanteColor.GREEN),
            new Vestido(56.0, 'M', Ropa.exitanteTallaje.M,Ropa.exitanteColor.RED,10))); //, ImageIO.read(new File("images/camisa.jpg"))

    public void dispMercado(){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String userIn = "O";
        while (!userIn.equals("exit")){
            System.out.println();

        }

        System.out.println("que quieres comprar ? :");

    }

    public void pickItem(Ropa r){
        car.addToCarrito(r);
    }
}
