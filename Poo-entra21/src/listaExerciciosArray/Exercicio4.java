package listaExerciciosArray;

import java.util.Scanner;
/**
 * LER AS DUAS NOTAS BIMESTRAIS PARA UM CONJUNTO DE 5 ALUNOS. ARMAZENAR AS NOTAS INFORMADAS
 * PELO USU�RIO EM DOIS ARRAYS �NOTA1� E �NOTA2�, BEM COMO O NOME DO ALUNO EM UM ARRAY �ALUNO�. 
 * O PROGRAMA DEVE CALCULAR A M�DIA DAS NOTAS E INFORMAR:
 * � NOME DO ALUNO;
 * � NOTA 1;
 * � NOTA 2;
 * � M�DIA;
 * � SITUA��O;
 * SE A M�DIA CALCULADA FOR SUPERIOR OU IGUAL A 7 O ALUNO ESTAR� COM A SITUA��O �APROVADO�, 
 * CASO CONTR�RIO, A SITUA��O SER� �REPROVADO�.
 * 
 * 
 * @author Ederson
 *
 */
public class Exercicio4 {

	public static void main(String[] args) {

		int nota1[] = new int[5];
		int nota2[] = new int[5];
		String nomes[] = new String[5];
		String situacao[] = new String[5];
		double medias[] = new double[5];

		for (int i = 0; i < nomes.length; i++) { 
			System.out.print("NOME: ");
			nomes[i] = new Scanner(System.in).next();
			System.out.print("NOTA 1: ");
			nota1[i] = new Scanner(System.in).nextInt();
			System.out.print("NOTA 2: ");
			nota2[i] = new Scanner(System.in).nextInt();
			System.out.println("- - - - - - - - - -");

			medias[i] = (double)(nota1[i] + nota2[i]) / 2;

			if(medias[i] >= 7) {
				situacao[i] = "APROVADO";
			} else {
				situacao[i] = "REPROVADO";
			}
		}
		System.out.println("\n---------------------------------------");
		for (int i = 0; i < nomes.length; i++) { 

			System.out.println("NOME DO ALUNO: " + nomes[i]);
			System.out.println("NOTA 1: " + nota1[i]);
			System.out.println("NOTA 2: " + nota2[i]);
			System.out.println("M�DIA: " + medias[i]);
			System.out.println("O ALUNO EST� COM SITUA��O DE " + situacao[i] + "!");
			System.out.println("---------------------------------------");
		}

	}

}
