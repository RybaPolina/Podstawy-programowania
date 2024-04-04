package cwiczenia_02_03;

public class cw02 {
    public static void main(String[] args) {
        // Deklaracja tablicy
        int[] tablica = {1, 2, 3, 4, 5};

        // Obliczanie sumy
        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }

        // Obliczanie średniej
        double srednia = (double) suma / tablica.length;

        // Wyświetlenie wyniku
        System.out.println("Średnia: " + srednia);
    }
}
