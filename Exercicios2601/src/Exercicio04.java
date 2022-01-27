import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		int d,r,s;
		
		do {
			
					
		System.out.println("Digite o número A:");
		a = leia.nextInt();
				
		System.out.println("Digite o número B:");
		b = leia.nextInt();
				
		System.out.println("Digite o número C:");
		c = leia.nextInt();
		
		}while(a < 0 || b < 0 || c < 0 );
		r = (int) Math.pow(a+b,2);
		s = (int) Math.pow(b+c,2);
			

		
		
		d = (r + s) /2;
		
		System.out.println("O resultado de D: " + d);
		
	}
}
