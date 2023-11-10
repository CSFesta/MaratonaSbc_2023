package maratonasbc2023;

import java.util.Scanner;

public class F_Ferias {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int c = sc.nextInt();
        int r = sc.nextInt();
        int cont = r;
        int[] cansativas = new int[c];
        for (int i = 0; i < c; i++) {
            cansativas[i] = sc.nextInt();
        }
        while (r-- > 0) {
            d += sc.nextInt();
        }

        for (int i = 0; i < c; i++) {
            if (d < cansativas[i]) {
                break;
            }
            cont++;
            d -= cansativas[i];
        }
        System.out.println(cont);
	}

}
