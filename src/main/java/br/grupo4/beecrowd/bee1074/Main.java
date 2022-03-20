package br.grupo4.beecrowd.bee1074;

import java.util.Scanner;
import static java.lang.System.out;

public final class Main {
	private Main() {
		
	}	
	public static void main(String[] args) {
		OddOrEven oddOrEven = new OddOrEven();
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
    	for (int i = 0; i < N; i++) {
			int num = scan.nextInt();
			out.println(oddOrEven.check(num));
		}
	}
}
