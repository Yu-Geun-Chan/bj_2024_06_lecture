package org.koreait;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            scores[i] = score;
        }
        Arrays.sort(scores);

        double sum = 0;
        double average = 0;
        for (int i = 0; i < n; i++) {
            sum += ((double) scores[i] / scores[n - 1]) * 100;
        }
        average = sum / n;
        System.out.println(average);

        sc.close();
    }
}

