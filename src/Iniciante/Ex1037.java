package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float E = sc.nextFloat();

        if (E >= 0 && E <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (E > 25 && E <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (E > 50 && E <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (E > 75 && E <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
