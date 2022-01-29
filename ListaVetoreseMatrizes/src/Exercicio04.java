import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		int somaM = 0, somaD = 0;
		
		for(int l=0 ;l<3 ;l++) {
			for(int c = 0; c <3; c++) {
			System.out.println("Posição[" +1 + "][" + c + "]");
			matriz[l][c] = leia.nextInt();
			somaM += matriz[l][c];
				
			} System.out.println();
		}
		System.out.println("A soma dos valores na matriz:" + somaM);
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				if(l==c) {
					somaD = somaD + matriz[l][c];
			}		
		}
		}
		System.out.println("A soma da diagonal principal desta Matriz de: " + somaD);
		}			
}

