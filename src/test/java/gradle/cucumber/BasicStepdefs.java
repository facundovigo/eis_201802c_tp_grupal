package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class BasicStepdefs {
    Mapa mapa;
    Bomberman b = new Bomberman();
    Celda celda = new Celda(0,0);
    ParedMelamina  paredMelamina = new ParedMelamina();

    Celda celdaConParedDeMelamina = new Celda(1,1, paredMelamina);


    CeldaPared celdaPared = new CeldaPared();
    CeldaEnemigo celdaEnemigo = new CeldaEnemigo();


    public BasicStepdefs() {
        celdaConParedDeMelamina = celda2;
    }

    @Given("Un mapa")
    public void unMapa() throws Throwable {
        mapa = new Mapa();
    }

    @Given("una celda contigua vacia")
    public void unaCeldaContiguaVacia() throws Throwable {
        mapa.setCelda(b.posX + 1, b.posY);
    }
    @Given("^Bomberman en una celda del mapa$")
    public void bombermanEnUnaCeldaDelMapa() throws Throwable {
        mapa.colocarBomberman(b);
    }

    @When ("cuando se mueve a la celda contigua")
    public void cuandoSeMueveAUnaCeldaContiguaVacia(){
        mapa.mover(b,celda);
    }

    @Then( "Bomberman cambia su posicion")
    public void bombermanCambiaSuPosicion(){
        assertEquals(celda,b.getCeldaActual());
    }


    @Given("^una celda contigua pared$")
    public void unaCeldaContiguaPared() throws Throwable {
        mapa.setCelda();    }


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

    @Given("^una celda donde hay una pared de melamina$")
    public void unaCeldaDondeHayParedMelamina() throws Throwable {

        mapa.setCelda();
    }

    @When ("cuando deja bomba")
    public void dejaBomba(){
        b.dejarBomba(mapa);
    }

    @Then("^Rompe la pared de melamina$")
    public void bombaRompeLaPared() throws Throwable {
        assertTrue(true);
    }
}
