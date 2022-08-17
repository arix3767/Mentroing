package zajecia17.Kregle;

import java.util.Scanner;

import static zajecia17.Kregle.Gracz.dodajGracza;
import static zajecia17.Kregle.Gracz.zagrajJednaRunde;

public class Main {
    public static void main(String[] args) {
        int liczba;
        Gracz gracz1 = new Gracz("Jan","Kowalczyk",500185135);
        do {

            System.out.println("Nacisnij 1 aby dodać gracza");
            System.out.println("Naciśnij 2 aby zagrac 1 runde");
            System.out.println("Naciśnij 20 aby zakończyć działanie aplikacji");
            Scanner scanner = new Scanner(System.in);
            liczba = scanner.nextInt();

            switch (liczba) {
                case 1:
                    dodajGracza();
                    break;
                case 2:
                    zagrajJednaRunde();
                    break;
                case 20:
                    System.out.println("Zakończyłeś działanie aplikacji");
                    break;
                default:
                    System.out.println("Nie ma takiego wyboru");
            }

        } while (liczba != 20);
    }
}
