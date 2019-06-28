package Questoes;

import Util.Teclado;

public class Questao08 {
	
	public static void main(String[] args) {
		final int cont = 20;
		String[] nome = new String[cont];
		int[] num = new int[cont];
		int[] idade = new int[cont];
		String[] sexo = new String[cont];
		
		
		for(int i =0; i<num.length;i++) {
			nome[i] = Teclado.lerTexto("Digite um nome: ");
			sexo[i] = Teclado.lerTexto("Digite o sexo(F/M): ");
			idade[i] = Teclado.lerInt("Digite a idade: ");
			num[i] = Teclado.lerInt("Digite um numero: ");
	}
	
		for (int i = 0; i < num.length; i++) {
			if(sexo[i].equalsIgnoreCase("M") && idade[i]>=21) {
				System.out.printf("Nome: %s  Codigo: %s\n ",nome[i],num[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
	
}
