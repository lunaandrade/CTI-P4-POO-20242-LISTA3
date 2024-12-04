package br.edu.func;
import java.util.Scanner;

public class funcao {
	public static double calcula_reajuste(double valor_anterior, double valor_atual) {
		Scanner sc = new Scanner(System.in); 
		
		double acrescimo = (valor_atual - valor_anterior) * 100/valor_anterior;
		
		return acrescimo;
	}
}
