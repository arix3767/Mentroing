package zajecia20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
//        String temple = "(d,d,d,w,w,a)";
        String temple = "(s,s,a,s,w,a)";
        String[] path = temple.substring(1, temple.length() - 1).split(",");
        for (String s : path) {
            switch (s) {
                case "w", "d" -> counter++;
                case "s", "a" -> counter--;
            }
        }
        System.out.println("zostaly: " + Math.abs(counter) + " ruchy do konca");
        String[] tab = {
                "[1, 2, 3]",
                "[4, 5, 6, 7]"
        };
        String[] newTab1 = tab[0].substring(1, tab[0].length() - 1).split(", ");
        String[] newTab2 = tab[1].substring(1, tab[1].length() - 1).split(", ");

        String[] longerTab;
        if (newTab1.length > newTab2.length){
            longerTab = newTab1;
        }else {
            longerTab = newTab2;
        }
        int[] toReturn = new int[longerTab.length];

        for (int i = 0; i < longerTab.length; i++) {
            if (newTab1.length > i && newTab2.length > i) {
                toReturn[i] = Integer.parseInt(newTab1[i]) + Integer.parseInt(newTab2[i]);
            } else {
                toReturn[i] = Integer.parseInt(longerTab[i]);
            }
        }

        System.out.println(Arrays.toString(toReturn));

    }
}
