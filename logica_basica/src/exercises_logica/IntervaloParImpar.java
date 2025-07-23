package exercises_logica;

import java.util.Scanner;

public class IntervaloParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		System.out.println("Digite um número maior: ");
		int numero2 = sc.nextInt();
		
		while (numero2 <= numero) {
			System.out.println("Precisa ser um número maior: ");
			numero2 = sc.nextInt();
			
			if (numero2 > numero) continue;
		}
		
		System.out.println("Digite impar ou par");
		String imparPar = sc.next();
		
		if (imparPar.equalsIgnoreCase("impar")) {
			for(int i=numero; i <= numero2; i++ ) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		else if (imparPar.equalsIgnoreCase("par")) {
			for(int i=numero; i <= numero2; i++ ) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
		
		sc.close();
	}

}
