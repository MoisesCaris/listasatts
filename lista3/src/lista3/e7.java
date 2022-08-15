package lista3;

import java.util.Scanner;

public class e7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] n = new int[5];
		int nm = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Escolha um numero");
			n[i] = ler.nextInt();
		}
		for (int j = 0; j < 5; j++) {
			if (nm < n[j]) {
				nm = n[j];
			}
		}
		System.out.println("O maior numero é:" + nm);
	}
}