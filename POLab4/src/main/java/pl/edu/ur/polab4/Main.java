package pl.edu.ur.polab4;

import java.util.Scanner;
import obliczanieFigur.obliczanieFigur;
import pl.edu.ur.polab4.wprowadzDane.Student;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        //zad 4
        System.out.println("------ZADANIE 4------");
        Scanner keyboard = new Scanner(System.in);
        String s = "--MENU-- "
                + "\n1.Kolo "
                + "\n2.Kwadrat "
                + "\n3.Prostokat "
                + "\n4.Szescian "
                + "\n5.Prostopadloscian "
                + "\n6.Kula "
                + "\n7.Stozek "
                + "\n8.Koniec programu. "
                + "\nWybierz figure dla której chcesz wykonąc obliczenia(1-8): ";

        System.out.print(s);

        int num = keyboard.nextInt();
        if (num < 1 || num > 7) {
            //num = keyboard.nextInt();
        }

        if (num == 1) {
            obliczanieFigur obliczaniefigur = new obliczanieFigur();
            System.out.print("Podaj promien r: ");

            double r = keyboard.nextDouble();
            double a;
            double b;

            a = obliczaniefigur.PoleKola(r);
            b = obliczaniefigur.ObwodKola(r);

            obliczaniefigur.pokazDane("--KOLO--" + "\nPromień:" + r + "\nPole kola: " + a, "Obwód koła: " + b, "");
            System.out.println(" ");
            System.out.print(s);
            num = keyboard.nextInt();
        }
        if (num == 2) {
            System.out.print("Podaj bok a: ");
            double r = keyboard.nextDouble();
            double a;
            double b;
            obliczanieFigur obliczaniefigur = new obliczanieFigur();
            a = obliczaniefigur.PoleKwadratu(r);
            b = obliczaniefigur.ObwodKwadratu(r);
            obliczaniefigur.pokazDane("--KWADRAT--" + "\nBok: " + r + "\nPole kwadratu: " + a, "Obwod kwadratu: " + b, "");
            System.out.println(" ");
            System.out.print(s);
            num = keyboard.nextInt();
        }
        if (num == 3) {
            System.out.print("Podaj bok a: ");
            double r = keyboard.nextDouble();
            System.out.print("Podaj bok b: ");
            double x = keyboard.nextDouble();
            double a;
            double b;
            obliczanieFigur obliczaniefigur = new obliczanieFigur();
            a = obliczaniefigur.PoleProstokata(r, x);
            b = obliczaniefigur.ObwodProstokata(r, x);
            obliczaniefigur.pokazDane("--PROSTOKAT--" + "\nBok pierwszy :" + r + "\nBok drugi: " + x + "\nPole prostokata: " + a, "Obwod prostokata: " + b, "");
            System.out.println(" ");
            System.out.print(s);
            num = keyboard.nextInt();
        }
        if (num == 4) {
            System.out.print("Podaj bok a: ");
            double r = keyboard.nextDouble();
            double a;
            double b;
            double c;
            obliczanieFigur obliczaniefigur = new obliczanieFigur();
            a = obliczaniefigur.ObwodSzescianu(r);
            b = obliczaniefigur.PoleSzescianu(r);
            c = obliczaniefigur.ObjetoscSzescianu(r);
            obliczaniefigur.pokazDane("--SZESCIAN--" + "\nBok: " + r + "\nObwod szescianu: " + a, "Pole szescianu: " + b, "Objętość szescianu: " + c);
            System.out.println(" ");
            System.out.print(s);
            num = keyboard.nextInt();
        }
        if (num == 5) {
            System.out.print("Podaj bok a: ");
            double r = keyboard.nextDouble();
            System.out.print("Podaj bok b: ");
            double x = keyboard.nextDouble();
            System.out.print("Podaj bok c: ");
            double v = keyboard.nextDouble();
            double a;
            double b;
            double c;
            obliczanieFigur obliczaniefigur = new obliczanieFigur();
            a = obliczaniefigur.ObwodProstopadloscianu(r, x, v);
            b = obliczaniefigur.PoleProstopadloscianu(r, x, v);
            c = obliczaniefigur.ObjetoscProstopadloscianu(r, x, v);
            obliczaniefigur.pokazDane("--PROSTOPADLOSCIAN--" + "\nBok pierwszy: " + r + "\nBok drugi: " + x + "\nBok trzeci: " + v + "\nObwod prostopadloscianu: "
                    + a, "Pole prostopadloscianu: " + b, "ObjetoscProstopadloscianu: " + c);
            System.out.println(" ");
            System.out.print(s);
            num = keyboard.nextInt();
        }
        if (num == 6) {
            System.out.print("Podaj promien r: ");
            double r = keyboard.nextDouble();
            double a;
            double b;

            obliczanieFigur obliczaniefigur = new obliczanieFigur();
            a = obliczaniefigur.PoleKuli(r);
            b = obliczaniefigur.ObjetoscKuli(r);
            obliczaniefigur.pokazDane("--KULA--" + "\nPromien: " + r + "\nPole kuli: " + a, "Objetosc Kuli: " + b, "");
            System.out.println(" ");
            System.out.print(s);
            num = keyboard.nextInt();
        }
        if (num == 7) {
            System.out.print("Podaj promien r: ");
            double r = keyboard.nextDouble();
            System.out.print("Podaj wysokosc H: ");
            double x = keyboard.nextDouble();
            double a;
            double b;
            obliczanieFigur obliczaniefigur = new obliczanieFigur();
            a = obliczaniefigur.PoleStozka(r, x);
            b = obliczaniefigur.ObjetoscStozka(r, x);
            obliczaniefigur.pokazDane("--STOZEK--" + "\nPromień: " + r + "\nWysokość: " + x + "\nPole stozka: " + a, "Objetosc stozka: " + b, "");
            System.out.println(" ");
            System.out.print(s);
            num = keyboard.nextInt();
        }

        if (num == 8) {
            System.out.println("Koniec programu.");
        }
        else {
            System.out.println("Zły wybór");
        }

        //zad5
        System.out.println("\n------ZADANIE 5------");

        System.out.println("--MENU--");
        System.out.println("1.Wprowadzanie danych studenta pod wybrany index tablicy.\n"
                + "2.Edycję (nadpisanie danych studenta) spod wybranego indeksu.\n"
                + "3.Usunięcie danych studenta.\n"
                + "4.Wyświetlenie obiektu o danym indeksie.\n"
                + "5.Wyświetlenie wszystkich obiektów.\n"
                + "6.Wyświetlenie zakresu obiektów w podanym zakresie.\n"
                + "Wybierz co chcesz zrobić(1-6): ");

        Student[] studenci = new Student[100];
        Scanner odczyt = new Scanner(System.in);
        int wy = odczyt.nextInt();
        int i;
        for (int j = 0; j < 100; j++) {
            studenci[j] = new Student();
        }
        switch (wy) {

            case 1:
                System.out.println("Dla jakiego indeksu wprowadzic dane? ");
                i = odczyt.nextInt();
                studenci[i].wybin();
                break;

            case 2:
                System.out.println("Dla jakiego indeksu edytowac dane? ");
                i = odczyt.nextInt();
                studenci[i].wybin();
                break;

            case 3:
                System.out.println("Dla jakiego indeksu usunąc dane? ");
                i = odczyt.nextInt();
                studenci[i].us();
                break;

            case 4:
                System.out.println("Dla jakiego indkesu wyświelić dane? ");
                i = odczyt.nextInt();
                studenci[i].pDane();
                break;

            case 5:
                for (int j = 0; j < 100; j++) {
                    studenci[j].pDane();
                }
                break;

            case 6:
                int w;
                int e;
                System.out.println("Od jakeigo indeksu wyświelić dane? ");
                w = odczyt.nextInt();
                System.out.println("Do jakiego indeksu wyświelić dane? ");
                e = odczyt.nextInt();
                for (int j = w; j < e; j++) {
                    studenci[j].pDane();
                }
                break;
            default:
                System.out.println("Zły wybór");
                break;
        }

    }
}
