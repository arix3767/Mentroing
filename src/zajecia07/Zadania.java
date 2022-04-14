package zajecia07;

import java.util.ArrayList;
import java.util.List;

public class Zadania {
    public static void main(String[] args) {
        List<String> inneImiona = new ArrayList<>();
        inneImiona.add("Ania");
        inneImiona.add("Jan");

        List<String> imiona = new ArrayList();
        imiona.add("Tomek");
        imiona.add("Karolina");
        imiona.add("Piotr");
        imiona.add("Ryszard");
        imiona.add("Eryk");
        imiona.add("Ania");


        System.out.println(zwrocDamskieImiona(imiona));
        System.out.println(zwrocElementyWspolne(imiona,inneImiona));
    }

    public static List<String> zwrocDamskieImiona(List<String> list) {
        List<String> damskieimiona = new ArrayList<>();
        String imieDamskie = "a";
        for (String imiona : list) {
            if (imiona.endsWith(imieDamskie)) {
                damskieimiona.add(imiona);
            }
        }
        return damskieimiona;
    }

    public static List<String> zwrocElementyWspolne(List<String> lista1, List<String> lista2) {
        List<String> listaZawierajacaObaElementy = new ArrayList<>();
        for (String listaPierwsza : lista1) {
            if (lista2.contains(listaPierwsza)) {
                listaZawierajacaObaElementy.add(listaPierwsza);
            }
        }
        return listaZawierajacaObaElementy;
    }

}
