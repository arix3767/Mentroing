package zajecia15;

import java.util.*;

public class Main {

    private static Map<String, Integer> mapaGrzybow = new HashMap<>();

    public static void main(String[] args) {
        dodajOkaz("borowik", 2);
        dodajOkaz("kurka", 1);
        dodajOkaz("borowik", 3);
        dodajOkaz("kozik", 3);
        wypiszGrzyby();

        List<Integer> dlugoscZlowionychSzczupakow = new ArrayList<>();
        dlugoscZlowionychSzczupakow.add(50);
        dlugoscZlowionychSzczupakow.add(49);
        dlugoscZlowionychSzczupakow.add(5);
        dlugoscZlowionychSzczupakow.add(20);
        dlugoscZlowionychSzczupakow.add(33);
        dlugoscZlowionychSzczupakow.add(68);
        dlugoscZlowionychSzczupakow.add(20);
        wypiszBezDuplikatow(dlugoscZlowionychSzczupakow);
    }

    public static void dodajOkaz(String nazwaGrzyba, Integer iloscGrzybow) {
        // to co jest nizej, robimy jezeli nie ma danego klucza w mapie

        // wpw sprawdzamy ile jest grzybow pod danym kluczem, pobieramy ta wartosc dodajemy do niej zebrane grzyby
        // i znowu wsadzamy do mapy
        if (mapaGrzybow.containsKey(nazwaGrzyba)){
            Integer iloscDotychczasowychGrzybow = mapaGrzybow.get(nazwaGrzyba);
            int lacznaIloscGrzybow = iloscDotychczasowychGrzybow + iloscGrzybow;
            mapaGrzybow.put(nazwaGrzyba,lacznaIloscGrzybow);
        }else {
            mapaGrzybow.put(nazwaGrzyba, iloscGrzybow);
        }
    }

    public static void wypiszGrzyby() {
        System.out.println(mapaGrzybow);
    }

    public static void wypiszBezDuplikatow(List<Integer> lista) {
        Set<Integer> setRyb = new HashSet<>();
//        setRyb.addAll(lista);
        System.out.println(setRyb);
//
    }


}
