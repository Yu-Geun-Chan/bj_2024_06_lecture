package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String a = "int";
        for (int i = 1; i <= num; i++) {
            if (i % 4 == 0) {
                a = "long " + a;
            }
        }
        System.out.println(a);
    }
}