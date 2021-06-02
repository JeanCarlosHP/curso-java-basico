package br.com.jean;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = input.next();
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = input.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		float nota2 = input.nextFloat();
		
		System.out.print("Informe a terceira nota: ");
		float nota3 = input.nextFloat();
		
		System.out.print("Informe a quarta nota: ");
		float nota4 = input.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("\nSuas notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
		
		System.out.print(nome + " sua média foi " + media);
		
		if (media >= 7) {
			System.out.println(", você foi aprovado.");
		} else {
			System.out.println(", você foi reprovado.");;
		}
		
	}

}
