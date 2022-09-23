import java.util.Date;
public class Tramo {
    Ciudad origen;
    Ciudad destino;
    Date horaSalida;
    double duracion;

    public Tramo(Ciudad origen, Ciudad destino, Date horaSalida, double duracion) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.duracion = duracion;
    }
}
