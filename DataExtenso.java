import java.util.Scanner;

public class DataExtenso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var ddmmaaaa = sc.nextInt();

		sc.close();

		int aaaa = ddmmaaaa % 10000;
		int ddmm = ddmmaaaa / 10000;
		int mm = ddmm % 100;
		int dd = ddmm / 100;

		var nomeMm = "";

		switch (mm) {
		case 1:
			nomeMm = "janeiro";
			break;
		case 2:
			nomeMm = "fevereiro";
			break;
		case 3:
			nomeMm = "março";
			break;
		case 4:
			nomeMm = "abril";
			break;
		case 5:
			nomeMm = "maio";
			break;
		case 6:
			nomeMm = "junho";
			break;
		case 7:
			nomeMm = "julho";
			break;
		case 8:
			nomeMm = "agosto";
			break;
		case 9:
			nomeMm = "setembro";
			break;
		case 10:
			nomeMm = "outubro";
			break;
		case 11:
			nomeMm = "novembro";
			break;
		case 12:
			nomeMm = "dezembro";
			break;
		default:
			nomeMm = "mes invalido";
			break;
		}
		
		System.out.println(String.format("%d de %s de %d", dd, nomeMm, aaaa));

	}

}
