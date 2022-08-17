package zajecia17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Cat.printCatYears(1);
        Cat.printCatYears(2);
        Cat.printCatYears(10);

        Word.printReverseString("programming");

        List<String> stringList = List.of("abc", "bcd", "def");

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        stringList.forEach(string -> {
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                if (!characterIntegerHashMap.containsKey(c)) {
                    characterIntegerHashMap.put(c, 1);
                } else {
                    Integer integer = characterIntegerHashMap.get(c);
                    characterIntegerHashMap.put(c, integer + 1);
                }
            }
        });
        characterIntegerHashMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(System.out::println);
    }

}

class Cat {

    private static final int FIRST_CALENDAR_YEAR_VALUE = 15;
    private static final int SECOND_CALENDAR_YEAR_VALUE = 9;
    private static final int FOLLOWING_CALENDAR_YEAR_VALUE = 4;

    public static void printCatYears(int humanYears) {
        int catYears = 0;
        for (int year = 1; year <= humanYears; year++) {
            if (year == 1) {
                catYears += FIRST_CALENDAR_YEAR_VALUE;
            } else if (year == 2) {
                catYears += SECOND_CALENDAR_YEAR_VALUE;
            } else {
                catYears += FOLLOWING_CALENDAR_YEAR_VALUE;
            }
        }
        System.out.println(catYears);
    }
}

class Word {
    public static void printReverseString(String argument) {
//        System.out.println(new StringBuilder(argument).reverse());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = argument.length() - 1; i >= 0; i--) {
            stringBuilder.append(argument.charAt(i));
        }
        System.out.println(stringBuilder);
    }

}

