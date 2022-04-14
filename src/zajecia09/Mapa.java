package zajecia09;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("BMW", 1950);
        mapa.put("Audi", 1930);
        mapa.put("Volvo", 1800);
        mapa.put("Opel", 1700);

        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > 1900){
                System.out.println("Marki starsze od 1900: "+ entry.getKey());
            }
           // System.out.println("Marka samochodu: " + entry.getKey() + " Rok utworzenia firmy: " + entry.getValue());
        }


    }
}
