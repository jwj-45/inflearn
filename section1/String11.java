package section1;

import java.util.*;

public class String11 {

	public String solution(String t) {
		
		int count = 1;
		t = t + " ";
		String answer ="";
		
		for(int i = 0; i < t.length() - 1; i++) {
			if(t.charAt(i) == t.charAt(i+1)) {
				count++;
			}
			else {
				answer += t.charAt(i);
				if(count > 1) {
					answer += Integer.toString(count);
				}
				count = 1;
			}
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		String11 s11 = new String11();
		System.out.print(s11.solution(t));
	}
}
