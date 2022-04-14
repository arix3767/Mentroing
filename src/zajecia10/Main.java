package zajecia10;

import zajecia01.Osoba;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                "office A", " John ", "Doe ",
                "office B", " John ", " Brown ",
                "office C", " Mary ", " Jones ",
                "office B", " Adam ", " Rust ",
                "office C", " Cindy ", " Frost ",
                "office A", " Kate ", "Coe ",
                "office A", " Bill ", " Brown "
        };


//        List<Person> osobyOfficeA = new ArrayList<>();
//        List<Person> osobyOfficeB = new ArrayList<>();
//        List<Person> osobyOfficeC = new ArrayList<>();

//        for (int i = 0; i < arr.length; i += 3) {
//            if (arr[i].equals("office A")) {
//                osobyOfficeA.add(new Person(arr[i + 1], arr[i + 2]));
//            } else if (arr[i].equals("office B")) {
//                osobyOfficeB.add(new Person(arr[i + 1], arr[i + 2]));
//            } else {
//                osobyOfficeC.add(new Person(arr[i + 1], arr[i + 2]));
//            }
//        }

//        Map<String, List<Person>> firma = new HashMap<>();
//        firma.put("offfice A", osobyOfficeA);
//        firma.put("offfice B", osobyOfficeB);
//        firma.put("offfice C", osobyOfficeC);
//

        Map<String, List<Person>> firma = new HashMap<>();

        for (int i = 0; i < arr.length; i += 3) {
            if (firma.containsKey(arr[i])) {
                firma.get(arr[i]).add(new Person(arr[i + 1], arr[i + 2]));
            } else {
                firma.put(arr[i], new ArrayList<Person>(List.of(new Person(arr[i + 1], arr[i + 2]))));
            }
        }
        for (Map.Entry<String, List<Person>> entry : firma.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        ArrayList<Banan> banan = new ArrayList<>();
        ArrayList<Person> person = new ArrayList<>();

        //Praca Domowa:

        Person kowalski = new Person("Jan", "Kowalski");
        Person nowak = new Person("Adam", "Nowak");
        Person krawczyk = new Person("Bartosz", "Krawczyk");
        Person heniek = new Person("Kierownik", "Heniek");

        Samochod skoda1 = new Samochod("WA00001", Samochod.Marka.SKODA);
        Samochod skoda2 = new Samochod("SC36010", Samochod.Marka.SKODA);
        Samochod mazda1 = new Samochod("WA01234", Samochod.Marka.MAZDA);
        Samochod mazda2 = new Samochod("DW01ASD", Samochod.Marka.MAZDA);
        Samochod bmw = new Samochod("WA12690", Samochod.Marka.BMW);
        Samochod volvo = new Samochod("KR60606", Samochod.Marka.VOLVO);

        Map<Person, List<Samochod>> samochodyWlasciciele = new HashMap<>();

        samochodyWlasciciele.put(kowalski, Arrays.asList(skoda1, bmw));
        samochodyWlasciciele.put(nowak, Arrays.asList(mazda2));
        samochodyWlasciciele.put(krawczyk, Arrays.asList(skoda2, volvo, mazda1));
        samochodyWlasciciele.put(heniek, Collections.emptyList());

        // 1 SPOSOB
        samochodyWlasciciele.forEach((p, l) -> {
            System.out.println("Klucz " + p);
            System.out.println("Wartosc " + l);
        });

        // 2 SPOSOB
        for (Map.Entry<Person, List<Samochod>> entry : samochodyWlasciciele.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 3 SPOSOB
        for (Person person1 : samochodyWlasciciele.keySet()) {
            System.out.println("Klucz " + person1);
            System.out.println("Wartosc " + samochodyWlasciciele.get(person1));
        }

        System.out.println("Samochody z rejestracja zaczynajace sie na WA: ");
        samochodyWlasciciele.forEach((Person osoba, List<Samochod> list) -> {
            for (Samochod samochod : list) {
                if (samochod.numerRejestracyjny.startsWith("WA")){
                    System.out.println(samochod);
                }
            }
        });



    }
}
