package section1;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		char tmp = ' ';
		int lt = 0, rt = arr.length - 1;
		String answer = "";
		
		while(lt < rt) {
			if(!Character.isAlphabetic(arr[lt])) {
				lt++;
			}
			else if(!Character.isAlphabetic(arr[rt])) {
				rt--;
			}
			else {
				tmp = arr[lt];
				arr[lt] = arr[rt];
				arr[rt] = tmp;
				lt++;
				rt--;
			}
			answer = String.valueOf(arr); 
		}		
		System.out.println(answer);
		sc.close();
	}
}
