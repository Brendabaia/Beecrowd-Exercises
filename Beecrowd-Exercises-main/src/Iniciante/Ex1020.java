package Iniciante;

import java.util.Scanner;

public class Ex1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ano = n / 365;
        int resto = n % 365 ;
        int mes = resto / 30 ;
        int dias = resto % 30;

        System.out.println(ano + " ano(s)");
        System.out.println( mes + " mes(s)");
        System.out.println(dias + " dia(s)");

        sc.close();
    }
}
