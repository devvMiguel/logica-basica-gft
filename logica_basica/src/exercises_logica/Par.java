package exercises_logica;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero1 = sc.nextInt();
		
		while (true) {
			System.out.println("Digite outro número");
			int numeros = sc.nextInt();
			
			if (numeros < numero1) continue;
			
			else if (numeros % numero1 != 0) break;

		}
		System.out.println("Acabou");
		sc.close();
	}
}
