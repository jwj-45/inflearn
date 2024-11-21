package section1;

import java.io.*;
//import java.util.Scanner;

public class String3 {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String[] a = s.split(" ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); 
		String[] arr = input.split(" ");
		String output = "";
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() > max) {
				max = arr[i].length();
				output = arr[i];
			}
		}
		System.out.println(output);
	}
}
