package zajecia07.PracaDomowa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaImion = new ArrayList<>();
        listaImion.add("Iwona");
        listaImion.add("Martyna");
        listaImion.add("Kasia");
        listaImion.add("Marysia");
        listaImion.add("Irena");

        List<String> listaImion2 = new ArrayList<>();
        listaImion2.add("Irena");
        listaImion2.add("Marcin");


        System.out.println(zwrocListeZawierajacaDanyZnak(listaImion, "I"));
        System.out.println(zwrocWspolneElementy(listaImion, listaImion2));

        System.out.println("Kolejnosc podstawowa");
        System.out.println(listaImion);
        System.out.println("Kolejnosc odwrocona");
        System.out.println(odwrocKolejnoscListy(listaImion));


        System.out.println(odwrocKolejnoscListy2(listaImion2));

    }

    //Zadanie 1
    public static List<String> zwrocListeZawierajacaDanyZnak(List<String> listaStringow, String znak) {
        List<String> listaZawierajacaZnak = new ArrayList<>();
        for (String lista : listaStringow) {
            if (lista.contains(znak)) {
                listaZawierajacaZnak.add(lista);
            }
        }
        return listaZawierajacaZnak;
    }

    //Zadanie 2
    public static List<String> zwrocWspolneElementy(List<String> lista1, List<String> lista2) {
        List<String> listaWspolnychElementow = new ArrayList<>();
        for (String lista : lista1) {
            if (lista2.contains(lista)) {
                listaWspolnychElementow.add(lista);
            }
        }
        return listaWspolnychElementow;
    }

    //Zadanie 3
    public static List<String> odwrocKolejnoscListy(List<String> listaElementow) {
        Collections.reverse(listaElementow);
        return listaElementow;
    }


    public static List<String> odwrocKolejnoscListy2(List<String> listaElementow) {
        List<String> listaStringow = new ArrayList<>();
        for (int i = listaElementow.size() - 1; i >= 0; i--) {
            listaStringow.add(listaElementow.get(i));
        }
        return listaStringow;
    }


}