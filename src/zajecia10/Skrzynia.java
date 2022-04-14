package zajecia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Skrzynia <T> {

    protected int maxIloscOwocow;
    protected Map<T,Integer> mapa = new HashMap<>();

    public Skrzynia(int maxIloscOwocow) {
        this.maxIloscOwocow = maxIloscOwocow;
    }
    public void dodajPrzedmiotDoSkrzyni(T przedmiot) {

        if (mapa.containsKey(przedmiot)){
            int ilosc = mapa.get(przedmiot);
            mapa.put(przedmiot, ++ilosc);
        } else {
            mapa.put(przedmiot, 1);
        }
    }

    @Override
    public String toString() {
        return "Skrzynia{" +
                "maxIloscOwocow=" + maxIloscOwocow +
                ", mapa=" + mapa +
                '}';
    }
}
