package Iniciante;

import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoP1 = sc.nextInt();
        int numP1 = sc.nextInt();
        double valoruniP1 = sc.nextDouble();

        int codigoP2 = sc.nextInt();
        int numP2 = sc.nextInt();
        double valoruniP2 = sc.nextDouble();

        double total = ((numP1 * valoruniP1) + (numP2 * valoruniP2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}