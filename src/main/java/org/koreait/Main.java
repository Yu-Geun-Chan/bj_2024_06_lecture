package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cmd = sc.nextLine().trim();
        String[] cmdBits = cmd.split(" ");
        if(cmdBits[0].equals("")) {
            System.out.println("0");
        } else System.out.println(cmdBits.length);
    }
}
