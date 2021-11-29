package org.generation.italy.utils;

public class CalcoliHelper {

	// la risposta dovrebbe essere overload

	private CalcoliHelper() {
		// creato costruttore vuoto privato
	}

	public static int somma(int num1, int num2) {
		return num1 + num2;
	}

	public static double somma(double dou1, double dou2) {
		return dou1 + dou2;
	}

	public static int sottrazione(int num1, int num2) {
//		if (num1 >= num2) {
//			return num1 - num2;
//		} else 
//		return num2 - num1;
		return num1 - num2;
	}

	public static double sottrazione(double dou1, double dou2) {
//		if(dou1 >= dou2) {
//			return dou1 - dou2;
//		} else
//		return dou2 - dou1;
		return dou1 - dou2;
	}

	public static int moltiplicazione(int num1, int num2) {
		return num1 * num2;
	}

	public static double moltiplicazione(double dou1, double dou2) {
		return dou1 * dou2;
	}

	public static int valAssoluto(int num1) {
		if (num1 < 0) {
			return -num1;
		} else
			return num1;
	}

	public static double valAssoluto(double dou1) {
		if (dou1 < 0) {
			return -dou1;
		} else
			return dou1;
	}

	public static int minimo(int num1, int num2) {
		if (num1 > num2) {
			return num2;
		} else
			return num1;
	}

	public static double minimo(double dou1, double dou2) {
		if (dou1 > dou2) {
			return dou2;
		}
		return dou1;
	}

	public static int massimo(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		return num2;
	}

	public static double massimo(double dou1, double dou2) {
		if (dou1 > dou2) {
			return dou1;
		}
		return dou2;
	}

}
