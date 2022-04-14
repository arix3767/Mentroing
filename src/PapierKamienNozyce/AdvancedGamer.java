package PapierKamienNozyce;

public interface AdvancedGamer {

    int KAMIEN = 1;
    int PAPIER = 2;
    int NOZYCE = 3;

    String name();

    int fake();

    int play(int fake);

    void result(boolean score, int enemyMove);

}
