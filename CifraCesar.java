import java.util.Scanner;

public class CifraCesar {
	
	static String _ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static String shiftLetter(String character, int positions) {
		 if (!_ALPHABET.contains(character)) {
			 return character;
		 }
		 
		 var currIndex = _ALPHABET.indexOf(character);
		 var shiftedIndex = currIndex;
		 
		 if (currIndex+positions > _ALPHABET.length()-1) {
			 shiftedIndex = positions - ((_ALPHABET.length() - 1) - currIndex) - 1;
			 return String.valueOf(_ALPHABET.charAt(shiftedIndex));
		 }
		 
		return String.valueOf(_ALPHABET.charAt(currIndex + positions));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var positions = sc.nextInt();
		var text = sc.nextLine().toUpperCase().trim();

		sc.close();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			sb.append(shiftLetter(String.valueOf(text.charAt(i)), positions));
		}
		
		System.out.println(sb.toString());
	}

}
