import java.util.Scanner;

public class Exercicio2 {
	
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dias,meses, anos;
	
		
		System.out.println("Qual sua idade em dias? ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		meses = (dias % 365) / 30; // resto
		dias = (dias % 365) % 30;
		
		
		System.out.println("Sua idade  é de " + anos + " anos, " + meses + " meses" + " e " + dias + " dias");
	
				
		
		
		
	}
}
