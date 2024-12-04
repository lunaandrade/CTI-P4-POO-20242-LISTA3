package br.edu.principal;
import java.util.Scanner;
import br.edu.func.Func;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int numero;
		 double s;
		 
		System.out.println("Digite um número: ");
 		numero = sc.nextInt();
		 
		 while (numero <= 0) {
	            System.out.println("O número precisa ser positivo!");
	            System.out.println("Digite um número: ");
	    		numero = sc.nextInt();
		 }
		 
		 s = Func.sequencia(numero);
         System.out.println("O resultado final do cálculo foi igual a " + s);

	}

}