package Mercado.Graphics;

import Mercado.Carrito;
import Mercado.items.Jean;
import Mercado.items.Ropa;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CarritoView extends JFrame{
    private JList list1;
    private Carrito c;
    private JButton comprarButton;

    public JButton getComprarButton() {
        return comprarButton;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    private JButton volverButton;
    private JPanel MainPanel;

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public CarritoView(Carrito carrito) {
        c = carrito;
        list1.setFont(new java.awt.Font("Tahoma", 0, 24));

        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                carrito.removeFromCarrito(list1.getSelectedIndex());
                updateCarrito();
                //JOptionPane.showMessageDialog(null,);
            }
        });
        comprarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                carrito.vacillar();
                updateCarrito();
                JOptionPane.showMessageDialog(null,"muchas gracias por su compras");
            }
        });


    }

    public void updateCarrito(){
        DefaultListModel listModel1 = new DefaultListModel();
        System.out.println(c.getCarritoContent());

        String st="Working hard";
        for(Ropa r : c.getCarritoContent()){
            listModel1.addElement(r.toString());


        }

        comprarButton.setText("Comprar para : " +c.carritoPrecio());

        list1.setModel(listModel1);
    }
}
