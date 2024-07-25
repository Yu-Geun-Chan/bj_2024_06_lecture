package org.koreait;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] alphabet = str.split("");

        int count = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals("c") && i != alphabet.length - 1) {
                if (alphabet[i + 1].equals("=") || alphabet[i + 1].equals("-")) {
                    i++;
                }
            }
            if (i < alphabet.length - 2) {
                if (alphabet[i].equals("d") && i != alphabet.length - 2) {
                    if (alphabet[i + 1].equals("z") && alphabet[i + 2].equals("=")) {
                        i++;
                    }
                }
            }

            if (alphabet[i].equals("d") && i != alphabet.length - 1) {
                if (alphabet[i + 1].equals("-")) {
                    i++;
                }
            }

            if (alphabet[i].equals("z") && i != alphabet.length - 1) {
                if (alphabet[i + 1].equals("=")) {
                    i++;
                }
            }

            if (alphabet[i].equals("s") && i != alphabet.length - 1) {
                if (alphabet[i + 1].equals("=")) {
                    i++;
                }
            }

            if (alphabet[i].equals("l") && i != alphabet.length - 1) {
                if (alphabet[i + 1].equals("j")) {
                    i++;
                }
            }

            if (alphabet[i].equals("n") && i != alphabet.length - 1) {
                if (alphabet[i + 1].equals("j")) {
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);

        br.close();
    }
}
