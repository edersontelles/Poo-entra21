package listaExerciciosArray;

public class Exercicio3 {

	public static void main(String[] args) {
		// 1 - Criar um array que comporta at� 10 inteiros
				int[] numeros = new int[10];
				
				// 2 - Preencher o array
				numeros[0] = 1;
				numeros[1] = 13;
				numeros[2] = 15;
				
				double mediaImpar = 0;
				double somaImpar = 0;
				int contImpar = 0;
				
				// 3 - mostrar na tela 
				for(int i = 0; i < numeros.length; i++) {
					if(numeros[i] % 2 != 0 && numeros[i] != 0) {
						System.out.println("N�mero " + numeros[i] + " � Impar");
						somaImpar += numeros[i];
						contImpar++;
					}
					mediaImpar = somaImpar / contImpar;
				}
				System.out.printf("\nMedia n�meros impar: %.2f %n", mediaImpar);

	}

}
