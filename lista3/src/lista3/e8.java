package lista3;

import java.util.Scanner;

public class e8  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] n = new int[5];
		float soma = 0, media;
		for (int i = 0; i < 5; i++) {
			System.out.println("Escolha um numero");
			n[i] = ler.nextInt();
		}
		for(int j = 0; j < 5; j++) {
			soma = soma + n[j];
		}
		System.out.println("A soma dos numeros foi:"+soma);
		media = soma / 5;
		System.out.println("A media dos numeros foi:"+media);
	}
}