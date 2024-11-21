package section1;

import java.util.Scanner;

public class String9 {

	public int solution(String st) {
		
		int tmp = 0;
		String a = "";
		for(int i = 0; i < st.length(); i++) {
			if(!Character.isAlphabetic(st.charAt(i))) {
				 a += st.charAt(i);
			}
		}

		tmp = Integer.parseInt(a);
		
		return tmp;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String9 s9 = new String9();
		
		System.out.println(s9.solution(st));
		sc.close();
		
	}
}
