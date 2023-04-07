import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var a = sc.nextDouble();
		var b = sc.nextDouble();
		var c = sc.nextDouble();
		sc.close();
		
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Triangulo invalido");
			sc.close();
			return;
		}
		
		if (
		!(Math.abs(b - c) < a && a < (b + c)) ||
		!(Math.abs(a - c) < b && b < (a + c)) ||
		!(Math.abs(a - b) < c && c < (a + b))
		) {
			System.out.println("Triangulo invalido");
			sc.close();
			return;
		}
		
		var s = (a + b + c) / 2;
		
		var A = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
		System.out.println(String.format("%.2f", A));
	}

}
