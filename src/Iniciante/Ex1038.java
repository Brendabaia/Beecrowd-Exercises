package Iniciante;

import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int codigo = sc.nextInt();
       int quant = sc.nextInt();

        double[] precos = {0.00, 4.00, 4.50, 5.00, 2.00, 1.50};
        double total = precos[codigo] * quant;

        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();

//       int a = sc.nextInt();
//       int b = sc.nextInt();

//       if (a == 1){
//            float c = b * 4.00f;
//            System.out.printf("Total: R$ %.2f\n", c);
//        } else if (a == 2) {
//            float c = b * 4.50f;
//            System.out.printf("Total: R$ %.2f\n", c);
//        } else if (a == 3) {
//            float c = b * 5.00f;
//            System.out.printf("Total: R$ %.2f\n", c);
//        }else if (a == 4){
//            float c = b * 2.00f;
//            System.out.printf("Total: R$ %.2f\n", c);
//        } else if (a == 5){
//            float c = b * 1.50f;
//            System.out.printf("Total: R$ %.2f\n", c);
//        }
    }
}
//        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
//        Entrada
//        O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
//        Saída
//        O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

