package PapierKamienNozyce;

public class GraczDrugi implements AdvancedGamer {

    int wynikGraczDrugi = 0;

    @Override
    public String name() {
        return "Gracz drugi";
    }

    @Override
    public int fake() {
        return (int) ((Math.random() * (4 - 1)) + 1);
    }

    @Override
    public int play(int fake) {
        if (fake < 2) {
            return AdvancedGamer.NOZYCE;
        } else {
            return AdvancedGamer.PAPIER;
        }
    }

    @Override
    public void result(boolean score, int enemyMove) {

    }
}
