import java.util.Scanner;

public class ArteAscii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var limit = sc.nextInt();
		var asciiChar = "*";
		
		for (int i = limit; i > 0; i--) {
			if (i == 1) {
				System.out.print(asciiChar.repeat(i));
				continue;
			}
			System.out.println(asciiChar.repeat(i));
		}
		
		for (int i = 0; i <= limit; i++) {
			if (i == limit) {
				System.out.print(asciiChar.repeat(i));
				continue;
			}
			System.out.println(asciiChar.repeat(i));
		}
		
		sc.close();
	}
}
