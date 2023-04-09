import java.util.ArrayList;
import java.util.Scanner;

public class OperacoesInteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double input;

		var collect = new ArrayList<>();
		var sum = 0.0;
		var run = true;
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		var odds = 0;
		var even = 0;

		do {
			input = sc.nextDouble();

			if (input != -1.0) {
				collect.add(input);
				sum += input;
				
				if (input % 2 == 0) {
					odds++;
				} else {
					even++;
				}
				
				if (input > max) {
					max = input;
				}
				
				if (input < min) {
					min = input;
				}

			} else {
				if (collect.size() == 0) {
					run = !run;
					continue;
				}
				System.out.println(collect.size());
				System.out.println(odds);
				System.out.println(even);
				System.out.println(String.format("%.0f", sum));
				System.out.println(String.format("%.2f", sum / collect.size()));
				System.out.println(String.format("%.0f", max));
				System.out.println(String.format("%.0f", min));
				sum = 0;
				odds = 0;
				even = 0;
				min = Integer.MAX_VALUE;
				max = Integer.MIN_VALUE;
				collect = new ArrayList<>();
			}

		} while (run);

		sc.close();


	}

}
