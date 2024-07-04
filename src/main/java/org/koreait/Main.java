package org.koreait;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        System.out.print(arr[0] + " ");
        System.out.print(arr[num - 1]);
    }
}