package Iniciante;

import java.util.Scanner;

public class Ex1047 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        int inicioTotal = (h1 * 60) + m1;
        int fimTotal = (h2 * 60) + m2;
        int diferenca = fimTotal - inicioTotal;

        if (diferenca <= 0) {
            diferenca += 24 * 60;
        }

        int duracaoHoras = diferenca / 60;
        int duracaoMinutos = diferenca % 60;

        System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
        sc.close();
    }

}
