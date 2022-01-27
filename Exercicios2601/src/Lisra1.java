import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	double nota1, nota2,nota3,media;
	
	System.out.println("Digite sua primeira nota:");
	nota1 = leia.nextDouble();
	
	System.out.println("Digite sua segunda nota:");
	nota2 = leia.nextDouble();
	
	System.out.println("Digite sua terceira nota:");
	nota3 = leia.nextDouble();
	
	media=((nota1*2)+(nota2*3)+(nota3*5))/10;
	System.out.println("Média ponderada do aluno:"+ media);
	
	
	if(media> 10 || media <0) {
		System.out.println("Média inválida, tente novamente!");
		

	
		
		leia.close();
		
	
	
	
	
	
	
	
		}
	}
	
}
