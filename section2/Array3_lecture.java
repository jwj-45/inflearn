package section2;

import java.util.Scanner;

public class Array3_lecture {
	
	public String solution(int n, int[] a, int[] b) {
		String answer = "";
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) {
				answer += "D";
			}
			else if(a[i] == 1 && b[i] == 3) {
				answer += "A";
			}
			else if(a[i] == 2 && b[i] == 1) {
				answer += "A";
			}
			else if(a[i] == 3 && b[i] == 2) {
				answer += "A";
			}
			else {
				answer += "B";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Array3_lecture a3 = new Array3_lecture();
		int n = sc.nextInt();		
		int[] a = new int[n];
		int[] b = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		for(char x : a3.solution(n, a, b).toCharArray()) {
			System.out.println(x);
		}
		sc.close();
	}

}
