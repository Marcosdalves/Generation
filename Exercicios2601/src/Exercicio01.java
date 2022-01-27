import java.util.Scanner;

public class Exercicio01 {

	// 1 ano = 365 dias em média
	// 1 mês = 30 dias em média
	
		public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias;
		int IdadeEmDias;
		
	System.out.println("Qual sua idade em anos? ");
	anos = leia.nextInt();
	
	System.out.println("Qual sua idade em meses? ");
	meses = leia.nextInt();
	
	System.out.println("Qual sua idade em dias? ");
	dias = leia.nextInt();
			
	IdadeEmDias = anos *365 + meses * 30 + dias;
	
	System.out.println("Sua idade em dias é:" + IdadeEmDias + " dias");
	
	

	}

}
