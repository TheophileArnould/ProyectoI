package Mercado.Graphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class MainMercado extends JFrame{
    private JPanel PanelMain;
    private ImageIcon camisaImage;
    private JLabel Title;
    private JPanel camisa;
    private JPanel camiseta;
    private JPanel pantalon;
    private JPanel vestido;
    private JPanel other;

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
}
