package br.edu.principal;
import java.util.Arrays;
import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] vetor = new int[10];

	    
        int contador = 0;
	    System.out.println("Digite os valores do vetor X:");
	    while (contador < vetor.length) {
	        vetor[contador] = scanner.nextInt();
	        contador++;
	    }
	    
        System.out.println("Vetor inicial:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
	    
	    for (int i = 0; i < vetor.length; i++) {
	        for (int j = 0; j < i; j ++) {
	            if (vetor[i] > vetor[j]) {
	                int aux = vetor[i];
	                vetor[i] = vetor[j];
	                vetor[j] = aux;
	            }
	        }
	    }
	    
	    System.out.println("");
	    System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
	}   
}