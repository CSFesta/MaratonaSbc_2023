package maratonasbc2023;

import java.util.Scanner;

public class L_Lexicograficamente {

	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		int casas = sc.nextInt();
		int cont = 0;
		while (true) {
			cont = 0;
			for (int i = 0; i < s.length - casas; i++) {
				if (s[i] > s[i + casas]) {
					char atual = s[i];
					s[i] = s[i + casas];
					s[i + casas] = atual;
					cont++;
				}
			}

			if (cont == 0) {
				break;
			}
		}
//        for (char c : s)
//            System.out.print(c);
//        System.out.println();
		sc.close();
		String x = String.copyValueOf(s);
		String y = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaababbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcbcbcbcbcbccccccccccccccccccccccccccccccccdcdcdcdcdcdcddddddddddddddddddddddddddddedededededededeeeeeeeeeeeeeeeeeeeeeeeeefefeffffffffffffffffffffffffffffffffffffffgfgfgggggggggggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihihiiiiiiiiiiiiiiiiiiiiiiiiiiiiiijijijijijijijjjjjjjjjjjjjjjjjjjjjjjjjjkjkjkjkjkjkjkjkkkkkkkkkkkkkkkkkkkkkkkkkklklklklklklklkllllllllllllllllllllllllmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmnmnmnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnonononooooooooooooooooooooooooooooopopopopopppppppppppppppppppppppppppppqpqpqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqrqrrrrrrrrrrrrrrrrrrrrrrrrrrrssssssssssssssssssssssssssssssssssssssssssssstststtttttttttttttttttttttttttttttttttttttttutututuuuuuuuuuuuuuuuuuuuuuuuuuuuuvuvuvuvuvuvuvuvuvvvvvvvvvvvvvvvvvvvvwvwvwvwvwvwvwvwvwvwvwvwwwwwwwwwwwwwwwwwwwwwwxwxwxwxwxwxwxwxwxwxwxwxwxwxxxxxxxxxxxxxxxxyxyxyyyyyyyyyyyyyyyyyyyyyyyyyyyzyzyzyzyzyzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"
				+ "";
		System.out.println(x == y);

	}
}
