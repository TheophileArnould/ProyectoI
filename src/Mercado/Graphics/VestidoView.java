package Mercado.Graphics;

import Mercado.items.Ropa;
import Mercado.items.Vestido;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VestidoView extends JFrame{
    private JComboBox TamanoComboBox;
    private JPanel MainJean;
    private JComboBox ColorComboBox;
    private JComboBox SexoComboBox;
    private JButton agreagarAlCarritoButton;
    private JButton volverButton;
    private JPanel JeanPhoto;
    private JTextField largoTextField1;

    public VestidoView(){
        for (Ropa.exitanteColor color : Ropa.exitanteColor.values()) {
            ColorComboBox.addItem(color);

        }

        for (Ropa.exitanteTallaje tallaje : Ropa.exitanteTallaje.values()) {
            TamanoComboBox.addItem(tallaje);

        }

        for (Ropa.exitanteSexo sexo : Ropa.exitanteSexo.values()) {
            SexoComboBox.addItem(sexo);

        }

        SexoComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                agreagarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });
        TamanoComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                agreagarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });
        ColorComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                agreagarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });
        largoTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                agreagarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });
    }

    public JPanel getPanelMain() {
        return MainJean;
    }

    public int getItemPrice(){
        return ColorComboBox.getSelectedItem().toString().length() + TamanoComboBox.getSelectedItem().toString().length()*3+ SexoComboBox.getSelectedItem().toString().length() + 5*Integer.parseInt(largoTextField1.getText()) ;
    }

    public Vestido CreateRopa(){
        return new Vestido((double) getItemPrice(), Ropa.exitanteSexo.valueOf(SexoComboBox.getSelectedItem().toString()),Ropa.exitanteTallaje.valueOf(TamanoComboBox.getSelectedItem().toString()) ,Ropa.exitanteColor.valueOf(ColorComboBox.getSelectedItem().toString()),Integer.parseInt(largoTextField1.getText()));
    }


    public JButton getVolverButton() {
        return volverButton;
    }

    public JButton getAgreagarAlCarritoButton() {
        return agreagarAlCarritoButton;
    }
}
