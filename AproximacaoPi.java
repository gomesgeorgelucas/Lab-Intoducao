import java.util.Scanner;

public class AproximacaoPi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var iterations = sc.nextInt();
		
		sc.close();
		
		if (iterations == 1) {
			System.out.println(String.format("%.6f", 3.0));
			return;
		}
		
		var result = 3.0;
		System.out.println(String.format("%.6f", result));
		
		for (int i = 1; i < iterations; i++) {
			if (i % 2 != 0) {
				result += 4.0/((2*i) * (2*i+1.0) * (2*i+2.0));
				System.out.println(String.format("%.6f", result));
				continue;
			}
			
			result -= 4.0/((2*i) * (2*i+1.0) * (2*i+2.0));
			System.out.println(String.format("%.6f", result));
		}
		
		
		
		

	}

}
