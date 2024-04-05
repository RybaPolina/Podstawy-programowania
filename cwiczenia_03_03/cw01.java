package cwiczenia_03_03;

import java.util.Scanner;

public class cw01 {

    //Funkcja przyjmujaca tablice i zwracająca liczbę
    public static int zwrocIndeks(int[] tablica, int liczba){
        for(int i=0; i<tablica.length; i++){
            if (tablica[i] == liczba) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner dane = new Scanner(System.in);

        //Wprowadzenie danych do tablicy
        int[] tablica = new int[5];
        for(int i = 0; i < tablica.length; i++) {
            System.out.println("Wprowadź liczbę " + i + " do tablicy: ");
            tablica[i]=dane.nextInt();
        }
        //Wprowadzenie numeru do wyszukania
        System.out.println("Wprowadź liczbę do wyszukania w tablicy:");
        int liczba = dane.nextInt();

        int funkcja = zwrocIndeks(tablica, liczba);

        System.out.println("Numer mieści się w tablicy na pozycji " + funkcja);

        dane.close();
    }
}
