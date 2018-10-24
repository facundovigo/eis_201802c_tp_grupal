Feature: Gradle-Cucumber integration

  Scenario:  Bomberman Se mueve a una celda contigua y la celda esta vacia
    Given Un mapa
    Given una celda contigua vacia
    Given Bomberman en una celda del mapa
    When cuando se mueve a la celda contigua
    Then Bomberman cambia su posicion

  Scenario:  Bomberman Se mueve a una celda contigua y la celda es pared
    Given Un mapa
    Given una celda contigua pared
    Given Bomberman en una celda del mapa
    When cuando se mueve a la celda contigua
    Then Bomberman NO cambia su posicion

  Scenario:  Bomberman Se mueve a una celda contigua y hay un enemigo
    Given Un mapa
    Given una celda contigua enemigo
    Given Bomberman en una celda del mapa
    When cuando se mueve a la celda contigua
    Then Bomberman muere

  Scenario:  Bomberman suelta una bomba en el sitio donde esta
    Given Un mapa
    Given una celda donde hay una pared de melamina
    Given Bomberman en una celda del mapa
    When cuando deja bomba
    Then Rompe la pared de melamina