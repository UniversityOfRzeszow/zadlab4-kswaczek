/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 *
 * @author Kasia
 */
import java.util.Scanner;

public class Student {

    Scanner odczyt = new Scanner(System.in);

    public String imie;
    public String nazwisko;
    public int numer;
    public String specjalnosc;
    public int rok;

    public Student() {
        this.imie = "";
        this.nazwisko = "";
        this.numer = 0;
        this.specjalnosc = "";
        this.rok = 0;
    }

    public void pDane() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Nr indeksu: " + numer);
        System.out.println("Nazwa specjalnosci: " + specjalnosc);
        System.out.println("Rok studiow: " + rok);
    }

    public void us() {
        this.imie = "";
        this.nazwisko = "";
        this.numer = 0;
        this.specjalnosc = "";
        this.rok = 0;
    }

    public void wybin() {
        System.out.println("Podaj imie: ");
        this.imie = odczyt.next();

        System.out.println("Podaj nazwisko: ");
        this.nazwisko = odczyt.next();

        System.out.println("Podaj nr indeksu: ");
        this.numer = odczyt.nextInt();

        System.out.println("Podaj specjalnosc: ");
        this.specjalnosc = odczyt.next();

        System.out.println("Podaj rok studiow: ");
        this.rok = odczyt.nextInt();
    }
}
