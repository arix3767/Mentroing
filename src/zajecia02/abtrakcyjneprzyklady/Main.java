package zajecia02.abtrakcyjneprzyklady;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod();
        Autobus autobus = new Autobus();
        Pojazd[] wszystkiePojazdy = new Pojazd[]{samochod, autobus};

        System.out.println("Fori");
        for (int i = 0; i < wszystkiePojazdy.length; i++) {
            wszystkiePojazdy[i].dajOdglos();
        }

        System.out.println("For-each");
        for (Pojazd pojazd: wszystkiePojazdy) {
            pojazd.dajOdglos();
        }

    }
}

//class Pojazd {
//    public void dajOdglos() {
//        System.out.println("Brunm");
//    }
//}

abstract class Pojazd {
    public abstract void dajOdglos();
}

class Samochod extends Pojazd {
    @Override
    public void dajOdglos() {
        System.out.println("Klakson!");
    }
}

class Autobus extends Pojazd {
    public void dajOdglos() {
        System.out.println("Brunm");
    }
}
