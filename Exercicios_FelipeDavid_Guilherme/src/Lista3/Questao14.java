package Lista3;

import Util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int base;
		n = Teclado.lerInt("digite um numero: ");
		base =n;
		for (int i = n - 1; i > 0; i--) {
			n *= i;
		}
		System.out.println("resultado do fatorial do numero "+base+"!"+" = "+n);
	}

}
