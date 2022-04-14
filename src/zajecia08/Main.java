package zajecia08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Jedz klasaAnonimowa = new Jedz() {
            @Override
            public void jedz() {
                System.out.println("JADE");
            }
        };
        klasaAnonimowa.jedz();

        Jedz lambda = () -> System.out.println("Jade z lambdy");
        lambda.jedz();

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Ala");
        strings.add("Kota");
        strings.add("ma");
        strings.add("malego");
        strings.add("I");
        strings.add("Duzego");

        List<Integer> collect = strings.stream()
                .map(s -> s.length())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect);

        String imie = "Tomek";
        Function<String, Integer> zwrocDlugoscStringa = s -> {
            return s.length();
        };
        System.out.println(zwrocDlugoscStringa.apply(imie));

        Consumer<String> wyswietlString = t -> {
            System.out.println(t);
        };
        wyswietlString.accept(imie);
        Supplier<Double> zwrocInteger = () -> Math.random();

        System.out.println(zwrocInteger.get());
        Predicate<Integer> sprawdzParzysta = h -> {
            if (h % 2 == 0) {
                return true;
            } else {
                return false;
            }

        };
        System.out.println(sprawdzParzysta.test(4));

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> {
            return (s1 + s2).length();
        };
        System.out.println(biFunction.apply("lala","la"));

    }
}
