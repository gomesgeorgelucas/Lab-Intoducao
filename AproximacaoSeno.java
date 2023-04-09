import java.util.Scanner;

public class AproximacaoSeno {
	
	public static long fact(int n) {
	    if (n <= 2) {
	        return n;
	    }
	    return n * fact(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var angle = Math.toRadians(sc.nextDouble());
		var iterations = sc.nextInt();
		
		sc.close();
		
		if (iterations == 1) {
			System.out.println(String.format("%.10f", angle));
			return;
		}
		
		var result = angle;
		System.out.println(String.format("%.10f", result));
		
		for (int i = 1; i < iterations; i++) {
			if (i % 2 != 0) {
				result -= Math.pow(angle, (2*i) + 1) / fact((2*i) + 1);
				System.out.println(String.format("%.10f", result));
				continue;
			}
			
			result += Math.pow(angle, (2*i) + 1) / fact((2*i) + 1);
			System.out.println(String.format("%.10f", result));
		}

	}

}
