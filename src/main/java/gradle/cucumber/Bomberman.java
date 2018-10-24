package gradle.cucumber;

public class Bomberman {

    private Celda celdaActual;
    public Integer posY;
    public Integer posX;

    public Bomberman()
    {

    }

    public void moverse(Integer x, Integer y){
        posX=x;
        posY=y;
        this.celdaActual= new Celda(x, y);
    }

    public Celda getCeldaActual() {
        return celdaActual;
    }

    public boolean estaMuerto() {
        return celdaActual.esEnemigo();
    }

    public void setPosition(Integer x, Integer y) {
        this.posX=x;
        this.posY=y;
    }

}
