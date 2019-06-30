package Lista1;

import Util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		final int cont = 2;
		String[] nome = new String[cont];
		double[] nota1 = new double[cont];
		double[] nota2 = new double[cont];
		double[] media = new double[cont];
		String[] aproRepro = new String[cont];
		
		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome: ");
			nota1[i] = Teclado.lerDouble("Digite a primeira nota: ");
			nota2[i] = Teclado.lerDouble("Digite a segunda nota: ");
			media[i] = (nota1[i]+nota2[i])/2;
			if(media[i]>=5) {
				aproRepro[i] = "Aprovado";
			}else {
				aproRepro[i] = "Reprovado";
			}
			
			
			
		}
	
	
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Nome: %s\nNota 1: %f\nNota 2: %f\nMedia: %f\n%s",nome[i],nota1[i],nota2[i],media[i],aproRepro[i]);
		}
		
	}

}
