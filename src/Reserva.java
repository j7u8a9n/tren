import java.util.Date;

public class Reserva {
    String localizador;
    Date fechaEmision;
    Trayecto trayecto;

    public Reserva(String localizador, Date fechaEmision, Trayecto trayecto) {
        this.localizador = localizador;
        this.fechaEmision = fechaEmision;
        this.trayecto = trayecto;
    }
}
