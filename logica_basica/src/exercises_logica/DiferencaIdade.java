package exercises_logica;

import java.util.Scanner;

public class DiferencaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		String pessoa1 = sc.next();
		System.out.println("Digite sua idade: ");
		int idade1 = sc.nextInt();
		
		System.out.println("Digite outro nome:");
		String pessoa2 = sc.next();
		System.out.println("Digite sua idade:");
		int idade2 = sc.nextInt();
		
		int diferenca = idade1 - idade2;
		
		System.out.printf("A diferença de idade entre %s e %s é de %d ano(s).",pessoa1, pessoa2, diferenca);
		
		sc.close();

	}

}
