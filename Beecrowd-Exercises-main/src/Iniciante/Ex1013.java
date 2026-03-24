package Iniciante;

import java.util.Scanner;

public class Ex1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int maiorAB = (A + B + Math. abs (A - B)) / 2;
        if (maiorAB < C){
            maiorAB = C;
        }
        System.out.println( maiorAB + " eh o maior");

        sc.close();
    }
}
