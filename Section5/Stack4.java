package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Stack4 {

    public int solution(String str) {

        Stack<Integer> st = new Stack<>();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                st.push(Integer.parseInt(String.valueOf(x)));
            } else {
                int rt = st.pop();
                int lt = st.pop();
                if (x == '+') {st.push(lt + rt);}
                if (x == '-') {st.push(lt - rt);}
                if (x == '*') {st.push(lt * rt);}
                if (x == '/') {st.push(lt / rt);}
            }
        }
        return st.get(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack4 stack = new Stack4();
        String str = sc.next();
        System.out.println(stack.solution(str));
    }
}
