package Iniciante;

import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int V = sc.nextInt();

        double D = (T * V) / 12.0;
        System.out.printf("%.3f", D);

        sc.close();
    }
}
