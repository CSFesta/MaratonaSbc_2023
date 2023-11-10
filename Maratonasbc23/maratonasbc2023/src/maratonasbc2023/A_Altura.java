package maratonasbc2023;

import java.util.Scanner;

public class A_Altura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qnt = sc.nextInt();
		int carlititos = sc.nextInt();
		int cont = 0;
		while (qnt-- > 0) {
			if (sc.nextInt() <= carlititos) {
				cont++;
			}
		}
		System.out.println(cont);
	}

}
