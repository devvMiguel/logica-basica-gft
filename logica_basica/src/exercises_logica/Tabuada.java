package exercises_logica;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de uma tabuada:");
		int numero = sc.nextInt();
		
		if (numero != 0) {
			System.out.printf("Tabuada do %d: \n\n",numero);
			for (int i=1; i <= 10; i++){
				int result = numero * i;
				System.out.printf("%d x %d = %d \n", numero, i, result);
			}
		}		
		sc.close();
	}

}
