package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicStepdefs {
    Mapa mapa;
    @Given("Un mapa")
    public void creoUnMapaVacio() throws Throwable {
        mapa = new Mapa();
    }

    @Given("una celda vacia a derecha")
    public boolean tengoUnaCeldaVaciaADerecha() throws Throwable {
        return mapa.esVaciaADerecha();
    }

    @When ("cuando se mueve a una celda vacia")
    public void moverseAUnaCelda(){
        Bomberman b = new Bomberman();
        mapa.colocarBomberman(b);

        b.moverADerecha(mapa);

    }

    @Then( "Bomberman cambia su posicion")
    public void bombermanTienePosicionNueva(){
        assertEquals(2, mapa.posicionXBomberman());
        assertEquals(1, mapa.posicionYBomberman());
    }
}
