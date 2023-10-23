package Mercado.Graphics;

import javax.swing.*;

public class MainMercado extends JFrame{
    private JPanel PanelMain;
    private ImageIcon camisaImage;
    private JLabel Title;
    private JPanel camisa;
    private JPanel camiseta;
    private JPanel pantalon;
    private JPanel vestido;
    private JPanel carrito;

    public MainMercado() {
    }

    public JPanel getCamisa() {
        return camisa;
    }

    public JPanel getCamiseta() {
        return camiseta;
    }

    public JPanel getPantalon() {
        return pantalon;
    }

    public JPanel getVestido() {
        return vestido;
    }

    public JPanel getPanelMain() {
        return PanelMain;
    }

    public JPanel getCarrito() {
        return carrito;
    }
}
