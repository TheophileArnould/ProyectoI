package Mercado.Graphics;

import Mercado.items.Camisa;
import Mercado.items.Jean;
import Mercado.items.Ropa;

import javax.swing.*;
import java.awt.event.*;

public class CamisaView extends JFrame{
    private JPanel MainPanel;
    private JButton agregarAlCarritoButton;
    private JComboBox tamanoComboBox1;
    private JButton volverButton;
    private JComboBox SexoComboBox2;
    private JComboBox colorComboBox3;
    private JTextField tallajeMangasTextField1;
    private JPanel fotoPanel;

    public CamisaView() {
        for (Ropa.exitanteColor color : Ropa.exitanteColor.values()) {
            colorComboBox3.addItem(color);

        }

        for (Ropa.exitanteTallaje tallaje : Ropa.exitanteTallaje.values()) {
            tamanoComboBox1.addItem(tallaje);

        }

        for (Ropa.exitanteSexo sexo : Ropa.exitanteSexo.values()) {
            SexoComboBox2.addItem(sexo);

        }
        SexoComboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                agregarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });
        tamanoComboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                agregarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });
        colorComboBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                agregarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });


        tallajeMangasTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                agregarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });
    }

    private int getItemPrice() {
        return colorComboBox3.getSelectedItem().toString().length() + tamanoComboBox1.getSelectedItem().toString().length()*3+ SexoComboBox2.getSelectedItem().toString().length() + 4*tallajeMangasTextField1.getText().length() ;
    }

    public JPanel getPanelMain() {
        return MainPanel;
    }

    public JButton getAgregarAlCarritoButton() {
        return agregarAlCarritoButton;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public Camisa CreateRopa(){
        return new Camisa((double) getItemPrice(), Ropa.exitanteSexo.valueOf(SexoComboBox2.getSelectedItem().toString()),Ropa.exitanteTallaje.valueOf(tamanoComboBox1.getSelectedItem().toString()) ,Ropa.exitanteColor.valueOf(colorComboBox3.getSelectedItem().toString()),Double.parseDouble( tallajeMangasTextField1.getText().replace(",",".") ) );
    }
}
