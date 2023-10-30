package Mercado.items;

public class Camiseta extends Ropa{
    private exitanteEstampados estampados;

    public Camiseta(double precio, exitanteSexo sexo, exitanteTallaje tallaje, exitanteColor color,exitanteEstampados estampados) {
        super(precio, sexo, tallaje, color);
        this.estampados = estampados;
    }

    public enum exitanteEstampados {
        CERCULO,RAYADO,LISO;
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                super.toString() +
                ", estampados=" + estampados +
                '}';
    }
}
