import java.util.Scanner;

public class FolhaPagamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var valorHora = sc.nextDouble();
		var horasTrabalhadas = sc.nextDouble();
		
		var salarioBruto = valorHora * horasTrabalhadas;
		var impostoDeRenda = salarioBruto * 0.11;
		var inss = salarioBruto * 0.08;
		var totalDescontos = impostoDeRenda + inss;
		var salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println(String.format("Salario bruto: R$%.2f\n"
				+ "IR: R$%.2f\n"
				+ "INSS: R$%.2f\n"
				+ "Total de descontos: R$%.2f\n"
				+ "Salario liquido: R$%.2f", salarioBruto, impostoDeRenda, inss, totalDescontos, salarioLiquido));
		
		
		
		
		sc.close();

	}

}
