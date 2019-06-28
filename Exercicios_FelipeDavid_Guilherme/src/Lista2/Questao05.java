package Lista2;

import Util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		double[] nota1_4 = new double[4];
		double media = 0;
		String aproRepro = null;
		
		for(int i = 0;i<nota1_4.length;i++) {
			nota1_4[i] = Teclado.lerDouble("Digite a "+(i+1)+"º nota: ");
			media += nota1_4[i];
		}
		media /= nota1_4.length;
		
		if(media>=5) {
			aproRepro = "Aprovado";
		}else {
			aproRepro = "Reprovado";
		}
		System.out.printf("O aluno foi %s com a media de %f",aproRepro,media);

	}

}
