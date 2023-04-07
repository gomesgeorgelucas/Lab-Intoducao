import java.util.Scanner;

public class ContaEnergia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var kWh = sc.nextInt();
		var tipo = sc.next().charAt(0);
		sc.close();

		if (kWh < 0 || (tipo != 'R' && tipo != 'I' && tipo != 'C')) {
			System.out.println(String.format("%.2f", -1.0));
			return;
		}

		if (tipo == 'R') {
			System.out.println(String.format("%.2f", kWh <= 500 ? kWh * 0.40 : kWh * 0.65));
		}
		
		if (tipo == 'I') {
			System.out.println(String.format("%.2f", kWh <= 5000 ? kWh * 0.55 : kWh * 0.60));
		}
		
		if (tipo == 'C') {
			System.out.println(String.format("%.2f", kWh <= 1000 ? kWh * 0.55 : kWh * 0.60));
		}

	}

}
