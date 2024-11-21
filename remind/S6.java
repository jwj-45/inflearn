package remind;

import java.util.Scanner;

public class S6 {

    public String solution(String str) {

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        S6 s = new S6();
        String str = sc.next();

        System.out.println(s.solution(str));
    }
}
