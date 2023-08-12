package items;

import java.awt.*;

public class Camisa extends Ropa{
    private double tallajeMangas;

    public Camisa(double precio, char sexo, exitanteTallaje tallaje, exitanteColor color, Image image) {
        super(precio, sexo, tallaje, color, image);
    }
}
