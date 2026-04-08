package Iniciante;

import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HoraInicial = sc.nextInt();
        int HoraFinal = sc.nextInt();

        int TempoJogo = 0;
        if (HoraFinal > HoraInicial) {
            TempoJogo = HoraFinal - HoraInicial;
        } else if (HoraFinal <= HoraInicial) {
            TempoJogo = (24 - HoraInicial) + HoraFinal;
        }
        System.out.println("O JOGO DUROU " + TempoJogo + " HORA(S)");
        sc.close();
    }
}
