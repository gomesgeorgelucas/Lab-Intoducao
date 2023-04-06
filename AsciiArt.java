import java.util.Scanner;

public class AsciiArt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var limit = sc.nextInt();
		var asciiChar = "*";
		var spaceChar = " ";
		var spaceCount = 0;
		
		for (int i = limit; i > 0; i--) {
			System.out.print(asciiChar.repeat(i));
			System.out.print(spaceChar.repeat(2 * spaceCount++));
			System.out.println(asciiChar.repeat(i));			
		}

		sc.close();
	}
}
