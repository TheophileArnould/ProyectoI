package items;

public class Camisa extends Ropa{
    private double tallajeMangas;

    public Camisa(double precio, char sexo, exitanteTallaje tallaje, exitanteColor color) {
        super(precio, sexo, tallaje, color);
    }

    @Override
    public String toString() {
        return "Camisa{" +
                super.toString() +
                ", tallajeMangas=" + tallajeMangas +
                '}';
    }
}
