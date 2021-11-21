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
			System.out.println("Digite um numero entre 0 e 10");
			contadorDificuldade = 10;
		}else if(dificuldade.equalsIgnoreCase("normal")) {
			System.out.println("Digite um número entre 0 a 30");
			contadorDificuldade = 30;
		}else if(dificuldade.equalsIgnoreCase("dificil")) {
			System.out.println("Digite um numero entre 0 a 100");
			contadorDificuldade = 100;
		}else {
			System.out.println("È só selecionar a dificuldade, aplicação encerrada");
			
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
			
			 if(menosPalpite == 0) {
				 System.out.println("Voce perdeu!!!");
				 System.out.println("O número aleatorio foi " + numeroAleatorio);
				 break;
			 }
			 
			 if(numeroAleatorio == numeroEntrada ) {
				 System.out.println("Parabéns, vc acertou, o número aleatorio era " + numeroAleatorio);
				 System.out.println("vc tentou " + palpite + " vezes!!");
			 }
		 }
		 entradaDificuldade.close();
		 numero.close();
			 
	}
}
