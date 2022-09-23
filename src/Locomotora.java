public class  Locomotora {
    int codigo;
    Tren tren;

    public Locomotora() {

    }
    public Locomotora(int codigo) {
        this.codigo = codigo;
    }

    public Locomotora(int codigo, Tren tren) {
        this.codigo = codigo;
        this.tren = tren;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "codigo=" + codigo +
                ", tren=" + tren +
                '}';
    }
}
