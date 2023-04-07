import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var valor = sc.nextDouble();
		
		if (valor %2 != 0 || valor <= 0) {
			System.out.println("Valor Invalido");
			sc.close();
			return;
		}
		
		int notas50 = 0, notas10 = 0, notas2 = 0;
		
		
		
		while(valor >= 50) {
			notas50++;
			valor -= 50;
		}
		
		while (valor >= 10) {
			notas10++;
			valor -= 10;
		}
		
		while (valor >= 2) {
			notas2++;
			valor -= 2;
		}
		
		System.out.println(String.format("%d notas de R$50, %d notas de R$10 e %d notas de R$2", notas50, notas10, notas2));
	
		
		sc.close();

	}

}
