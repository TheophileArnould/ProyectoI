package items;

import java.awt.*;

public class Jean extends Ropa{
    private existanteMaterial material;

    public Jean(double precio, char sexo, exitanteTallaje tallaje, exitanteColor color, Image image) {
        super(precio, sexo, tallaje, color, image);
    }

    public enum existanteMaterial{
        JEAN,JOGGING,LINO;
    }
}
