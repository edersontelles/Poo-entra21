package listaExerciciosArray;

import java.util.Iterator;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// 1 - Criar um array que comporta até 10 inteiros
		int[] numeros = new int[10];
		
		// 2 - Preencher o array
		numeros[0] = 9998;
		numeros[1] = 9998;
		numeros[2] = 9998;
		numeros[3] = 9998;
		numeros[4] = 9998;
		numeros[5] = 9998;
		numeros[6] = 9998;
		numeros[7] = 9998;
		numeros[8] = 9998;
		numeros[9] = 9998;
		
		int contPares = 0;
		
		// 3 - mostrar na tela os valores pares
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0 && numeros[i] != 0) {
				System.out.println("Valor " + numeros[i] + " é Par");
				contPares++;
			}
		}
		System.out.println("\nTotal de números pares: " + contPares);
	}

}
