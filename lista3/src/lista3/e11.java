package lista3;

import java.util.Scanner;

public class e11  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] n = new int[2];
		int i = 0;
		int soma=0;
		System.out.println("Digite o 1� n�mero:");
		n[0] = ler.nextInt();
		System.out.println("Digite o 2� n�mero:");
		n[1] = ler.nextInt();
		if (n[0] < n[1]) {
			i = n[0];
			while (i < (n[1] - 1)) {
				i++;
				System.out.println(i);
				soma = soma+i;
			}
			System.out.println("A soam dos intervalos �: "+soma);
		} else if (n[1] < n[0]) {
			i = n[0];
			while (i > (n[1] + 1)) {
				i--;
				System.out.println(i);
				soma = soma+i;						
			}
			System.out.println("A soam dos intervalos �: "+soma);
		} else {
			System.out.println("N�o h� nenhum n�mero entre os intervalos.");		
		}
	}

}