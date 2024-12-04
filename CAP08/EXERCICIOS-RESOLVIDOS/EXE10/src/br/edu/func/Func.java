package br.edu.func;

public class Func {
	public static double sequencia(int num) {
		int a, b;
		double f, sequencia;
		
		sequencia = 1;
		for (a = 1; a <= num; a++) {
			f = 1;
			for (b = 1; b <= a; b++) { 
				f = f * b;
			}
			sequencia = sequencia + 1 / f;
		}
			return sequencia;
	}
}