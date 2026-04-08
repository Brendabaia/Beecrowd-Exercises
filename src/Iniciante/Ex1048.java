package Iniciante;

import java.util.Scanner;

public class Ex1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salario = sc.nextFloat();
        float novoSalario = 0;
        float reajuste = 0;

        if (salario <= 400.00) {
            novoSalario = salario * 0.15f + salario;
            reajuste = salario * 0.15f;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        } else if (salario > 400.01 && salario <= 800.00) {
            novoSalario = salario * 0.12f + salario;
            reajuste = salario * 0.12f;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %");
        }  else if (salario > 800.01 && salario <= 1200.00) {
            novoSalario = salario * 0.10f + salario;
            reajuste = salario * 0.10f;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %");
        } else if (salario > 1200.01 && salario <= 2000.00) {
            novoSalario = salario * 0.07f + salario;
            reajuste = salario * 0.07f;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %");
        } else {
            novoSalario = salario * 0.04f + salario;
            reajuste = salario * 0.04f;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %");
        }

        sc.close();
    }
}
