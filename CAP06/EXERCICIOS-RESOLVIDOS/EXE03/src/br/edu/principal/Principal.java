package br.edu.principal;
import java.util.Arrays;
import java.util.Scanner;
public class Principal {
	
		public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    int[] vetor1 = new int[10];
		    int[] vetor2 = new int[10];
		    int[] vetor_resultante = new int[20];
		    
		    int contador1 = 0;
		    System.out.println("Digite 10 números para adicionar ao vetor:");
		    while (contador1 < vetor1.length) {
		        vetor1[contador1] = scanner.nextInt();
		        contador1++;
		    }
		    int contador2 = 0;
		    System.out.println("Digite 10 números para adicionar ao vetor:");
		    while (contador2 < vetor2.length) {
		        vetor2[contador2] = scanner.nextInt();
		        contador2++;
		    }
		    
		    int contador3 = 0;
		    int indice_resultante = 0;
		    while (contador3 < vetor1.length) {
		        vetor_resultante[indice_resultante] = vetor1[contador3];
		        indice_resultante++;
		        vetor_resultante[indice_resultante] = vetor2[contador3];
	            indice_resultante++;
		        contador3++;
		    }
		    
		    
			System.out.println("Vetor resultante: " + Arrays.toString(vetor_resultante));
		}
	}