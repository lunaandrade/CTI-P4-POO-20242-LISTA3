package br.edu.principal;
import java.util.Arrays;
import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int[] vetor1 = new int[10];
	    int[] vetor2 = new int[10];

	    
	    
        int contador1 = 0;
	    System.out.println("Digite os valores do vetor X:");
	    while (contador1 < vetor1.length) {
	        vetor1[contador1] = scanner.nextInt();
	        contador1++;
	    }
	    
	    int contador2 = 0;
	    System.out.println("Digite os valores do vetor Y:");
	    while (contador2 < vetor2.length) {
	        vetor2[contador2] = scanner.nextInt();
	        contador2++;
	    }
	    
	    int[] uniao = new int[20];
	    int indice_vetor = 0;
	    for (int i = 0; i < vetor1.length; i++) {
	        int numero = vetor1[i];
	        boolean flag = false;
	        for (int j = 0; j < indice_vetor; j++) {
	            if (uniao[j] == numero) {
	                flag = true;
	                break;
	            }
	        }
	        if (!flag) {
	            
                uniao[indice_vetor] = numero;
                indice_vetor++;
            
	       }
	            
	    }
	    for (int i = 0; i < vetor2.length; i++) {
	        int numero = vetor2[i];
	        boolean flag = false;
	        for (int j = 0; j < indice_vetor; j++) {
	            if (uniao[j] == numero) {
	                flag = true;
	                break;
	            }
	        }
	        if (!flag) {
                uniao[indice_vetor] = numero;
                indice_vetor++;
            }
	    }
	    
	    
	    int indice_diferenca = 0;
	    int[] diferenca = new int[10];
	    for (int i = 0; i < vetor1.length; i++) {
	        boolean nao_existe = true;
	        
	        for (int j = 0; j < vetor2.length; j++) {
	            if (vetor1[i] == vetor2[j]) {
	                nao_existe = false;
	                break;
	            }
	        }
	        if (nao_existe) {
	        boolean flag2 = false;
	        
	        
	        for (int k = 0; k < indice_diferenca; k++) {
	            if (diferenca[k] == vetor1[i]) {
	                flag2 = true;
	                break;
	            }
	        }
	        if (!flag2) {
                diferenca[indice_diferenca] = vetor1[i];
                indice_diferenca++;
            }
	    }
	    
	       
	    }
	    
            
        int[] soma = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }
        
        int[] multiplicacao = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            multiplicacao[i] = vetor1[i] * vetor2[i];
        }
        
        int indice_interseccao = 0;
        int[] interseccao = new int[10];
        for (int i = 0; i < vetor1.length; i++) {
            boolean aparece = false;
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    aparece = true;
                    break;
                }
            }
            if (aparece) {
                boolean flag3 = false;
	        
    	        for (int k = 0; k < indice_interseccao; k++) {
    	            if (interseccao[k] == vetor1[i]) {
    	                flag3 = true;
    	                break;
    	            }
    	        }
    	        if (!flag3) {
                    interseccao[indice_interseccao] = vetor1[i];
                    indice_interseccao++;
                }
            }
        }
        System.out.println(" ");
        System.out.println("união dos vetores:");
        for (int i = 0; i < indice_vetor; i++) {
            System.out.print(uniao[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("diferença dos vetores:");
        for (int i = 0; i < indice_diferenca; i++) {
            System.out.print(diferenca[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
	    System.out.println("soma dos vetores:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("multiplicação dos vetores:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(multiplicacao[i] + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("intersecção dos vetores:");
        for (int i = 0; i < indice_interseccao; i++) {
            System.out.print(interseccao[i] + " ");
        }
	    
	}   
}