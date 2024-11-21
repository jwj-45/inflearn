package section1;

import java.util.Scanner;

public class String12 {
	
	public String solution(String t, int n) {
		
		String answer = "";
//		t = t.replace("#", "1");
//		t = t.replace("*", "0");
//		int[] arr = new int[n];			
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(t.substring(0, 7));
//			t = t.substring(7);
//		}
		
		t = t.replace("#", "1").replace("*", "0");
		for(int i = 0; i < n; i++) {
			String tmp = t.substring(0, 7);
			answer += (char)(Integer.parseInt(tmp, 2));
			t = t.substring(7);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String t = sc.next();
		String12 s12 = new String12();
		
		System.out.println(s12.solution(t, n));
		sc.close();
	}

}
