import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		var valor = sc.nextDouble();
		
		sc.close();
		
		if (valor >= 200.0) {
			System.out.println(String.format("%.2f", valor * 0.95));
			return;
		}
		
		System.out.println(String.format("%.2f", valor));
	}

}
