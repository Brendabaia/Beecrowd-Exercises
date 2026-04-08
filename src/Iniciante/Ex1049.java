package Iniciante;

import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        String a2 = sc.nextLine();
        String a3 = sc.nextLine();

        if (a1.equals ("vertebrado")){
            if (a2.equals ("ave")){
                if (a3.equals ("carnivoro")){
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (a3.equals ("onivoro")){
                    System.out.println("homem");
                } else  {
                    System.out.println("vaca");
                }
            }
        }else {
            if (a2.equals("inseto")) {
                if (a3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (a3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}
