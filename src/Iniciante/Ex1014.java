package Iniciante;

import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double consumo = X / Y;
        System.out.printf("%.3f km/l%n", consumo);

        sc.close();
    }
}
