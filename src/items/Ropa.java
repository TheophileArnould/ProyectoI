package items;

import java.awt.*;

public abstract class Ropa {
    private double precio;
    private char sexo;
    private exitanteTallaje tallaje;
    public enum exitanteTallaje {
        XS,S,M,L,XL,XLL;
    }
    private exitanteColor color;
    public enum exitanteColor {
        RED,BLUE,GREEN;
    }
    private Image image;

    public Ropa(double precio, char sexo, exitanteTallaje tallaje, exitanteColor color) {
        this.precio = precio;
        this.sexo = sexo;
        this.tallaje = tallaje;
        this.color = color;
        this.image = image;
    }
    public Ropa(double precio, char sexo, exitanteTallaje tallaje, exitanteColor color, Image image) {
        this(precio,sexo,tallaje,color);
        this.image = image;
    }

    public double getPrecio() {
        return precio;
    }

    public char getSexo() {
        return sexo;
    }

    public exitanteTallaje getTallaje() {
        return tallaje;
    }

    public exitanteColor getColor() {
        return color;
    }

    public Image getImage() {
        return image;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setTallaje(exitanteTallaje tallaje) {
        this.tallaje = tallaje;
    }

    public void setColor(exitanteColor color) {
        this.color = color;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "precio=" + precio +
                ", sexo=" + sexo +
                ", tallaje=" + tallaje +
                ", color=" + color +
                ", image=" + image +
                '}';
    }
}
