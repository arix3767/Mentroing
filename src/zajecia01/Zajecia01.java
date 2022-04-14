package zajecia01;

public class Zajecia01 {
    public static void main(String[] args) {
        int wiek = 22; //zmienna
        System.out.println(wiek);

        int tab[] = {2, 23, 93, 274};
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }

        Student student1 = new Student("Jan", "s24906", 2002);
        Student student2 = new Student("Michal", "s24906", 2010);

        Student.zwrocStarszegoStudenta(student1, student2);

        student2.zwrocStarszegoStudenta2(student1);

        Student student3 = new Student("Eryk", "s24906", 2019);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
//---------------------------------------
        Osoba osoba1 = new Osoba("Tomek", 1990);
        Osoba osoba2 = new Osoba("Janek", 1999);
        Osoba osoba3 = new Osoba("Jarek", 1993);


        Osoba[] osobas = {osoba2, osoba3, osoba1};
        Osoba[] osobas2 = new Osoba[]{osoba1, osoba2, osoba3};
        Osoba[] osobas3 = new Osoba[3];
        System.out.println(Osoba.zwrocNajstarszaOsobe(osobas));

        int[] liczby = {-100000, -23133, -324342};

//        for (int i = 0; i < liczby.length; i++) {
//            for (int j = 0; j < liczby.length - 1; j++) {
//                if (liczby[j] > liczby[j + 1]) {
//                    int tmp = liczby[j];
//                    liczby[j] = liczby[j + 1];
//                    liczby[j + 1] = tmp;
//                }
//            }
//        }
//        System.out.println(liczby[liczby.length-1]);

//        int maks = liczby[0];
//        for (int i = 0; i < liczby.length; i++) {
//            if (liczby[i] > maks) {
//                maks = liczby[i];
//            }
//        }
//        System.out.println(maks);

        int min = liczby[0];
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] < min){
                min = liczby[i];
            }
        }
        System.out.println(min);



        Owoc owoc = new Owoc("melon");
        Owoc owoc1 = new Owoc("melon");
        owoc.wyswietlOwoc();

        // pole vs zmienna
//        int mojaZmienna;
//        System.out.println(mojaZmienna);
//        Student student = new Student();
//        System.out.println(student.rokUrodzenia);



    }
}
