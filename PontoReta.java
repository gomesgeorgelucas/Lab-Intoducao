import java.util.Scanner;

public class PontoReta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var px = sc.nextDouble();
		var py = sc.nextDouble();
		
		if ((2 * px) + py == 3) {
			System.out.println(String.format("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.", px, py));
		} else {
			System.out.println(String.format("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.", px, py));
		}
		
		sc.close();
		
	}
}
