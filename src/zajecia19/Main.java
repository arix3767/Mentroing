package zajecia19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;

public class Main {

    public static final Map<String, Mammals> mapaZwierzat = new TreeMap<>(
            Comparator.comparing(String::length)
                    .thenComparing(Function.identity())
    );

    public static void main(String[] args) {

        String path = "C:\\Users\\janek\\IdeaProjects\\Mentroing\\src\\zajecia19\\mammals.txt";
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] words = scanner.nextLine().replaceAll("NA", "0").split(";");
                if ("species".equals(words[0])) {
                    continue;
                }
                mapaZwierzat.put(words[0], createMammal(words));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        mapaZwierzat.forEach((species, mammals) -> System.out.println(species +" "+ mammals));

        mapaZwierzat.entrySet().stream()
                .sorted(Comparator.comparingDouble(mammal -> mammal.getValue().getBody_wt()))
                .forEach(System.out::println);

    }

    public static Mammals createMammal(String[] words) {
        return new Mammals.Builder()
                .body_wt(Double.parseDouble(words[1]))
                .brain_wt(Double.parseDouble(words[2]))
                .non_dreaming(Double.parseDouble(words[3]))
                .dreaming(Double.parseDouble(words[4]))
                .total_sleep(Double.parseDouble(words[5]))
                .life_span(Double.parseDouble(words[6]))
                .gestation(Double.parseDouble(words[7]))
                .predation(Integer.parseInt(words[8]))
                .exposure(Integer.parseInt(words[9]))
                .danger(Integer.parseInt(words[10]))
                .build();

    }
}
