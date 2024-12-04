package br.edu.func;
import br.edu.func.Func;
public class Func {

	public static int somar_int(int num1, int num2) {
		int soma, i;
		soma = 0;
		
		for (i = num1 + 1; i <= num2 - 1; i++) {
			soma = soma + i;
		}
		
		return soma;
	} 
}