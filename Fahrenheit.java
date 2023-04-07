import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var tempC = sc.nextDouble();

		System.out.println(String.format("%.1f", (9 * tempC)/5 + 32));

		sc.close();

	}

}
