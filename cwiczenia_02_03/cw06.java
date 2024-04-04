package cwiczenia_02_03;

import java.util.Scanner;

public class cw06 {
    public static void main(String[] args){
        Scanner palindrom = new Scanner(System.in);
        System.out.print("Podaj słowo: ");
        String slowo = palindrom.nextLine().toLowerCase();

        // Sprawdzenie
        boolean Palindrom = true;
        for (int i = 0; i < slowo.length() / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - i - 1)) {
                Palindrom = false;
                break;
            }
        }

        // Wynik
        if (Palindrom) {
            System.out.println("To palindrom");
        } else {
            System.out.println("To nie jest palindrom.");
        }
    }
}
