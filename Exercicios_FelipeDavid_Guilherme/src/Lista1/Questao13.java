package Lista1;

import Util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		final double cent = 2.54;	
		
		numero = Teclado.lerInt("digite um valor que queira converter: ");
		
		for (int i = 1; i <=numero; i++) {		
			System.out.println(i + " polegada(s) = "+ (i*cent) + " centimetros");
		}	
	}

}
