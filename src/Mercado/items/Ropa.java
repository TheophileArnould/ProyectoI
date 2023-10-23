package Mercado.items;

import java.awt.*;

public abstract class Ropa {
    private double precio;
    private exitanteSexo sexo;
    private exitanteTallaje tallaje;

    public enum exitanteSexo{
        HUMBRE,MUJER,NO_BINARIO,HELICOPTERO_DE_COMBATO,OTRO
    }
    public enum exitanteTallaje {
        XS,S,M,L,XL,XLL;
    }
    private exitanteColor color;
    public enum exitanteColor {
        RED,BLUE,GREEN;
    }

    public Ropa(double precio, exitanteSexo sexo, exitanteTallaje tallaje, exitanteColor color) {
        this.precio = precio;
        this.sexo = sexo;
        this.tallaje = tallaje;
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public exitanteSexo getSexo() {
        return sexo;
    }

    public exitanteTallaje getTallaje() {
        return tallaje;
    }

    public exitanteColor getColor() {
        return color;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSexo(exitanteSexo sexo) {
        this.sexo = sexo;
    }

    public void setTallaje(exitanteTallaje tallaje) {
        this.tallaje = tallaje;
    }

    public void setColor(exitanteColor color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Ropa{" +
                "precio=" + precio +
                ", sexo=" + sexo +
                ", tallaje=" + tallaje +
                ", color=" + color +
                '}';
    }
}
