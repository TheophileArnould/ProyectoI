package Mercado.items;

public class Jean extends Ropa{
    private existanteMaterial material;

    public Jean(double precio, exitanteSexo sexo, exitanteTallaje tallaje, exitanteColor color) {
        super(precio, sexo, tallaje, color);
    }

    public enum existanteMaterial{
        JEAN,JOGGING,LINO;
    }
}
