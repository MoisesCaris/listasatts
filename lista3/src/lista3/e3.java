package lista3;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String s = "F" + "M", es = "S" + "C" + "V" + "D";
		System.out.println("Qual seu nome:");
		String nome = ler.next();
		do {
			System.out.println("Nome invalido" + "\n" + "Informe seu nome:");
			nome = ler.next();
		} while (nome.length() < 3);
		System.out.println("Qual sua idade:");
		int idade = ler.nextInt();
		do {
			System.out.println("Idade invalidade" + "\n" + "Informe uma idade valida");
			idade = ler.nextInt();
		} while (idade < 0 || idade > 150);
		System.out.println("Qual seu salario:");
		float salario = ler.nextFloat();
		do {
			System.out.println("Informe um salario valido");
			salario = ler.nextFloat();
		} while (salario < 0);
		System.out.println("Qual seu sexo" + "\n" + "F" + "\n" + "M");
		String sexo = ler.next();
		do {
			System.out.println("Informe um genero valido");
			sexo = ler.next();
		} while (sexo.equals(s));
		System.out.println("Qual seu estado civil:" + "\n" + "S" + "\n" + "C" + "\n" + "V" + "\n" + "D");
		String estadoc = ler.next();
		do {
			System.out.println("Informe um estado civil valido");
			estadoc = ler.next();
		} while (estadoc.equals(es));
		System.out.println("Computado com sucesso");
	}
}