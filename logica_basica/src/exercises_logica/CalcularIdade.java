package exercises_logica;

import java.util.Scanner;

public class CalcularIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoAtual = 2025;

		System.out.println("Insira seu nome: ");
		String nome = sc.next();
		System.out.println("Insira seu ano de nascimento: ");
		int anoNasc = sc.nextInt();

		int idade = anoAtual - anoNasc;

		System.out.printf("Olá %s, você tem %d anos.", nome, idade);

		sc.close();

	}

}
