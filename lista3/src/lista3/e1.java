package lista3;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual sua nota:");
		float nota = ler.nextFloat();
		while (nota < 0 || nota > 10) {
			System.out.println("Porfavor informe uma nota valida:");
			nota = ler.nextFloat();
		}
		if (nota >= 0 && nota <= 10) {
			System.out.println("Nota computada");
		}
	}
}