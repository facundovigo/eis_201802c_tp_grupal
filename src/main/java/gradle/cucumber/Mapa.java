package gradle.cucumber;

public class Mapa {

    private Celda celdaContigua;
    private Celda celdaPared;
    private Celda[][] celdas;

    public void Mapa(){

    }

    public void colocarBomberman(Bomberman bomberman) {
        bomberman.setPosition(0,0);
    }

    public void mover(Bomberman bomberman, Celda celda) {
        if (celda.esVacia())
        {
            bomberman.moverse(celda.getEjeX(),celda.getEjey());
        }
    }

    public void setCeldaContigua(Celda celda) {
        celdaContigua=celda;
    }

    public void setCelda(Integer posX, Integer posY) {
        celdas[posX][posY] = new Celda(posX,posY);
    }
}

