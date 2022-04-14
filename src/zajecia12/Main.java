package zajecia12;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {



        Predicate<Integer> zwrocOsobePelnoletnia = (wiek) -> wiek >= 18;
        System.out.println(zwrocOsobePelnoletnia.test(18));

        Function<String,String> zamienNaDuzeLitery = (napis) -> napis.toUpperCase(Locale.ROOT);
        System.out.println(zamienNaDuzeLitery.apply("abcd"));

        


    }
}
