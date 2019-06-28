package Questoes;

import Util.Teclado;

public class Questao15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nome = new String[2];
		double[] salarioBruto = new double[2];
		double salarioLiquido = 0.0;
		double aliq1 = 10;
		double aliq2 = 15;
		
		for (int i = 0; i < nome.length; i++) {
			nome[i] = Teclado.lerTexto("digite o nome do funcionario: ");
			salarioBruto[i] = Teclado.lerDouble("digite o salario bruto do funcionario: ");
		}
		for (int i = 0; i < nome.length; i++) {
			if(salarioBruto[i]>1500) {
				System.out.println("nome do funcionario: " + nome[i]);
				salarioLiquido = salarioBruto[i] - (salarioBruto[i] * (aliq2/100));
				System.out.println("aliquota utilizada: " + aliq2 + "%");
				System.out.println("salario liquido: R$"+ salarioLiquido);
			}else if(salarioBruto[i]>600) {
				System.out.println("nome do funcionario: " + nome[i]);
				salarioLiquido = salarioBruto[i] - (salarioBruto[i] * (aliq1/100));
				System.out.println("aliquota utilizada: " + aliq1  + "%");
				System.out.println("salario liquido: R$"+ salarioLiquido);
			}else {
				System.out.println("nome do funcionario: " + nome[i]);			
				System.out.println("aliquota utilizada: " + "isento");
				System.out.println("salario liquido: R$"+ salarioLiquido);
			}
		}
		
	}

}
