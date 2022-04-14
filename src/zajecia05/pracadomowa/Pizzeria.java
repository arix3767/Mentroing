package zajecia05.pracadomowa;

import java.util.Scanner;

public class Pizzeria {

    public static void wypiszInfoPizze() {

        Pizza[] pizze = Pizza.values();
        for (int i = 0; i < pizze.length; i++) {
            System.out.println("NAZWA PIZZY - " + pizze[i]);
            pizze[i].wyswietlInformacje();
//            System.out.println("Co zawiera");
//            System.out.println("sos pomidorowy - " + pizze[i].sosPomidorowy);
//            System.out.println("ser - " + pizze[i].ser);
//            System.out.println("pieczarki - " + pizze[i].pieczarki);
//            System.out.println("szynka - " + pizze[i].szynka);

        }

    }

    public static void zamowienie() {
        System.out.println("Podaj swoje zamowienie");
        Scanner scanner = new Scanner(System.in);
        String pizza = scanner.nextLine();
        if (pizza.equals("capriciosa") || pizza.equals("margherita") || pizza.equals("prsciutto")) {
            System.out.println("Dziękujemy za zamowienie pizzy: " + pizza);
        } else {
            System.out.println("Nie posiadamy takiej pizzy w ofercie:");
        }
    }

}
