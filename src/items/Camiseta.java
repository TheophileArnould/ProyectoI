package items;

import java.awt.*;

public class Camiseta extends Ropa{
    private exitanteEstampados estampados;

    public Camiseta(double precio, char sexo, exitanteTallaje tallaje, exitanteColor color, Image image) {
        super(precio, sexo, tallaje, color, image);
    }

    public enum exitanteEstampados {
        CERCULO,RAYADO,LISO;
    }
}
