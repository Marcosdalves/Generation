import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[] numeros =  new double[5]; // 0 ao 4
		double maior=0;
		
		System.out.println("Digite os cinco n�meros:");
		for(int i = 0; i<=4;i++) {
		System.out.println((i+1)+ " - N�mero:"); //+1 para come�ar com 1
		numeros[i] = entrada.nextDouble();
		
		if(numeros[i]>maior) {
			maior=numeros[i];
		}

	}
		System.out.println("O maior n�mero �:" + maior);
	}
}
