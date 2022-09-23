public class Boleto {
    Tren tren;
    Trayecto trayecto;
    Tramo tramo;
    Integer numeroVagon;
    Integer fila;
    Character posicion;

    public Boleto(Tren tren, Trayecto trayecto, Tramo tramo, Integer numeroVagon, Integer fila, Character posicion) {
        this.tren = tren;
        this.trayecto = trayecto;
        this.tramo = tramo;
        this.numeroVagon = numeroVagon;
        this.fila = fila;
        this.posicion = posicion;
    }
}
