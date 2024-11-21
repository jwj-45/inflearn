package section1;

import java.util.Scanner;

public class String1 {

  public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
    String input1 = sc.next();
    String input2 = sc.next();
    String c = "";
    int count = 0;
    sc.close();
		
    for(int i = 0; i < input1.length(); i++) {
    	c = String.valueOf(input1.charAt(i));	// String.valueOf 메서드를 사용하여 charAt으로 추출한 값을 String으로 형변환
    	
    	if(input2.equalsIgnoreCase(c)) {
    		count++;
    	}
    }
    System.out.print(count);
  }
}