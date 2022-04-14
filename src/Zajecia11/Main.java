package Zajecia11;


import zajecia01.Student;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Jan","s24906",2002);
        Student student1 = new Student("Tomek","s2222",2000);
        Student student2 = new Student("Zygmunt","s21222",2001);


        Map<Student, List<String>> mapa = new TreeMap<>();

        mapa.put(student, Arrays.asList("PPJ", "WDZ"));
        mapa.put(student1, Arrays.asList("GUI", "ANG"));
        mapa.put(student2, Arrays.asList("MAD", "WDZ"));


        System.out.println(mapa);
//        mapa.forEach();


        Function<String,Integer> dlugoscStringa = (String x) -> x.length();
        Function<String,Integer> dlugoscStringa2 = (x) -> x.length();
        Function<String,Integer> dlugoscStringa3 = x -> x.length();

        test(dlugoscStringa3);
        test(dlugoscStringa2);

        dlugoscStringa3.apply("Tets!");

        Supplier<String> supplier1 = () -> "Hello World";
    }

    public static void test(Function<String,Integer> func) {
        func.apply("CZESC");
    }
}
