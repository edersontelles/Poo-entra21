package listaExerciciosArray;
/**
 * 
 * CRIAR UM ARRAY “ORIGEM” COM 10 ELEMENTOS INTEIROS. CONSTRUIR UM ARRAY “RESULTADO” DE MESMO
 * TIPO E TAMANHO, OBEDECENDO AS SEGUINTES REGRAS:
 * • “RESULTADO” RECEBE O VALOR 1 QUANDO “ORIGEM” FOR PAR;
 * • “RESULTADO” RECEBE O VALOR 0 QUANDO “ORIGEM” FOR ÍMPAR;
 * 
 * @author Ederson
 *
 */
public class Exercicio5 {

	public static void main(String[] args) {

		int origem[] = new int[10];
		int resultado[] = new int[10];	

		origem[0] = 1;
		origem[1] = 2;
		origem[2] = 3;
		origem[3] = 4;
		origem[4] = 5;
		origem[5] = 6;
		origem[6] = 7;
		origem[7] = 8;
		origem[8] = 9;
		origem[9] = 10;

		for (int i = 0; i < resultado.length; i++) {
			if(origem[i] %2 == 0) {
				resultado[i] = 1;
			}else {
				resultado[i] = 0;
			}
		}
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.print(resultado[i] + ", ");
		}

	}

}
