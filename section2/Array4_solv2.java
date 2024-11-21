package section2;

import java.util.Scanner;

public class Array4_solv2 {

	public void solution(int f) {
		int a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for(int i = 2; i < f; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		
		Array4_solv2 s = new Array4_solv2();
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		
		s.solution(f);
		sc.close();
	}
}
