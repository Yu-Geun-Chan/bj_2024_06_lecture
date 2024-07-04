package org.koreait;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        int max = arr[0];
        int num1 = 1;
        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num1 = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(num1);
    }
}