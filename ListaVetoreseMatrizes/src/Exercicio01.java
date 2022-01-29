import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] numeros =  new double[5]; // 0 ao 4
		double maior=0;
		
		System.out.println("Digite os cinco números:");
		for(int i = 0; i<=4;i++) {
		System.out.println((i+1)+ " - Número:"); //+1 para começar com 1
		numeros[i] = entrada.nextDouble();
		
		if(numeros[i]>maior) {
			maior=numeros[i];
		}

	}
		System.out.println("O maior número é:" + maior);
	}
}
