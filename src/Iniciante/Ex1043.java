package Iniciante;

import java.util.Scanner;

public class Ex1043 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            double P = A + B + C;
            System.out.printf("Perimetro = %.1f\n", P);
        } else {
            double a = (A + B) * C / 2;
            System.out.printf("Area = %.1f\n", a);
        }
        sc.close();
    }
}
