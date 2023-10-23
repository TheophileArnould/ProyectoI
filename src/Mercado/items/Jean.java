package Mercado.items;

public class Jean extends Ropa{
    private existanteMaterial material;

    public Jean(double precio, exitanteSexo sexo, exitanteTallaje tallaje, exitanteColor color,existanteMaterial material) {
        super(precio, sexo, tallaje, color);
        this.material = material;
    }

    public enum existanteMaterial{
        JEAN,JOGGING,LINO;
    }

    @Override
    public String toString() {
        return "Jean{" +
                super.toString() +
                ", material=" + material +
                '}';
    }
}
