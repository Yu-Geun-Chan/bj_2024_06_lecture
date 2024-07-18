package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String cmd = null;
        String[] cmds = new String[n];

        for (int i = 0; i < n; i++) {
            cmd = sc.next();
            String[] cmdBits = cmd.split("");
            cmds[i] = cmdBits[0] + cmdBits[cmdBits.length - 1];
        }
        for (int i = 0; i < cmds.length; i++) {
            System.out.println(cmds[i]);
        }
    }
}
