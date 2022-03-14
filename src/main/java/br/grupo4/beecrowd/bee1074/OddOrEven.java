package br.grupo4.beecrowd.bee1074;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;

public class OddOrEven {
    public void start() {
        Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
    	for (int i = 0; i < N; i++) {
    		int num = scan.nextInt();
    		if (num == 0) {
				out.println("NULL");
			} else if (num % 2 == 0 && num > 0) {
				out.println("EVEN POSITIVE");
			} else if (num % 2 == 0 && num < 0) {
				out.println("EVEN NEGATIVE");
			} else if (num % 2 != 0 && num > 0) {
				out.println("ODD POSITIVE");
			} else if (num % 2 != 0 && num < 0) {
				out.println("ODD NEGATIVE");
			}
    	}
    }
}
