package PapierKamienNozyce;


public class Arena {
    public static void main(String[] args) {
        S24906 gracz1 = new S24906();
        GraczDrugi gracz2 = new GraczDrugi();

        for (int i = 0; i < 1000; i++) {

            int fakeGracz1 = gracz1.fake();
            int fakeGracz2 = gracz2.fake();

            int playGracz1 = gracz1.play(fakeGracz2);
            System.out.println("Gracz1 rzucil " + playGracz1);
            int playGracz2 = gracz2.play(fakeGracz1);
            System.out.println("Gracz2 rzucil " + playGracz2);

            if (playGracz1 == playGracz2) {
                System.out.println("REMIS");
            } else if (playGracz1 == AdvancedGamer.NOZYCE && playGracz2 == AdvancedGamer.PAPIER ||
                    playGracz1 == AdvancedGamer.PAPIER && playGracz2 == AdvancedGamer.KAMIEN ||
                    playGracz1 == AdvancedGamer.KAMIEN && playGracz2 == AdvancedGamer.NOZYCE) {
                System.out.println("WYGRYWA " + gracz1.name());
                gracz1.wynikGraczPierwszy++;
                gracz1.result(true, playGracz2);
            } else {
                System.out.println("WYGRYWA " + gracz2.name());
                gracz2.wynikGraczDrugi++;
                gracz1.result(false, playGracz2);
            }

        }
        System.out.println("Gracz1 wynik - " + gracz1.wynikGraczPierwszy);
        System.out.println("Gracz2 wynik - " + gracz2.wynikGraczDrugi);
    }
}
