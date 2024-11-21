package section1;

import java.util.Scanner;

public class String8 {

	public String solution(String st) {
		
		String answer="NO";
		String tmp = "";
		st = st.toUpperCase().replaceAll("[^A-Z]", "");
		tmp = new StringBuilder(st).reverse().toString();
		
		if(tmp.equals(st)) {
			answer = "YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String8 s8 = new String8();
		
		System.out.println(s8.solution(st));

	}

}
