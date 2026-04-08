package Iniciante;

import java.util.Scanner;

public class Ex1045 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float aux = sc.nextFloat();

        if (B > A) { aux = A; A = B; B = aux; }
        if (C > A) { aux = A; A = C; C = aux; }
        if (C > B) { aux = B; B = C; C = aux; }

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == (B * B + C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > (B * B + C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (A * A < (B * B + C * C)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();


    }
}
