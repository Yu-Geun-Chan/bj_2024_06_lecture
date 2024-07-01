package org.koreait;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int num = sc.nextInt();
        int sumPrice = 0;
        for (int i = 1; i <= num; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            sumPrice += price * quantity;
        }
        if (totalPrice == sumPrice) System.out.println("Yes");
        else if (totalPrice != sumPrice) System.out.println("No");
    }
}