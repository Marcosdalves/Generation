import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Random sorteio = new Random();
		Scanner entrada = new Scanner(System.in);
		
		int[][] m1 = new int[4][6];

        int[][] m2 = new int[4][6];

        int[][] n1 = new int[4][6];

        int[][] n2 = new int[4][6];


            Scanner leia = new Scanner(System.in);


            for (int l = 0; l < 4; l++) {
                for (int c = 1; c < 6; c++) {
                    System.out.println("Matriz N1, Posição [" + l + "][" + c + "]:");

                       n1[l][c] = sorteio.nextInt(99);

                       System.out.println("Matriz N2, Posição [" + l + "][" + c + "]:");
                       n2[l][c] = sorteio.nextInt(99);

                       m1[l][c]=n1[l][c] + n2[l][c];

                       m2[l][c]=n1[l][c] - n2[l][c];

                    System.out.println("Matriz M1, Posição [" + l + "][" + c + "]:" + m1[l][c]);
                    System.out.println("Matriz M2, Posição [" + l + "][" + c + "]:" + m2[l][c]);
                } 
            }
                leia.close();

        }
    }