package items;

import java.awt.*;

public class Vestido extends Ropa{
    private int largo; // en centimetro

    public Vestido(double precio, char sexo, exitanteTallaje tallaje, exitanteColor color, Image image) {
        super(precio, sexo, tallaje, color, image);
    }
}
