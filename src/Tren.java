public class Tren {
    int codigo;
    Tren tren;

    public Tren(Tren tren) {
        this.tren = tren;
    }

    public Tren(int codigo) {
        this.codigo = codigo;

    }

    @Override
    public String toString() {
        return "Tren{" +
                "codigo=" + codigo +
                '}';
    }
}
