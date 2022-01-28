import java.util.Scanner;

// Lista Laços de Repetição
// 1-Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Exercicio0101 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int num1, num2,num3;
		
		System.out.println("Digite o primeiro número:");
		num1 = entrada.nextInt();
				
		System.out.println("Digite o segundo número:");
		num2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número:");
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

