package Mercado.items;

public class Camisa extends Ropa{
    private double tallajeMangas;

    public Camisa(double precio, exitanteSexo sexo, exitanteTallaje tallaje, exitanteColor color,double tallajeMangas) {
        super(precio, sexo, tallaje, color);
        tallajeMangas = tallajeMangas;
    }


    @Override
    public String toString() {
        return "Camisa{" +
                super.toString() +
                ", tallajeMangas=" + tallajeMangas +
                '}';
    }
}
