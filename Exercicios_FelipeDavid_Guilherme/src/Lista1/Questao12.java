package Lista1;

public class Questao12 {

	public static void main(String[] args) {
		   int[][] matriz = new int[10][10];
	        
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz.length; j++) {                
	                if(j>i) {
	            	System.out.print((i+1) + "-" + (j+1) + "    ");
	                if(j==9) {
	                    System.out.println("\n");
	                }
	            }else {
	            	System.out.print("x - x  ");
	            }     
	            }     
	        }
	}
}
