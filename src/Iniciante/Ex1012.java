package Iniciante;

import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double a = (A * C) / 2 ;
        double b = 3.14159 * (C * C);
        double c = (A + B) * C / 2;
        double d = B * B;
        double e = A * B;


        System.out.printf("TRIANGULO: %.3f\n", a);
        System.out.printf("CIRCULO: %.3f\n", b);
        System.out.printf("TRAPEZIO: %.3f\n", c);
        System.out.printf("QUADRADO: %.3f\n", d);
        System.out.printf("RETANGULO: %.3f\n", e);

        sc.close();
    }
}
