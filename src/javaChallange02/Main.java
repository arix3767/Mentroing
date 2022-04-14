package javaChallange02;

import javaChallange02.Bank.Konto;
import javaChallange02.Bank.KontoVIP;
import javaChallange02.Bank.Rachunek;
import javaChallange02.Hospital.Doctor;
import javaChallange02.Hospital.Nurse;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Tomek", "Kowalski", 2000, 5);
        Employee employee1 = new Employee("Marek", "Kowalczyk", 1999, 2);
        Employee employee2 = new Employee("Maciek", "Nowak", 1989, 3);

        Employee[] employees = {employee, employee1, employee2};
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        Osoba osoba1 = new Osoba("Tomek", 1990);
        Osoba osoba2 = new Osoba("Marek", 1989);
        Osoba osoba3 = new Osoba("Justyna", 1985);

        Osoba[] osoby = {osoba1, osoba2, osoba3};
        System.out.println(Osoba.zwrocNajstarszaOsobe(osoby));

        System.out.println(osoba1.zwrocWiek());
        System.out.println(osoba2.zwrocImie());
        System.out.println(Osoba.zwrocStarszaOsobe(osoba1, osoba2));

        Doctor doctor = new Doctor("Tomek", "Nowak", 8000, 1000);
        Nurse nurse1 = new Nurse("Maria", "Kowalska", 5000, 3);
        Nurse nurse2 = new Nurse("Basia", "Nowakowska", 4500, 2);

        Rachunek rachunek1 = new Rachunek("Grzes", 1000);
        Konto konto1 = new Konto("Marek", 1000);
        KontoVIP kontoVIP1 = new KontoVIP("Justyna", 1000, 5, 500);

        Rachunek[] rachunki = {rachunek1, kontoVIP1, konto1};
        for (int i = 0; i < rachunki.length; i++) {
            rachunki[i].wplata(100);
            rachunki[i].wyplata(200);
            rachunki[i].przelew(kontoVIP1,100);
            rachunki[i].aktualizacja();
            System.out.println(rachunki[i].toString());
        }



    }
}
