package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cmd = sc.nextLine();
        String[] cmdBits = cmd.split("");
        int sum = 0;
        for (int i = 0; i < cmdBits.length; i++) {
            if (cmdBits[i].equals("A") || cmdBits[i].equals("B") || cmdBits[i].equals("C")) {
                sum += 2 + 1;
            } else if (cmdBits[i].equals("D") || cmdBits[i].equals("E") || cmdBits[i].equals("F")) {
                sum += 3 + 1;
            } else if (cmdBits[i].equals("G") || cmdBits[i].equals("H") || cmdBits[i].equals("I")) {
                sum += 4 + 1;
            } else if (cmdBits[i].equals("J") || cmdBits[i].equals("K") || cmdBits[i].equals("L")) {
                sum += 5 + 1;
            } else if (cmdBits[i].equals("M") || cmdBits[i].equals("N")|| cmdBits[i].equals("O")) {
                sum += 6 + 1;
            } else if (cmdBits[i].equals("P") || cmdBits[i].equals("Q") || cmdBits[i].equals("R")|| cmdBits[i].equals("S")) {
                sum += 7 + 1;
            } else if (cmdBits[i].equals("T") || cmdBits[i].equals("U")|| cmdBits[i].equals("V")) {
                sum += 8 + 1;
            } else if (cmdBits[i].equals("X") || cmdBits[i].equals("W")|| cmdBits[i].equals("Y")|| cmdBits[i].equals("Z")) {
                sum += 9 + 1;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}

