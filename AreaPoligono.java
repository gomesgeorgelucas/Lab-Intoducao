import java.util.ArrayList;
import java.util.Scanner;

public class AreaPoligono {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var abscissas = new ArrayList<>();
		var ordenadas = new ArrayList<>();

		double input;

		do {

			input = sc.nextDouble();

			if (input != -1) {
				abscissas.add(input);
			}

		} while (input != -1);

		do {
			input = sc.nextDouble();

			if (input != -1) {
				ordenadas.add(input);
			}
		} while (input != -1);

		sc.close();
		
		var somatorio = 0.0;
		
		for (int i = 0; i < abscissas.size() - 1; i++) {
			somatorio += ((double)abscissas.get(i+1) + (double)abscissas.get(i)) * ((double)ordenadas.get(i+1) - (double)ordenadas.get(i));
		}
		
		var A = Math.abs(somatorio) * (1.0/2);
		
		System.out.println(String.format("%.4f", A));

	}

}
