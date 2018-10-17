package gradle.cucumber;

public class Mapa {

    private Celda celdaContigua;

    public void Mapa(){

    }

    public void colocarBomberman(Bomberman bomberman) {
        bomberman.moverse(new Celda());
    }

    public void mover(Bomberman bomberman) {
        if (celdaContigua.esVacia())
        {
            bomberman.moverse(celdaContigua);
        }
    }

    public void setCeldaContigua(Celda celda) {
        celdaContigua=celda;
    }
}

