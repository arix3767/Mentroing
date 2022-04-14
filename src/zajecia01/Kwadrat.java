package zajecia01;

public class Kwadrat {
    double dlugoscBoku;

    private Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    public void show() {
        double pole = Math.pow(dlugoscBoku, 2);
        double objetosc = pole * dlugoscBoku;
        System.out.println(pole);
        System.out.println(objetosc);
    }
}
