package br.edu.func;

public class funcao {
	public static int calc(int horai, int mini, int horaf, int minf) 
	{
	        int total;
	        if (minf < mini) {
	            minf += 60;
	            horaf -= 1;
	        }

	        if (horaf < horai) {
	          horaf += 24;
	        }

	   
	        total = (horaf - horai) * 60 + (minf - mini);
	        return total;
	    }
}