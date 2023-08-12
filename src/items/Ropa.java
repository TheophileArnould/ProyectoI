package items;

import java.awt.*;

public class Ropa {
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

}
