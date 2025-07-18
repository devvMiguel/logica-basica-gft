package exercises_logica;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tamanho da base do retângulo: ");
		int baseRetangulo = sc.nextInt();
		
		System.out.println("Insira a altura do retângulo: ");
		int altRetangulo = sc.nextInt();
		
		int area = baseRetangulo * altRetangulo;
		
		System.out.printf("A área do retângulo é %d metros.", area);
		
		sc.close();
		
	}

}
