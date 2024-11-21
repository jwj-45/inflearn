package section1;

import java.util.*;

public class String10 {

	public int[] solution(String s, char t) {
		
		int[] arr = new int[s.length()];
		int p = 1000;

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				arr[i] = p;
			}
			else {
				p++;
				arr[i] = p;				
			}
		}
		p = 1000;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == t) {
				p = 0;
			}
			else {
				p++;
				arr[i] = Math.min(arr[i], p);
			}
		}
				
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char t = sc.next().charAt(0);
		String10 s10 = new String10();
		
		for(int x : s10.solution(s, t)) {
			System.out.print(x + " ");
		}
	}
}
