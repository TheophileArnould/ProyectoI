package Mercado.Graphics;

import Mercado.items.Jean;
import Mercado.items.Ropa;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JeanView extends JFrame{
    private JComboBox TamanoComboBox;
    private JPanel MainJean;
    private JComboBox MaterialComboBox;
    private JComboBox ColorComboBox;
    private JComboBox SexoComboBox;
    private JButton agreagarAlCarritoButton;
    private JButton volverButton;
    private JPanel JeanPhoto;

    public JeanView(){
        for (Ropa.exitanteColor color : Ropa.exitanteColor.values()) {
            ColorComboBox.addItem(color);

        }

        for (Ropa.exitanteTallaje tallaje : Ropa.exitanteTallaje.values()) {
            TamanoComboBox.addItem(tallaje);

        }

        for (Ropa.exitanteSexo sexo : Ropa.exitanteSexo.values()) {
            SexoComboBox.addItem(sexo);

        }
        for (Jean.existanteMaterial material : Jean.existanteMaterial.values()) {
            MaterialComboBox.addItem(material);

        }

        MaterialComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                agreagarAlCarritoButton.setText("Agreagar al carrito para : " + getItemPrice() ); //getItemPrice());
            }
        });
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
    }

    public JPanel getPanelMain() {
        return MainJean;
    }

    public int getItemPrice(){
        return ColorComboBox.getSelectedItem().toString().length() + TamanoComboBox.getSelectedItem().toString().length()*3+ SexoComboBox.getSelectedItem().toString().length() +MaterialComboBox.getSelectedItem().toString().length() ;
    }

    public Jean CreateRopa(){
        return new Jean((double) getItemPrice(), Ropa.exitanteSexo.valueOf(SexoComboBox.getSelectedItem().toString()),Ropa.exitanteTallaje.valueOf(TamanoComboBox.getSelectedItem().toString()) ,Ropa.exitanteColor.valueOf(ColorComboBox.getSelectedItem().toString()),Jean.existanteMaterial.valueOf(MaterialComboBox.getSelectedItem().toString()));
    }


    public JButton getVolverButton() {
        return volverButton;
    }

    public JButton getAgreagarAlCarritoButton() {
        return agreagarAlCarritoButton;
    }
}
