import java.util.Scanner;

public class Exercicio03 {
	

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	int segundos, minutos, horas;
	
	System.out.println("Qual � a dura��o do evento em segundos?");
	segundos = leia.nextInt();
	
	horas = segundos / 3600;
	minutos = (segundos % 3600)/60;
	segundos = (segundos % 3600)%60;
	
	System.out.println("O evento em horas � " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
	
		
		

}
}