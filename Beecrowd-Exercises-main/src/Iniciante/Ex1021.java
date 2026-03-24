package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double entrada = sc.nextDouble();
        int valor = (int) Math.round(entrada * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int qtdNota = valor / nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", qtdNota, nota / 100.0);
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int qtdMoeda = valor / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoeda, moeda / 100.0);
            valor %= moeda;
        }

        sc.close();
    }

}
