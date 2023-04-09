import java.util.ArrayList;
import java.util.Scanner;

public class AprovacaoDisciplina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var notas = new ArrayList<>();
		var frequencias = new ArrayList<>();

		double input;

		do {

			input = sc.nextDouble();

			if (input != -1) {
				notas.add(input);
			}

		} while (input != -1);

		do {
			input = sc.nextDouble();

			if (input != -1) {
				frequencias.add(input);
			}
		} while (input != -1);
		
		var ch = sc.nextDouble();

		sc.close();

		var aprovados = 0;
		var repNota = 0;
		var repFreq = 0;

		for (int i = 0; i < notas.size(); i++) {
			if ((double)frequencias.get(i) / ch < 0.75) {
				repFreq++;
				continue;
			}
			
			if ((double)frequencias.get(i) / ch >= 0.75 && (double)notas.get(i) < 5.0) {
				repNota++;
				continue;
			}
			
			if ((double)frequencias.get(i) / ch >= 0.75 && (double)notas.get(i) >= 5.0) {
				aprovados++;
				continue;
			}
		}

		System.out.println(String.format("%d %d %d", aprovados, repNota, repFreq));
	}

}
