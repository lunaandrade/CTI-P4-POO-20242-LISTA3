package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] vetor = new int[8];
	    int[] positivos = new int[8];
	    int[] negativos = new int[8];
	    
	    int indice_positivo = 0;
	    int indice_negativo =0;
	    System.out.println("Digite 8 valores inteiros:");
	    for (int i = 0; i < vetor.length; i++) {
	        vetor[i] = scanner.nextInt();
	        
	        if (vetor[i] > 0) {
	            positivos[indice_positivo] = vetor[i];
	            indice_positivo++;
	        } else {
	            negativos[indice_negativo] = vetor[i];
	            indice_negativo++;
	        }
	    }
	    
	    System.out.println("Vetor com número positivos:");
	    for (int i = 0; i < indice_positivo; i++) {
	        System.out.println(positivos[i]);
	    }
	    
	    System.out.println("Vetor com número negativos:");
	    for (int i = 0; i < indice_negativo; i++) {
	        System.out.println(negativos[i]);
	    }
	    
	}   
}