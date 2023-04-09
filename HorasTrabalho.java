import java.util.ArrayList;
import java.util.Scanner;

public class HorasTrabalho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var horas = new ArrayList<>();

		int input;

		do {

			input = sc.nextInt();

			if (input != -1) {
				horas.add(input);
			}

		} while (input != -1);

		sc.close();

		var count = 0;
		var sumHoras = 0;

		for (int i = 0; i < horas.size(); i++) {
			sumHoras += (int) horas.get(i);
			count++;

			if (count == 7) {
				System.out.println(sumHoras);
				count = 0;
				sumHoras = 0;
			}
		}

	}

}
