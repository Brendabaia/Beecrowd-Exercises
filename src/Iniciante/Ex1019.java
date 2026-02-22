package Iniciante;

import java.util.Scanner;

public class Ex1019 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hora = n / 3600 ;
        int resto = n % 3600;
        int min = resto / 60 ;
        int seg = resto % 60;

        System.out.println(hora + ":" + min + ":" + seg);

        sc.close();
    }
}
