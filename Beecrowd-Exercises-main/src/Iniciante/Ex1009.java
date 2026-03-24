package Iniciante;

import java.util.Scanner;

public class Ex1009 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String nomevendedor = sc.nextLine();
        double salarioFx = sc.nextDouble();
        double totalvendas = sc.nextDouble();
        double total = salarioFx + (totalvendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);

        sc.close();
    }
}
