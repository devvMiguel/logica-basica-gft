package exercises_logica;

import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o tamanho do lado de um quadrado:");
		int tamQuadrado = sc.nextInt();
		
		int area = tamQuadrado * 2;
		
		System.out.printf("A área do quadrado é %d metros.", area);
		
		sc.close();
		
	}

}
