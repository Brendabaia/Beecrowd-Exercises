package Iniciante;

import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int notas[] = { 100, 50, 20, 10, 5, 2, 1};

        System.out.println(N);

        for (int i = 0; i < notas.length; i++) {
            int qtdNotas = N / notas[i];
            N = N % notas[i];
            System.out.println(qtdNotas + " nota(s) de R$ " + notas[i] + ",00");
        }
        sc.close();
    }

}
