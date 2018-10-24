package gradle.cucumber;

public class CeldaEnemigo extends Celda {

    public CeldaEnemigo(){
        super(0,0);

    }
    public boolean esVacia()
    {
        return true; //Esto esta como el orto, entre otras cosas ;-(
    }

    public boolean esEnemigo() {
        return true;
    }
}
