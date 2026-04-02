package Iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1042 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] originais = new int[3];
        for (int i = 0; i < 3; i++) {
            originais[i] = sc.nextInt();
        }

        int[] ordenados = originais.clone();
        Arrays.sort(ordenados);

        for (int v : ordenados) {
            System.out.println(v);
        }

        System.out.println();

        for (int v : originais) {
            System.out.println(v);
        }

        sc.close();
    }
}
