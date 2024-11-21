package section2;

import java.util.*;

public class Array3 {

	public String[] solution(int n, int[] a, int[] b) {
		
		String[] result = new String[n];
		for(int i = 0; i < n; i++) {
			if(a[i] - b[i] == -2 || a[i] - b[i] == 1) {
				result[i] = "A";
			}
			else if(a[i] - b[i] == 2 || a[i] - b[i] == -1) {
				result[i] = "B";
			}
			else {
				result[i] = "D";
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Array3 a3 = new Array3();
		int n = sc.nextInt();		
		int[] a = new int[n];
		int[] b = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		for(String x : a3.solution(n, a, b)) {
			System.out.println(x);
		}
		sc.close();
	}

}
