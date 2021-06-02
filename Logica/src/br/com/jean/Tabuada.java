package br.com.jean;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int valor;
		
		System.out.print("Deseja ver a tabuada de qual valor? ");
		valor = input.nextInt();
		System.out.println();
		
		for (int mult = 1; mult <= 10; mult++) {
			System.out.println(valor + " x " + mult + " = " + valor*mult);
		}

	}
}
