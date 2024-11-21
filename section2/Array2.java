package section2;

import java.util.Scanner;

public class Array2 {
	
	public int solution(int n, int[] arr) {
		
		int answer = 1;
		int max = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		Array2 a2 = new Array2();
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(a2.solution(n, arr));
		sc.close();
	}

}
