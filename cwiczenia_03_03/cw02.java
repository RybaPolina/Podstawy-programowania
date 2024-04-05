package cwiczenia_03_03;

public class cw02 {

    //Funkcja sprawdzająca czy liczba a jest pierwsza
    public static boolean czyPierwsza(int a) {
        if (a <= 1) {
          return false;
        }
        for (int i = 2; i <= a; i++) {
          if (a % i == 0) {
            return false;
          }
        }
        return true;
      }

    //Funkcja dodająca liczby pierwsze do tablicy

    public static int zwrocTablice (int dol, int gora){

        //Sprawdzenie zakresu w poszukiwaniu pierwszych liczb
        int i = 0;
        for (int a=dol; a<gora; a++){
          boolean czypierwsza = czyPierwsza(a);
          if (czypierwsza == true) {
            i++;
          }
      }
        return i;
    }
}
