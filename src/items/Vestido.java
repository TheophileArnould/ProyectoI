package items;

public class Vestido extends Ropa{
    private int largo; // en centimetro

    public Vestido(double precio, char sexo, exitanteTallaje tallaje, exitanteColor color, int largo) {
        super(precio, sexo, tallaje, color);
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Vestido{ "+
                super.toString() +
                ", largo=" + largo +
                '}';
    }
}
