package strings;
import java.util.Scanner;

public class VowelDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any character: ");
		char c = sc.next().charAt(0);
		int i = 0;
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			i++;

		}
		if (i == 1) {
			System.out.println("Character is vowel");
		}else if (c > 'a' && c < 'z' || c > 'A' && c < 'Z') {
			System.out.println("Character is Consonent");
		} else {
			System.out.println("character is not alphabet");
		}
	}

}

