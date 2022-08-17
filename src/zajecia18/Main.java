package zajecia18;

import java.io.*;
import java.util.*;

public class Main {

    private static final HashSet<String> LONGEST_WORDS = new HashSet<>();
    private static final HashSet<String> SHORTEST_WORDS = new HashSet<>();
    private static final Map<String,Integer> UNIQUES_WORDS = new TreeMap();
    private static int wordCounter = 0;
    private static int theLongestWordLength = 0;
    private static int theShortestWordLength = 45;
    private static int sumOfWordsLength = 0;

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.out.println("Podales zla ilosc argumentow");
            System.exit(1);
        }

        String path = args[0];
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNext()) {
                String word = scanner.next();
                getTheLongestWord(word);
                getTheShortestWord(word);
                getUniqueWords(word);
                wordCounter++;
                sumOfWordsLength += word.length();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("ilosc slow w pliku: " + wordCounter);
        System.out.println("najduzsze slowa: " + LONGEST_WORDS);
        System.out.println("najkrotrze slowa: " + SHORTEST_WORDS);
        System.out.println("srednia dlugosc slowa: " + sumOfWordsLength / wordCounter);
        writeFile();

    }

    public static void getTheLongestWord(String word) {
        if (word.length() > theLongestWordLength) {
            theLongestWordLength = word.length();
            LONGEST_WORDS.clear();
            LONGEST_WORDS.add(word);
        } else if (word.length() == theLongestWordLength) {
            LONGEST_WORDS.add(word);
        }
    }

    public static void getTheShortestWord(String word) {
        if (word.length() < theShortestWordLength) {
            theShortestWordLength = word.length();
            SHORTEST_WORDS.clear();
            SHORTEST_WORDS.add(word);
        } else if (word.length() == theShortestWordLength) {
            SHORTEST_WORDS.add(word);
        }
    }
    public static void getUniqueWords(String word){
        if (UNIQUES_WORDS.containsKey(word)){
            int count = UNIQUES_WORDS.get(word);
            UNIQUES_WORDS.put(word, ++count);
        } else {
            UNIQUES_WORDS.put(word, 1);
        }
    }

    public static void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter(new File("src/zajecia18/UniqueWords.txt"));
        try(fileWriter) {
            UNIQUES_WORDS.entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .forEach(entry -> {
                        try {
                            fileWriter.write(entry.getKey() + " - " + entry.getValue() + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
