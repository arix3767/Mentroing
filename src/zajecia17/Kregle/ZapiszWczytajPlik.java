package zajecia17.Kregle;

import java.io.*;

import static zajecia17.Kregle.Gracz.LISTA_GRACZY;

public class ZapiszWczytajPlik {

    public void zapiszDoPliku() throws IOException {
        String sciezka = "src\\zajecia17\\Kregle\\plik.txt";
        BufferedWriter pisz = new BufferedWriter(new FileWriter(sciezka));
        for (Gracz uczestnik : LISTA_GRACZY) {
     //       pisz.write(uczestnik + "\n" +);
        }
    }

}
