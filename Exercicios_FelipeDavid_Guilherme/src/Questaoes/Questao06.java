package Questaoes;

import Util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
    int expo = 0;
    int numBase = 0;
    int resultado = 0;
		
    numBase =Teclado.lerInt("Digite o numero");
    expo = Teclado.lerInt("Digite o expoente");
    resultado = numBase;
		for (int i = 1; i < expo; i++) {
			resultado *= numBase;
		}
		System.out.println(resultado);
		
		
		
		
	}

}
