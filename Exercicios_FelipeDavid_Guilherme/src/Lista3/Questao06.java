package Lista3;

import Util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		double n;
		n = Teclado.lerDouble("digite um numero n qualquer menor ou igual a 50: ");
		
		while(n*3<250) {			
			n*=3;		
			System.out.println("resultado da multiplicação sucessiva do numero por 3: "+ n);
			}	
		}
		
	
}
