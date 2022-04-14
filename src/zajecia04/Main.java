package zajecia04;

public class Main {
    public static void main(String[] args) {
        Muzyk [] muzycy = {
          new Skrzypek("Aleks", 2),
          new Wiolonczelista("Bartek", 1),
          new Flecista("Czarek", 0.5),
        };

        for (Muzyk muzyk : muzycy) {
            System.out.println("Muzyk " + muzyk.getImie() + "\n" +
                    "Instrument " + muzyk.instrument() + "\n" +
                    "Czas " + muzyk.getCzasWystapienia() + "\n" +
                    "Stawka " + muzyk.stawkaGodzinowa() + "\n");
        }

        System.out.println(Muzyk.maxHonorarium(muzycy));



    }
}
