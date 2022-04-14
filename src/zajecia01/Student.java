package zajecia01;

/*
Dobra praktyka - nazywanie klas
ToJestMojaKlasa

Dobra praktyka - nazywanie pol/zmiennych
toJestNazwaPola

toJestMojaMetoda() -> nazwa powinna zawierac czasownik
*/

public class Student {

    static int licznik = 1;

    String imie; // pole
    String numerStudenta;
    int rokUrodzenia;
    int id;

    public Student(String imie, String numerStudenta, int rokUrodzenia) {
        this.imie = imie;
        this.numerStudenta = numerStudenta;
        this.rokUrodzenia = rokUrodzenia;
        this.id = licznik++;
    }

    public static Student zwrocStarszegoStudenta(Student student1, Student student2){
        if (student1.rokUrodzenia < student2.rokUrodzenia) { // 2022 -
            return student1;
        } else {
            return student2;
        }
    }

    public Student zwrocStarszegoStudenta2(Student student1){
        if (student1.rokUrodzenia < this.rokUrodzenia) { // 2022 -
            return student1;
        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", numerStudenta='" + numerStudenta + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", id=" + id +
                '}';
    }
}
