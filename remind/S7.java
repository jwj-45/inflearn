package remind;

import java.util.Scanner;

public class S7 {

    public String solution1(String str) {

        String tmp = new StringBuilder(str).reverse().toString();
        String answer = "NO";

        if (str.equals(tmp)) {
            answer = "YES";
        }

        return  answer;
    }

    public String solution2(String str) {

        String answer = "YES";
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (str.charAt(lt) == str.charAt(rt)) {
                rt--;
                lt++;
            }
            else{
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        S7 s = new S7();
        String str = sc.next();
        str = str.toUpperCase();

        System.out.println(s.solution1(str));
        System.out.println(s.solution2(str));
    }
}
