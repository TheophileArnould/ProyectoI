package Mercado.Graphics;

import Mercado.items.Camiseta;
import Mercado.items.Jean;
import Mercado.items.Ropa;
import Mercado.items.Vestido;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CamisetaView extends JFrame{
    private JComboBox TamanoComboBox;
    private JPanel MainJean;
    private JComboBox ColorComboBox;
    private JComboBox SexoComboBox;
    private JButton agreagarAlCarritoButton;
    private JButton volverButton;
    private JPanel JeanPhoto;
    private JComboBox EstampadosComboBox1;

    public CamisetaView(){
        for (Ropa.exitanteColor color : Ropa.exitanteColor.values()) {
            ColorComboBox.addItem(color);

        }

        for (Ropa.exitanteTallaje tallaje : Ropa.exitanteTallaje.values()) {
            TamanoComboBox.addItem(tallaje);

        }

        for (Ropa.exitanteSexo sexo : Ropa.exitanteSexo.values()) {
            SexoComboBox.addItem(sexo);

        }
        for (Camiseta.exitanteEstampados material : Camiseta.exitanteEstampados.values()) {
            EstampadosComboBox1.addItem(material);

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

        EstampadosComboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                agreagarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });

    }

    public JPanel getPanelMain() {
        return MainJean;
    }

    public int getItemPrice(){
        return ColorComboBox.getSelectedItem().toString().length() + TamanoComboBox.getSelectedItem().toString().length()*3+ SexoComboBox.getSelectedItem().toString().length() + EstampadosComboBox1.getSelectedItem().toString().length()  ;
    }

    public Camiseta CreateRopa(){
        return new Camiseta((double) getItemPrice(), Ropa.exitanteSexo.valueOf(SexoComboBox.getSelectedItem().toString()),Ropa.exitanteTallaje.valueOf(TamanoComboBox.getSelectedItem().toString()) ,Ropa.exitanteColor.valueOf(ColorComboBox.getSelectedItem().toString()), Camiseta.exitanteEstampados.valueOf(EstampadosComboBox1.getSelectedItem().toString()));
    }


    public JButton getVolverButton() {
        return volverButton;
    }

    public JButton getAgreagarAlCarritoButton() {
        return agreagarAlCarritoButton;
    }
}
