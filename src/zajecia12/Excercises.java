package zajecia12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excercises {
    public static void main(String[] args) {

        task02();
    }

    /**
     * Napisz stream, który wypisz tylko Java Developerów.
     */
    public static void task01() {
        createUsers().stream()
                .filter(user -> user.getJob() == Job.JAVA_DEVELOPER)
                .forEach(System.out::println);
    }

    /**
     * Wypisz String, który będzie zawierał wszystkie adresy email oddzielone przecinkiem.
     * a_antczak@email.com, b_byk@email.com
     */
    public static void task02() {
        System.out.println(createUsers().stream()
                .map(User::getEmail)
                .collect(Collectors.joining(", ")));
    }

    /**
     * Wypisz, ilu jest użytkowników, którzy mają 30 lub więcej lat i zarabiają powyżej 5000 zł.
     */
    public static void task03() {
    }

    /**
     * Wypisz statystyki zarobków m.in. suma, minimalne itd...
     */
    public static void task04() {
    }

    /**
     * Wyświetl użytkownika o id 5, jeżeli go nie będzie, to niech wyświetli komunikat "Nie ma użytkownika o id 5".
     */
    public static void task05() {
    }

    /**
     * Wypisz true/false w zależności od tego, czy jest jakikolwiek użytkownika w wieku 33 lat.
     */
    public static void task06() {
    }

    /**
     * Sprawdź, czy wszyscy użytkownicy są pełnoletni.
     */
    public static void task07() {
    }

    /**
     * Stwórz listę użytkowników, którzy w swoim imieniu mają literkę "a".
     */
    public static void task08() {
    }

    /**
     * Zwiększ każdemu użytkownikowi pensję o 1000 zł, a następnie wypisz o nim informacje.
     */
    public static void task09() {
    }


    public static List<User> createUsers() {
        User user1 = new User(1L, "Ada", "Antczak", "a_antczak@email.com", 3456.5, 20, Job.JAVA_DEVELOPER);
        User user2 = new User(2L, "Beata", "Byk", "b_byk@email.com", 11223.5, 33, Job.SCALA_DEVELOPER);
        User user3 = new User(3L, "Czesław", "Cios", "c_cios@email.com", 6500.D, 33, Job.JAVA_DEVELOPER);
        User user4 = new User(4L, "Daria", "Chodkowska", "d_chodkowska@email.com", 2344.3, 40, Job.JAVA_DEVELOPER);
        User user5 = new User(5L, "Artur", "Boski", "a_boski@email.com", 8798.1, 21, Job.KOTLIN_DEVELOPER);
        User user6 = new User(6L, "Grzegorz", "Cyrych", "g_cytych@email.com", 12333D, 25, Job.GROOVY_DEVELOPER);
        User user7 = new User(7L, "Igor", "Drzewicki", "i_drzewicki@email.com", 12333D, 26, Job.JAVA_DEVELOPER);
        User user8 = new User(8L, "Lidia", "Figura", "l_figura@email.com", 1243D, 28, Job.SCALA_DEVELOPER);
        User user9 = new User(9L, "Norbert", "Gość", "n_gosc@email.com", 12322D, 45, Job.GROOVY_DEVELOPER);
        User user10 = new User(10L, "Urszula", "Grotkowska", "u_grotkowska@email.com", 11333D, 30, Job.SCALA_DEVELOPER);

        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        return users;
    }
}
