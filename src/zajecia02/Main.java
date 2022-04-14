package zajecia02;

public class Main {
    public static void main(String[] args) {
        Publiczna publiczna = new Publiczna();
        System.out.println(publiczna.polePubliczne);

        Prywatne prywatne = new Prywatne();

        Domyslne domyslne = new Domyslne();
        System.out.println(domyslne.domyslne);



    }
}
