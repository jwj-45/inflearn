package section1;

import java.util.Scanner;

public class String6 {
	
	public String solution(String st) {
		String answer = "";
		
		for(int i = 0; i < st.length(); i++) {
			if(st.indexOf(st.charAt(i)) == i) {
				answer += st.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		
		String6 s6 = new String6();
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
//		String t = "";
//		
//		for(int i = 0; i < st.length(); i++) {
//			char s = st.charAt(i);
//			
//			for(int k = i + 1; k < st.length(); k++) {
//				if(s == (st.charAt(k))) {
//					
//				}
//			}
//		}
//		System.out.print(t);
		
		System.out.println(s6.solution(st));
		sc.close();
	}
}
