import java.util.Scanner;

public class MediaColecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double input;
		var sum = 0.0;
		var count = 0;

		do {
			input = sc.nextDouble();

			if (input != -1) {
				sum += input;
				count++;
			}
		} while (input != -1.0);

		System.out.println(String.format("%.2f", sum/count));
		
		sc.close();

	}

}
