package org.koreait;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] n = {"1.0", "2.0", "3.0", "4.0"};
        String[] a = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] b = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double n1 = 0;
        double n2 = 0;
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            for (int j = 0; j < n.length; j++) {
                n1 = str.indexOf(n[j]);
                if (n1 > -1) {
                    n1 = j + 1;
                    break;
                }
            }
            for (int j = 0; j < a.length; j++) {
                n2 = str.indexOf(a[j]);
                if (n2 > -1) {
                    if (a[j].equals("P")) {
                        n2 = 0;
                        n1 = 0;
                        break;
                    } else {
                        n2 = b[j];
                        break;
                    }
                }
            }
            sum1 += n1 * n2;
            sum2 += n1;
        }
        System.out.printf("%.6f",(sum1 / sum2));
    }
}
