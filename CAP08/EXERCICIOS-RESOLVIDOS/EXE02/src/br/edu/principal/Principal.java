package br.edu.principal;
import java.util.Scanner;
import br.edu.func.Func;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, s;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = sc.nextInt();
		
		 while (numero1 <= 0 || numero2 <= 0) {
	            System.out.println("Insira números positivos!");
	            
	            System.out.println("Digite o primeiro número: ");
	    		numero1 = sc.nextInt();
	    		System.out.println("Digite o segundo número: ");
	    		numero2 = sc.nextInt();	
	     } 
		 while (numero1 > numero2) {
			 System.out.println("O segundo número precisa ser maior que o primeiro!");  
	         System.out.println("Digite o primeiro número: ");
	         numero1 = sc.nextInt();
	         System.out.println("Digite o segundo número: ");
	         numero2 = sc.nextInt();	
		 }
		 
		s = Func.somar_int(numero1, numero2);
		 
		System.out.println("A soma dos números inteiros existentes entre eles é " + s);
	}
}