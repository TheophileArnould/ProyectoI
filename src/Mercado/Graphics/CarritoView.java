package Mercado.Graphics;

import Mercado.Carrito;
import Mercado.items.Ropa;

import javax.swing.*;

public class CarritoView extends JFrame {
    private JPanel MainCarritoPanel;

    public CarritoView(Carrito carrito){
        for(Ropa r : carrito.getCarritoContent()){
            //TODO display each items
        }

    }

}
