package zajecia09;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Uczen uczen1 = new Uczen("Tomek", "Nowak", 20);
        Uczen uczen2 = new Uczen("Jan", "Kowalski", 24);
        Uczen uczen3 = new Uczen("Mateusz", "Kowalski", 24);
        Uczen uczen4 = new Uczen("Arek", "Mijakowski", 14);
        Uczen uczen5 = new Uczen("Oliwia", "Sabala", 64);
        Uczen uczen6 = new Uczen("Agnieszka", "Kon", 22);

        Przedmiot przedmiot1 = new Przedmiot("mlotek");
        Przedmiot przedmiot2 = new Przedmiot("pilka");

        Grupa grupa = new Grupa();
//        grupa.grupaDodajprzedmiot(przedmiot1);
//        grupa.grupaDodajprzedmiot(przedmiot2);
//
//        grupa.grupaDodajUcznia(uczen1);
//        grupa.grupaDodajUcznia(uczen2);

//        System.out.println(grupa);

        HashMap<String, Uczen> mapaUczniow = new HashMap<>();
        mapaUczniow.put("1a", uczen1);
        mapaUczniow.put("1a", uczen2);
        mapaUczniow.put("1a", uczen3);

//        Set<String> kluczeMapy = mapaUczniow.keySet();
//        for (String klucze : kluczeMapy) {
//            System.out.println(klucze);
//        }
//        Collection<Uczen> values = mapaUczniow.values();
//        for (Uczen uczen : values) {
//            System.out.println(uczen);
//        }
//
//        for (Map.Entry<String, Uczen> entry : mapaUczniow.entrySet()) {
//            System.out.println("Klucz: " + entry.getKey() + " Wartosc: " + entry.getValue());
//        }

        HashMap<String, List<Uczen>> mapaStudentow = new HashMap<>();
        List<Uczen> listaUcznziow = List.of(uczen1, uczen2, uczen3);
        List<Uczen> listaUcznziow2 = List.of(uczen4, uczen5, uczen6);
        mapaStudentow.put("15c", listaUcznziow);
        mapaStudentow.put("25c", listaUcznziow2);

        for (Map.Entry<String, List<Uczen>> mapaUczelni : mapaStudentow.entrySet()) {
            for (Uczen uczen : mapaUczelni.getValue()) {
                if (uczen.getWiek() >= 24){
                    System.out.println("mapa uczelni" + mapaUczelni.getValue());
                }
            }
//            System.out.println("Grupa: " + mapaUczelni.getKey() + " Uczniowie: " + mapaUczelni.getValue());
        }


    }
}
