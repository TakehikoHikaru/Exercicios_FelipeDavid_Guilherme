package Lista2;

import Util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capital;
		
		capital = Teclado.lerTexto("Qual a capital do Brasil? ");
		
		if(capital.equalsIgnoreCase("Brasilia")) {
			System.out.println("Resposta certa, a capital é Brasilia!");
		}else {
			System.out.println("Resposta errada!");
		}
	}

}
