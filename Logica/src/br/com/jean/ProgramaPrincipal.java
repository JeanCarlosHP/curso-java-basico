package br.com.jean;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Declaração de váriaveis
		// Toda váriavel em Java é tipada
		int idade = 17;
		float peso = 74.5f;
		double valor = 52.65;
		char letra = 'a';
		String nome = "Jean";
		boolean aprovado = true;
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso + "Kg");
		System.out.println("Valor: R$" + valor);
		System.out.println("Letra: " + letra);
		System.out.println("Aprovado: " + aprovado);
		
		nome = "Mayara";
		System.out.println("Agora o nome é " + nome);
	}
}
