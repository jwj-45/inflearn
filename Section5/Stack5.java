package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Stack5 {

    public int solution(String raser) {

        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < raser.length(); i++) {
            if (raser.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (raser.charAt(i - 1) == '(') {
                    answer += stack.size();
                }
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack5 m = new Stack5();
        String raser = sc.next();

        System.out.println(m.solution(raser));
    }
}