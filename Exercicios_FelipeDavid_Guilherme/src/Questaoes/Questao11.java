package exerciciosemdupla;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[10][10];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {				
				System.out.print((i+1) + "-" + (j+1) + "    ");
				if(j==9) {
					System.out.println("\n");
				}
			}
		}
	}

}
