package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cmd = sc.nextLine();
        int n = sc.nextInt();

        String[] cmdBits = cmd.split("");

        System.out.println(cmdBits[n - 1]);

    }
}