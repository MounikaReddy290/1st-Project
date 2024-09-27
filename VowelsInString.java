package apjfsa;
import java.util.Scanner;


public class VowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		String input = sc.nextLine();
		
		int vowelCount = countVowels(input);
		System.out.println("Number of vowels: " + vowelCount);
		sc.close();
		
		
		

	}
	public static int countVowels(String str) {
		int count = 0;
		for (char ch : str.toLowerCase().toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				count++;
			}
	}
	return count;

}
}
 