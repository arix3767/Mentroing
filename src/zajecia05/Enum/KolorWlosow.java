package zajecia05.Enum;

import java.util.ArrayList;
import java.util.List;

public enum KolorWlosow {
    SIWY,
    RUDY,
    BLOND,
    CZARNY;

    public static List<Osoba> zwrocOsobyOKolorzeWlosow(List<Osoba> osoby, KolorWlosow kolorWlosow) {
        ArrayList<Osoba> listaOosbODanymKolorzeWlosow = new ArrayList<>();
        for (Osoba osoba : osoby) {
            if (osoba.getKolorWlosow().equals(kolorWlosow)) {
                listaOosbODanymKolorzeWlosow.add(osoba);
            }
        }
        return listaOosbODanymKolorzeWlosow;
    }

}
