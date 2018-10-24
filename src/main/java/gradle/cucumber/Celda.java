package gradle.cucumber;

public class Celda {

    private final Integer ejeX;
    private final Integer ejey;
    private  Integer elementos;
    private  Pared pared = new Pared();

    public Celda (Integer x, Integer y) {
        ejeX = x;
        ejey = y;
        elementos = 0;
    }

    public Celda (Integer x, Integer y,Pared p) {
        ejeX = x;
        ejey = y;
        pared= p;
        elementos = 1;
    }

    public Integer getEjeX() {
        return ejeX;
    }

    public Integer getEjey() {
        return ejey;
    }

    public boolean esVacia() {

        return elementos==0;
    }

    public void  agregarPared(Pared p){

            this.pared=p;
            this.elementos=1;
    }

    public boolean esEnemigo() {
        return false;
    }
}
