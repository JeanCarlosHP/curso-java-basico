package br.com.jean;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = input.next();
		
		System.out.print("Qual a sua idade? ");
		int idade = input.nextInt();
		
		if (idade >= 18) {
			System.out.println(nome + ", voc� � maior de idade");
		} else {
			System.out.println(nome + ", voc� � menor de idade");
		}

	}
}
