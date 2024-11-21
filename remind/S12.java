package remind;

import java.util.Scanner;

public class S12 {

    public String solution1(String str, int n) {

        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(i * 7, (i+1) * 7);
            char c = (char)Integer.parseInt(tmp, 2);
            answer += String.valueOf(c);
        }

        return answer;
    }
    public String solution2(String str, int n) {

        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7);
            answer += (char)Integer.parseInt(tmp, 2);
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        S12 s = new S12();
        int n = sc.nextInt();
        String str = sc.next();
        str = str.replace('#', '1').replace('*', '0');

        System.out.println(s.solution1(str, n));
        System.out.println(s.solution2(str, n));
    }
}
