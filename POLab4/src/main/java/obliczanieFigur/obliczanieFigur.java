
package obliczanieFigur;

/**
 *
 * @author Kasia
 */
public class obliczanieFigur {

    private double pierwsza;
    private double druga;
    private double trzecia;

    public obliczanieFigur(double pierwsza, double druga, double trzecia) {
        this.pierwsza = pierwsza;
        this.druga = druga;
        this.trzecia = trzecia;

    }

    public obliczanieFigur(double pierwsza, double druga) {
        this.pierwsza = pierwsza;
        this.druga = druga;
    }

    public obliczanieFigur() {

    }

    public static double PoleKola(double r) {

        return Math.PI * Math.pow(r, 2);

    }

    public static double ObwodKola(double r) {
        return 2 * Math.PI * r;
    }

    public static double PoleKwadratu(double a) {
        return a * a;
    }

    public static double ObwodKwadratu(double a) {
        return 4 * a;
    }

    public static double PoleProstokata(double a, double b) {
        return a * b;
    }

    public static double ObwodProstokata(double a, double b) {
        return 2 * a + 2 * b;
    }

    public static double ObwodSzescianu(double a) {
        return 12 * a;
    }

    public static double PoleSzescianu(double a) {
        return 6 * Math.pow(a, 2);
    }

    public static double ObjetoscSzescianu(double a) {
        return a * a * a;
    }

    public static double ObwodProstopadloscianu(double a, double b, double c) {
        return 4 * (a + b + c);
    }

    public static double PoleProstopadloscianu(double a, double b, double c) {
        return 2 * (a * b + a * c + b * c);
    }

    public static double ObjetoscProstopadloscianu(double a, double b, double c) {
        return a * b * c;
    }

    public static double PoleKuli(double a) {
        return 4 * Math.PI * Math.pow(a, 2);
    }

    public static double ObjetoscKuli(double a) {
        return 4 * (Math.PI * Math.pow(a, 3)) / 3;
    }

    public static double PoleStozka(double r, double H) {
        double l = Math.sqrt(Math.pow(H, 2) + Math.pow(r, 2));
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;

    }

    public static double ObjetoscStozka(double r, double H) {
        return (Math.PI * Math.pow(r, 2) * H) / 3;
    }

    public void pokazDane(String string, String string2, String string3) {

        System.out.println(string);
        System.out.println(string2);
        System.out.println(string3);

    }

}
