import java.util.Scanner;

public class Exercicio0201{ 

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

	        int num1;
	        int num2;
	        int num3;

	        System.out.println("Entre com o número: ");
	        num1 = leia.nextInt();

	        System.out.println("Entre com o número: ");
	        num2 = leia.nextInt();

	        System.out.println("Entre com o número: ");
	        num3 = leia.nextInt();

	        if ( num1 < num2 ) {

	            if( num2 < num3) {

	            System.out.println("A orden crescente é: "  + num1  + num2 + num3);

	            }
	        else if (num1 < num3) {
	                System.out.println("A orden crescente é: " + num1 + num3 + num2);
	          	} else {
	               System.out.println("A orden crescente é: " + num3 + num1 + num2);
	               
	          	}
	        } 
	            else if (num1 < num3) {

	                if (num1 < num3){

	                System.out.println("A orden crescente é: " + num2 + " , " + num1 + " , " + num3);

	                } else {
	                System.out.println("A orden crescente é: " + num2 + " , " + num3 + " , " + num1);
	                  }

	        }    else {
	                System.out.println("A orden crescente é: " + num2 + " , " + num3 + " , " + num1);


	                leia.close();

	                  }

	        }
	    }