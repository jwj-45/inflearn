package remind;

import java.util.Scanner;

public class S11 {

    public String solution(String str) {

        String answer = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer += String.valueOf(str.charAt(i));
                if (count > 1) {
                    answer += Integer.toString(count);
                }
                count = 1;
            }
        }
        return  answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next() + " ";
        S11 s = new S11();

        System.out.print(s.solution(str));
    }
}
