package br.grupo4.beecrowd.bee1074;


public class OddOrEven {
    public String check(int num) {
    	if (num == 0) {
			return ("NULL");
		} else if (num % 2 == 0 && num > 0) {
			return ("EVEN POSITIVE");
		} else if (num % 2 == 0 && num < 0) {
			return ("EVEN NEGATIVE");
		} else if (num % 2 != 0 && num > 0) {
			return ("ODD POSITIVE");
		} else {
			return ("ODD NEGATIVE");
		}
    }
}
