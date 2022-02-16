import java.util.Random;

public class MatrizEx1 {
	/* Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2. */
	
	
	public static void main(String [] args) {
		Random random = new Random();
		int [][] N1 = new int[4][6];
 		int [][] N2 = new int[4][6];
 		int [][] M1 = new int[4][6];
 		int [][] M2 = new int[4][6];
 		
 		for(int l = 0; l < N1.length; l++) {
 			for(int c = 0; c < N2[l].length; c++) {
 				N1[l][c] = random.nextInt(100);
 				N2[l][c] = random.nextInt(100);
 				M1[l][c] = N1[l][c] + N2[l][c];
 				M2[l][c] = N1[l][c] - N2[l][c];
 				
 			}
 		
 		}
 		System.out.println("\n");
 		System.out.print("Matriz N1:");
 		for(int l = 0; l < N1.length; l++) {
 			System.out.println();
 			for(int c = 0; c < N1[l].length; c++) {
 				System.out.print("[" + N1[l][c] + "]");
 			}
 			
 		}
 		System.out.println("\n");
 		System.out.print("Matriz N2:");
 		for(int l = 0; l < N2.length; l++) {
 			System.out.println();
 			for(int c = 0; c < N2[l].length; c++) {
 				System.out.print("[" + N2[l][c] + "]");
 			}
 		}
 		System.out.println("\n");
 		System.out.print("Matriz M1:");
 		for(int l = 0; l < M1.length; l++) {
 			System.out.println();
 			for(int c = 0; c < M1[l].length; c++) {
 				System.out.print("[" + M1[l][c] + "]");
 			}
 			
 		}
 		System.out.println("\n");
 		System.out.print("Matriz M2:");
 		for(int l = 0; l < M2.length; l++) {
 			System.out.println();
 			for(int c = 0; c < M2[l].length; c++) {
 				System.out.print("[" + M2[l][c] + "]");
 			}
 			
 		}	
	}	
}
