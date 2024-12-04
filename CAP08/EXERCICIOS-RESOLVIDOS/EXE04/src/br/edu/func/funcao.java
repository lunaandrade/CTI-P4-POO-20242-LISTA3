package br.edu.func;
import java.util.Scanner;
public class funcao {
	public static int[] converter_segundos(int segundos) {
		Scanner sc = new Scanner(System.in); 
		
		int horas = segundos / 3600;
		int resto = segundos - (horas * 3600);
		int minutos = resto / 60;
		int segundos_restantes = segundos - (horas * 3600 + horas * 60); 
		
		int[] resultados =  {horas, minutos, segundos_restantes};
		
		return resultados;
	}
}
