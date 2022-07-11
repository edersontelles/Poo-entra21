package listaExerciciosArray;

import java.util.Scanner;

/**
 * CRIE UM ARRAY DE INTEIROS DE TAMANHO 3, ONDE O USU�RIO IR� INFORMAR OS VALORES QUE DEVER�O
 * SER DE 1 A 9. O PROGRAMA DEVER� IMPRIMIR NA TELA A TABUADA DOS N�MEROS ARMAZENADOS NO ARRAY.
 * 
 * @author Ederson
 * 
 */
public class Exercicio6 {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		
		System.out.print("IFORME VALOR DE 1 A 9: ");
		arr[0] = new Scanner(System.in).nextInt();
		
		System.out.print("IFORME VALOR DE 1 A 9: ");
		arr[1] = new Scanner(System.in).nextInt();
		
		System.out.print("IFORME VALOR DE 1 A 9: ");
		arr[2] = new Scanner(System.in).nextInt();

		System.out.println("** TABUADA [" + arr[0] + "] **");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " x " + arr[0] + " = " + arr[0] * i);
		}
		System.out.println("\n** TABUADA [" + arr[1] + "] **");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " x " + arr[1] + " = " + arr[1] * i);
		}
		System.out.println("\n** TABUADA [" + arr[2] + "] **");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " x " + arr[2] + " = " + arr[2] * i);
		}

	}

}