import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
	
		int media=0;
		int maior=0;
		int xjogadas=0;
		int [] Vetor = new int[10];         //vetor
	    Random sorteio = new Random();

	    for ( int i = 0; i < 10; i++ ) {
	        Vetor[i] = sorteio.nextInt(1,6);
	        System.out.println( "Jogada: " + Vetor[i] );
	        media = media + Vetor[i];
	        
	        if(Vetor[i] > maior) {
	        maior = Vetor[i];
	        xjogadas = 1;
	        
	        }
	        else if(Vetor[i] == maior){
	        	xjogadas++;
	        }
	        
	        
	        
	        
	 
	    }

	    System.out.println("Média aritmética:"+ media/10);
	    System.out.println("Maior pontuação:"+ maior);
	    System.out.println("Número de ocorrências:"+ xjogadas);
	}

	}


