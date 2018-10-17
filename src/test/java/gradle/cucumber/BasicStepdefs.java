package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class BasicStepdefs {
    Mapa mapa;
    Bomberman b;
    Celda celda =new Celda();
    CeldaPared celdaPared = new CeldaPared();
    CeldaEnemigo celdaEnemigo = new CeldaEnemigo();

    @Given("Un mapa")
    public void unMapa() throws Throwable {
        mapa = new Mapa();
    }

    @Given("una celda contigua vacia")
    public void unaCeldaContiguaVacia() throws Throwable {
        mapa.setCeldaContigua(celda);

    }
    @Given("^Bomberman en una celda del mapa$")
    public void bombermanEnUnaCeldaDelMapa() throws Throwable {
        b = new Bomberman();
        mapa.colocarBomberman(b);
    }

    @When ("cuando se mueve a la celda contigua")
    public void cuandoSeMueveAUnaCeldaContiguaVacia(){
        mapa.mover(b);
    }

    @Then( "Bomberman cambia su posicion")
    public void bombermanCambiaSuPosicion(){
        assertEquals(celda,b.getCeldaActual());
    }


    @Given("^una celda contigua pared$")
    public void unaCeldaContiguaPared() throws Throwable {
        mapa.setCeldaContigua(celdaPared);
    }


    @Then("^Bomberman NO cambia su posicion$")
    public void bombermanNOCambiaSuPosicion() throws Throwable {
        assertNotEquals(celdaPared,b.getCeldaActual());
    }

    @Given("^una celda contigua enemigo$")
    public void unaCeldaContiguaEnemigo() throws Throwable {
        mapa.setCeldaContigua(celdaEnemigo);
    }


    @Then("^Bomberman muere$")
    public void bombermanMuere() throws Throwable {
        assertTrue(b.estaMuerto());
    }
}
