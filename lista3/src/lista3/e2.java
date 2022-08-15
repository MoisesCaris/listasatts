package lista3;

import java.util.Scanner;

public class e2  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Escolha seu nome de usuario:");
		String user = ler.next();
		System.out.println("Escolha sua senha:");
		String pass = ler.next();
		while(user.equals(pass)) {
			System.out.println("Seu nome de usuario ou senha é invalido:");
			System.out.println("Escolha seu nome de usuario:");
			user = ler.next();
			System.out.println("Escolha sua senha:");
			pass = ler.next();
		}
		System.out.println("Registrado com sucesso");
	}
}