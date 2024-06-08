package exceções;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// try-catch: permite que programa prossiga ate o final, mesmo com exceção
		
		try {//colocar o código que possivelmente vai da erro dentro da chave
		
		String [] vect = sc.nextLine().split(" ");// o split(" ") cada palavra digitada separada por espaço será dividida por um Array(uma posição)
		int position = sc.nextInt();
		System.out.println(vect[position]);//vect[position] ira mostra o nome na posição digitada
		}
		
		catch(ArrayIndexOutOfBoundsException e) { // exceção de digitção da posiçãon do Array 
			System.out.println("Posição inválida");
		}
		catch(InputMismatchException e) {// exceção de digitação inexistente
			System.out.println("Erro de entrada");
			
		}
		System.out.println("FIM DE PROGRAMA");// o try catch permite que o programa prossiga até o final mesmo com exceções
		
		/*ERRO NA DIGITAÇÂO
		* 
		*  ana maria lucas             
		a
		Erro de entrada
		FIM DE PROGRAMA
		sc.close();*/
		
		/*EXCEÇÂO DE DIGITAÇÂO DA POSIÇÂO DO ARRAY
		 * 
		 * ana maria guto
            5
         Posição inválida
         FIM DE PROGRAMA
		 */
         sc.close();

	}

}
