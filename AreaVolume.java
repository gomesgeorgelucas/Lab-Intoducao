import java.util.Scanner;

public class AreaVolume {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var r = sc.nextDouble();
		sc.close();
		var a = Math.PI * Math.pow(r, 2);
		var v = (4.0/3) * Math.PI * Math.pow(r, 3);
		System.out.println(String.format("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n"
				+ "Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", r,a,r,v));

	}

}
