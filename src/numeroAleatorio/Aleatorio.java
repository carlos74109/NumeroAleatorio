package numeroAleatorio;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
	public static void main (String args[]) {
		System.out.println("escolha a dificuldade entre facil, normal ou dificil");
		Scanner entradaDificuldade = new Scanner(System.in);
		
		String dificuldade = entradaDificuldade.nextLine();
		
		int contadorDificuldade = 0;
		
		if(dificuldade.equalsIgnoreCase("facil")) {
			contadorDificuldade = 10;
		}else if(dificuldade.equalsIgnoreCase("normal")) {
			contadorDificuldade = 30;
		}else if(dificuldade.equalsIgnoreCase("dificil")) {
			contadorDificuldade = 100;
		}else {
			System.out.println("� s� selecionar a dificuldade, aplica��o encerrada");
			return;
		}
		
		int numeroAleatorio = new Random().nextInt(contadorDificuldade);
		
		
		int palpite = 0;
		int menosPalpite = 10;
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Insira um numero");
		int numeroEntrada = numero.nextInt();
		
		System.out.println(numeroEntrada);
		
		 while( numeroEntrada != numeroAleatorio) {
			 System.out.println("voce escolheu " + numeroEntrada + " e errou");
			 System.out.println("Insira novamente");
			 
			 
			 if(numeroAleatorio > numeroEntrada) {
				 System.out.println("Escolha um numero maior");
			 }else {
				 System.out.println("Escolha um numero menor");
			 }
			  
			 menosPalpite--;
			 System.out.println("vc tem mais " + menosPalpite + " palpite");
			 numeroEntrada = numero.nextInt();
			 palpite++;
			 if(palpite == 10) {
				 System.out.println("Vc falhou o numero escolhido foi " + numeroAleatorio);
				 
				 break;
			 }else {
				 System.out.println("PARAB�NS vc acertou");
				 System.out.println("o numero escolhido foi " + numeroAleatorio);
				 System.out.println("voce tentou " + palpite + " vezes");
			 }
			 
		 }
		 entradaDificuldade.close();
		 numero.close();
			 
	}
}
