package zajecia16;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;

public class Main {

    // TODO Zrobic iteracyjnie i wrocic do tego!
    static int fib(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else
            return fib(num - 1) + fib(num - 2);
    }

    /**
 dla 15 -> 3,5,6,9,10,12,15
 **/
    //Zadanie codeWars
    public static int solution(int number) {
        int suma = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0) {
                suma += i;
            } else if (i % 5 == 0) {
                suma += i;
            } else if (i % 3 == 0 && i % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        //Zadanie 1
        List<String> zwierzeta = List.of("Kot", "Pies", "Kura", "Kon", "Krowa");
        int tab[] = {3, 8, 9, 7, 6};
        int n = 3;

        int result[] = new int[tab.length];
        for (int i = 0; i < tab.length - n; i++) {
            result[i + n] = tab[i];
        }

        /*
        7 -> indeks 3 + n = 5 - size = 0
        6 -> indeks 4 + n = 6 - szie = 1;
        size = 5
        n = 2
        1. Na ktorym miejscu znajduje sie liczba ktora jako pierwsza bd przesunieta?
        2. Jak sie do niej dostac (indeksu) za pomoca wzoru?
         */
        for (int i = 0; i < n; i++) {
            result[i] = tab[tab.length - n + i];
        }

        System.out.println(Arrays.toString(result));

        String text = "Janek";
        text += "ala";

        System.out.println("STRING");
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < 1_000_00; i++) {
            s += "a";
        }
        long stop = System.nanoTime();
        System.out.println(stop - start);


        System.out.println("STRING BUILDER");
        start = System.nanoTime();
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < 1_000_00; i++) {
            ss.append("a");
        }
        stop = System.nanoTime();
        System.out.println(stop - start);

        Integer integer = 10;
        int incik = integer;
        //Zadanie 2
        // 3 to wypiosz czesc
        // 5 to siema
        // 3 i 5 to wypisz elo
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        if (liczba % 3 == 0 && liczba % 5 != 0) {
            System.out.println("czesc");
        } else if (liczba % 5 == 0 && liczba % 3 != 0) {
            System.out.println("siema");
        } else if (liczba % 5 == 0 && liczba % 3 == 0) {
            System.out.println("elo");
        }
        //Zadanie 3
        System.out.println(fib(4));
        //Zadanie codeWars
        System.out.println(solution(15));

    }
}
