package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.nextLine();
        String[] n1Bits = n1.split(" ");
        String[] n2 = n1Bits[0].split("");
        String[] n3 = n1Bits[1].split("");
        int n_1 = 0;
        int n_2 = 0;

        for (int i = 0; i < 3; i++) {
            String change = n2[0];
            n2[0] = n2[2];
            n2[2] = change;
            n_1 = Integer.parseInt(n2[0] + n2[1] + n2[2]);
        }

        for (int i = 0; i < 3; i++) {
            String change = n3[0];
            n3[0] = n3[2];
            n3[2] = change;
            n_2 = Integer.parseInt(n3[0] + n3[1] + n3[2]);
        }

        if (n_1 > n_2) {
            System.out.println(n_1);
        } else System.out.println(n_2);

        sc.close();
    }
}

