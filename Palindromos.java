import java.util.Scanner;

public class Palindromos {
	
	public static String reverse (String input) {
        byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
		
		return new String(result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var text = sc.nextLine().replaceAll(" ", "").toUpperCase();
		
		var isPalindromo = 0;
		
		if (text.equals(reverse(text))) {
			isPalindromo = 1;
		}
		
		System.out.println(String.format("%s %d", text,isPalindromo));

		sc.close();
		
		

	}

}
