package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String cmd = sc.next();

        String[] cmdBits = cmd.split("");

        int[] nums = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(cmdBits[i]);
            sum += nums[i];
        }

        System.out.println(sum);

    }
}
