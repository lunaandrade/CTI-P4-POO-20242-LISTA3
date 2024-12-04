package br.edu.func;

public class Func {

	public static int soma( int a, int b, int c) {
		int s, i, r;
		s = 0;
		
		for (i = b; i <= c; i ++) {
			r = i % a;
			
			if (r == 0) {
				s = s + i;
			}
		}
		
		return s;

	}

}