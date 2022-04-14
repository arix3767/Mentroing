package PapierKamienNozyce;

public class S24906 implements AdvancedGamer {

    int ilosc = 0;
    int wynikGraczPierwszy = 0;

    private boolean ostatniWynik;
    private int ostatniRuch;

    @Override
    public String name() {
        return "Jan";
    }

    @Override
    public int fake() {
        return (ilosc++ % 3) + 1;

    }

    @Override
    public int play(int fake) {
        if (fake == AdvancedGamer.KAMIEN) {
            return AdvancedGamer.PAPIER;
        } else if (fake == AdvancedGamer.PAPIER) {
            return AdvancedGamer.NOZYCE;
        } else if (fake == AdvancedGamer.NOZYCE) {
            return AdvancedGamer.KAMIEN;
        } else {
            throw new IllegalArgumentException("Nie ma takiego zagrania");
        }
    }

    @Override
    public void result(boolean score, int enemyMove) {
        ostatniWynik = score;
        ostatniRuch = enemyMove;
    }
}
