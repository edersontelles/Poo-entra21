package listaExerciciosArray;

public class Exercicio2 {

	public static void main(String[] args) {
		
		// 1 - Criar um array que comporta até 10 inteiros
				int[] numeros = new int[10];
				
				// 2 - Preencher o array
				numeros[0] = 1;
				numeros[1] = 2;
				numeros[2] = 3;
				numeros[3] = 4;
				numeros[4] = 5;
				numeros[5] = 6;
				numeros[6] = 7;
				numeros[7] = 8;
				numeros[8] = 9;
				numeros[9] = 10;
				
				int soma = 0;
				
				for(int i = 0; i < numeros.length; i++) {
					soma += numeros[i];
				}
				System.out.println("Soma dos elementos: " + soma);

	}

}
