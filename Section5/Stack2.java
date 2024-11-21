package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Stack2 {

    public String solution(String str) {

        Stack<Character> stack = new Stack<>();
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                stack.pop();
            } else if (stack.isEmpty()) {
                answer += String.valueOf(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack2 stack = new Stack2();
        String str = sc.next();

        System.out.print(stack.solution(str));
    }
}
