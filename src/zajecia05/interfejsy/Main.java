//package zajecia05.interfejsy;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Wprowadź nazwę operacji (zacznij z wielkiej litery)");
//        Scanner scanner = new Scanner(System.in);
//        String operacja = scanner.nextLine();
//// nie modyfikujemy kodu wyżej
//        Dzialanie dzialanie = null;
//        switch (operacja) {
//            case "Dodawanie":
//                "Dodawanie".equals(operacja);
//                dzialanie = new Dodawanie();
//                break;
//            case "Odejmowanie":
//                "Odejmowanie".equals(operacja);
//                dzialanie = new Odejmowanie();
//                break;
//            case "Mnożenie":
//                "Mnożenie".equals(operacja);
//                dzialanie = new Mnożenie();
//                break;
//            case "Dzielenie":
//                "Dzielenie".equals(operacja);
//                break;
//            default:
//                throw new RuntimeException("Niepoprawny wybor");
////        }
////                if ("Dodawanie".equals(operacja)) {
////            dzialanie = new Dodawanie();
////        } else if ("Odejmowanie".equals(operacja)) {
////            dzialanie = new Odejmowanie();              // TODO zamienic ifa na switcha zrobione
////        } else if ("Mnożenie".equals(operacja)) {
////            dzialanie = new Mnożenie();                 // TODO sprobowac enumem
////        } else if ("Dzielenie".equals(operacja)) {
////            dzialanie = new Dzielenie();
////        } else {
////            throw new RuntimeException("Niepoprawny wybor");
//       }
//// nie modyfikujemy kodu niżej
//        System.out.println("Podaj wartości liczb");
//        double liczba1 = scanner.nextDouble();
//        double liczba2 = scanner.nextDouble();
//        double wynik = dzialanie.licz(liczba1, liczba2);
//        System.out.println("Wynik to " + wynik);
//    }
//}
