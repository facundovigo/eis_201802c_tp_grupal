package gradle.cucumber;

public class CeldaPared extends Celda {
    public CeldaPared(){
        super(0,0);
    }

    public boolean esVacia() {
        return false;
    }
    public boolean esEnemigo() {
        return false;
    }
}
