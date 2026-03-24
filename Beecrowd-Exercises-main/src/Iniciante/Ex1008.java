package Iniciante;

import java.util.Scanner;

public class Ex1008 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int horasTr = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = horasTr * valorHora;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}
