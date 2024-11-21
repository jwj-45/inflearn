package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {

    public String solution(String str) {

        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack1 stack = new Stack1();
        String str = sc.next();

        System.out.print(stack.solution(str));
    }
}
