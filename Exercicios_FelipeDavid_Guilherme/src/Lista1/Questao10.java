package Lista1;

import Util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;		
		
		n = Teclado.lerInt("digite um numero: ");
	
		for (int i = n-1; i>0; i--) {			
			n *=i;			
		}
		System.out.println(n);
	}

}
