package zajecia08.pracaDomowa;

import java.lang.reflect.Array;
import java.util.*;

public class Wdomu {

    public static void main(String[] args) {
        //napisac klasę generyczną reprezentującą parę jaką kolwiek
        List<String> listaImion = new ArrayList<>();
        listaImion.add("Marcin");
        listaImion.add("Ala");
        listaImion.add("Tomek");
        listaImion.add("Jan");

        System.out.println(listaImion);
        System.out.println(policzSamogloski(listaImion));

        System.out.println("Lotek");
        System.out.println(zwrocLiczbyZlotka());


        Map<String, Integer> grzybobranie = new HashMap<>();
        if (grzybobranie.containsKey("prawdziwek")) {
            Integer prawdziwek = grzybobranie.get("prawdziwek");
            grzybobranie.put("prawdziwiek", prawdziwek + 1);
        } else {
            grzybobranie.put("prawdziwek", 1);
        }


    }

    public static int policzSamogloski(List<String> listaStringow) {
        char[] samogloski = {'a', 'ą', 'e', 'ę', 'i', 'o', 'u', 'y'};
        String samogloskiString = Arrays.toString(samogloski);

        int licznikWystapien = 0;
        // przechodzimy po elementach listy
        for (String imie : listaStringow) {
            System.out.println("Analizuje " + imie);
            // przechodzimy po kazdym znaku elementu
            for (int i = 0; i < imie.length(); i++) {
                if (samogloskiString.contains(("" + imie.charAt(i)).toLowerCase(Locale.ROOT))) {
                    licznikWystapien++;
                }
            }
        }
        return licznikWystapien;
    }

    // Wyswietl ile razy we wszystkich imionach była użyta samogłoska
    public static int iloscSamoglosek(List<String> imiona) {
        int licznik = 0;

        char[] samogloski = {'a', 'e', 'i', 'o', 'u', 'y', 'ą', 'ę', 'ó'};

        for (String wczytane : imiona) {
            for (int i = 0; i < wczytane.length(); i++) {
                for (char znak : samogloski) {
                    if (wczytane.toLowerCase().charAt(i) == znak) {
                        licznik++;
                    }
                }
            }
        }
        return licznik;
    }

    public static List<String> zwrocListeImion(List<String> imiona) {
        List<String> listaImionZwracanych = new ArrayList<>();
        for (String element : imiona) {
            if (element.length() > 5 && element.length() % 2 == 0) {
                listaImionZwracanych.add(element);
            }
        }
        return listaImionZwracanych;
    }
    public static HashSet<Integer> zwrocLiczbyZlotka(){
        HashSet<Integer> wylosowaneLiczby = new HashSet<>();
        while (wylosowaneLiczby.size() < 6){
            int los = (int) ((Math.random()*45) + 1);
            wylosowaneLiczby.add(los);
        }
    return wylosowaneLiczby;
    }


}
