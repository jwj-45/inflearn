package section1;

import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		st = st.toUpperCase();
		String answer = "YES";
		
		for(int i = 0; i < st.length() / 2; i++) {
			if(st.charAt(i) != st.charAt(st.length() - i - 1)) {
				answer = "NO";
				break;
			}
		}
		System.out.println(answer);
		sc.close();
	}

}
