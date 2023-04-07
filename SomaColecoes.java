import java.util.ArrayList;
import java.util.Scanner;

public class SomaColecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		var collect = new ArrayList<>();
		var sum = 0;
		var run = true;
		
		do {
			input = sc.nextInt();
			
			if (input != -1) {
				collect.add(input);
				sum += input;
				
			} else {
				if (collect.size() == 0) {
					run = !run;
					continue;
				}
				System.out.println(sum);
				sum = 0;
				collect = new ArrayList<>();
			}
			
		}
		while(run);
		
		sc.close();

	}

}
