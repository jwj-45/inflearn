package section1;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char s = ' ';
		sc.close();
		
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(65 <= c && c <= 90) {
				s = (char)(c + 32);
			}
			else if(97 <= c && c <= 122) {
				s = (char)(c - 32);
			}
			System.out.print(s);
		}
	}

}
