package section1;

import java.util.*;

public class String4 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
		
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		return answer;
	}

	public static void main(String[] args) {

		  String4 st = new String4();
		  Scanner sc = new Scanner(System.in); 
		  int n = sc.nextInt(); 
		  String[] str = new String[n];
		  
		  for(int i = 0; i < n; i++) {
			  str[i] = sc.next();
		  }
		  for(String x : st.solution(n, str)) {
			  System.out.println(x);
		  }
		  
//		  String answer = ""; 
//		  
//		  for(int i = 1; i <= n; i++) { 
//			  char[] input = sc.next().toCharArray();		  
//			  for(int j = input.length - 1; 0 <= j; j--) { 
//				  answer += input[j]; 
//			  }
//			  System.out.println(answer); 
//			  answer = ""; 
//		  } 
//		  sc.close();
		 

		

//		  char tmp = ' ';
//		  
//		  for(int i = 1; i <= n; i++) { 
//			 
//			  char[] input = sc.next().toCharArray(); 
//			  
//			  for(int j = 0; j < input.length / 2; j++) { 
//				  tmp = input[j]; 
//				  input[j] = input[input.length - 1 - j]; 
//				  input[input.length - 1 - j] = tmp; 
//			  }
//			  
//			  System.out.println(input); 
//		  }   
//		  sc.close();
		
		  
		
		
	}
}
