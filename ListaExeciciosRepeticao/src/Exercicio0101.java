import java.util.Scanner;

// Lista La�os de Repeti��o
// 1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class Exercicio0101 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int num1, num2,num3;
		
		System.out.println("Digite o primeiro n�mero:");
		num1 = entrada.nextInt();
				
		System.out.println("Digite o segundo n�mero:");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		num3 = entrada.nextInt();
		
			if(num1<= num2 && num1<=num3) {
				if(num2 <= num3) {
			System.out.println(num2+" "+ num1 + " " +num3);
			} else {System.out.println(num2 + "" +num3+""+num1);}
			}
			if(num2<= num1 && num2<=num3) {
				if(num1<= num3) {
			System.out.println(num2+" "+ num1 + " " +num3);
			} else {System.out.println(num2 + "" +num3+""+num1);}
			}	
			if(num3<= num1 && num3<=num2) {
				if(num1 <= num2) {
			System.out.println(num3+" "+ num1 + " " +num2);
			} else {
			System.out.println("Primeiro"+ num3 + "Segundo:"+num2 +"Terceira:"+""+num1);}
			}		
	}
	}

