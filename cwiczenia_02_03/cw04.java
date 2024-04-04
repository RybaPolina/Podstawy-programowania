package cwiczenia_02_03;
import java.util.Scanner;

public class cw04 {

    public static void main(String[] args) {
        //Pobranie danych
        Scanner dane = new Scanner(System.in);
        
        System.out.println("Podaj swój wzrost w cm: ");
        int wzrostcm = dane.nextInt();
        double wzrost = wzrostcm * 0.01;

        System.out.println("Podaj swoją wagę w kg: ");
        int waga = dane.nextInt();

        System.out.println("Twój wzrost: " + wzrostcm);
        System.out.println("Twoja waga: " + waga);

        //obliczenie BMI

        double bmi = waga / ( wzrost * wzrost );
        
        //Wyswietlanie wyniku
        System.out.println("Twój BMI to: " + bmi);

        if (bmi >= 30){
            System.out.println("Otyłość. Huston, mamy problem...");
        } else if (bmi >= 25) {
            System.out.println("Nadwaga. Więcej ciałka do kochania :)");
        } else if (bmi >= 18.5) {
            System.out.println("Waga w normie. Gites legites, uczcij to czekoladką");
        } else {
            System.out.println("Niedowaga. Idź do babuni, ona z tym se poradzi");
        }
    }
}

