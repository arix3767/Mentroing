package zajecia20;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        Map<Character,String> phoneKeyboard = new HashMap<>();
        phoneKeyboard.put('A', "2");
        phoneKeyboard.put('B', "22");
        phoneKeyboard.put('C', "222");
        phoneKeyboard.put('D', "3");
        phoneKeyboard.put('E', "33");
        phoneKeyboard.put('F', "333");
        phoneKeyboard.put(' ', "0");

        String word = "BCF E";

        StringBuilder finalWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            finalWord.append(phoneKeyboard.get(word.charAt(i))).append("_");
        }

        System.out.println(finalWord);
    }
}
