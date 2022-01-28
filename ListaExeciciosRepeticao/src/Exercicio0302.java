import java.util.Scanner;

public class Exercicio0302 {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	int num = 0;
	int jovem = 0;
	int idoso = 0;
	
	while(num != -99) {
		System.out.println("Digite idade:");
		num = entrada.nextInt();
	
	if (num<21 && num >= 0) {
		jovem = jovem+1;
	}
	
	else if(num>50) {
		idoso += idoso;
	}
	}
	
	System.out.println("Números de jovens é " + jovem+" e o de idosos é de"+idoso);
		
	}

}
