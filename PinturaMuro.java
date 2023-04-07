import java.util.Scanner;

public class PinturaMuro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var labor = sc.nextDouble();
		
		System.out.println(String.format("%.1f", 12*3*labor + 100));
		
		sc.close();

	}

}
