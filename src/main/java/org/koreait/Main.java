package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cmd = sc.next();
        boolean check = false;

        for (int i = 0; i < cmd.length() / 2; i++) {
            if (cmd.charAt(i) != cmd.charAt(cmd.length() - 1 - i)) {
                check = false;
            }
        }

        if (check == true) {
            System.out.println(1);
        } else System.out.println(0);

        sc.close();
    }
}
