package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String cmd = sc.next();
            for (int j = 0; j < cmd.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(cmd.charAt(j));
                }
            }
        }
    }
}
