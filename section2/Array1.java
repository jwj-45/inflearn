package section2;

import java.util.*;

public class Array1 {
	
	public String solution(int n, int[] arr) {

		String answer = arr[0] + " ";		
		for(int i = 0; i < n - 1; i++) {
			if(arr[i + 1] > arr[i]) {
				answer += arr[i + 1] + " ";
			}
		}
		return answer;
	}
	
	public ArrayList<Integer> solutionLecture(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		
		for(int i = 1; i < n; i++) {
			if(arr[i] > arr[i - 1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Array1 a1 = new Array1();
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// solution
		System.out.println(a1.solution(n, arr));	
		
		// solution2
		for(int x : a1.solutionLecture(n, arr)) {
			System.out.print(x + " ");
		}
		sc.close();
	}

}
