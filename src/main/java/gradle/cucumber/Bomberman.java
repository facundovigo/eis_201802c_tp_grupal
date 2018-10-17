package gradle.cucumber;

public class Bomberman {

    private Celda celdaActual;

    public Bomberman()
    {

    }

    public void moverse(Celda celdaDestino)
    {
        celdaActual=celdaDestino;
    }

    public Celda getCeldaActual() {
        return celdaActual;
    }

    public boolean estaMuerto() {
        return celdaActual.esEnemigo();
    }
}
