import java.util.Scanner;

public class Exercicio0401 {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		int num;
		double raiz, potencia;
		
		System.out.println("Digite um n�mero inteiro:");
		num = leia.nextInt();
		
		if(num % 2 ==0) {
			System.out.println("N�mero Par");
			raiz = Math.sqrt(num);
			System.out.println("Raiz quadrada:" + raiz);
		}
		else {
			System.out.println("N�mero impar");
			potencia = Math.pow(num, 2);
			System.out.println("Potencia:"+potencia);
		}	
		
		}

}

