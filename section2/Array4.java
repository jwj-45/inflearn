package section2;

import java.util.Scanner;

public class Array4 {
	
	public int[] solution(int f) {
		
		int[] a = new int[f];
		a[0] = 1;
		a[1] = 1;
		for(int i = 0; i < f - 2; i++) {
			a[i + 2] = a[i] + a[i+1];
		}
		
//		for(int i = 2; i < f; i++) {
//			a[i] = a[i - 2] + a[i - 1];
//		}
		
		return a;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Array4 a4 = new Array4();
		int f = sc.nextInt();
		for(int x : a4.solution(f)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
