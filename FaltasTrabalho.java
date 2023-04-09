import java.util.ArrayList;
import java.util.Scanner;

public class FaltasTrabalho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var faltas = new ArrayList<>();

		int input;

		do {

			input = sc.nextInt();

			if (input != -1) {
				faltas.add(input);
			}

		} while (input != -1);

		sc.close();

		var segunda = 0.0;
		var terca = 0.0;
		var quarta = 0.0;
		var quinta = 0.0;
		var sexta = 0.0;
		var sabado = 0.0;

		for (int i = 0; i < faltas.size(); i++) {
			if ((int) faltas.get(i) == 2) {
				segunda++;
				continue;
			}

			if ((int) faltas.get(i) == 3) {
				terca++;
				continue;
			}

			if ((int) faltas.get(i) == 4) {
				quarta++;
				continue;
			}

			if ((int) faltas.get(i) == 5) {
				quinta++;
				continue;
			}

			if ((int) faltas.get(i) == 6) {
				sexta++;
				continue;
			}

			if ((int) faltas.get(i) == 7) {
				sabado++;
				continue;
			}
		}

		System.out.println(String.format("%.1f %.1f %.1f %.1f %.1f %.1f", segunda / faltas.size() * 100,
				terca / faltas.size() * 100, quarta / faltas.size() * 100, quinta / faltas.size() * 100,
				sexta / faltas.size() * 100, sabado / faltas.size() * 100));

	}

}
