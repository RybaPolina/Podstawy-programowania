package cwiczenia_02_03;

import java.util.Scanner;

public class cw05 {
    public static void main(String[] args){
        Scanner oceny = new Scanner(System.in);
        
        //Zapis ocen w tablicy
        int[] tablica_ocen = new int[5];
        for(int i = 0; i < tablica_ocen.length; i++) {
            System.out.println("Wpisz ocene nr " + i + ":");
            tablica_ocen[i]=oceny.nextInt();
        }

        //Obliczenie sumy
        int suma = 0;
        for (int ocena : tablica_ocen){
            suma += ocena;
        }

        //Obliczenie sredniej 
        double srednia = suma / tablica_ocen.length;

        //wyswietlenie
        System.out.println("Twoja ocena za semestr to: " + srednia);
        if (srednia == 5) {
            System.out.println("Ocena bardzo dobra");
        } else if (srednia >= 4) {
            System.out.println("Ocena dobra");
        } else if (srednia >= 3) {
            System.out.println("Ocena wystarczająca");
        } else {
            System.out.println("Brak zaliczenia");
        }
        oceny.close();
    }
}
