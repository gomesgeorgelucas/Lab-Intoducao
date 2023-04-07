import java.util.Scanner;

public class NumeroNarcisista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var numero = sc.nextInt();
		
		sc.close();
		
		var stringNumero = String.valueOf(numero);
		
		var k = stringNumero.length();
		var n = 0;
		
		for (int i = 0; i < k; i++) {
			n += Math.pow(Integer.parseInt(String.valueOf(stringNumero.charAt(i))), k);
		}
		
		if (numero != n) {
			System.out.println("NAO");
			return;
		}
		
		System.out.println("SIM");
		
		

	}

}
