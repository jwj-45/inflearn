package Section5;

import java.util.*;

public class Queue7 {

    public String solution(String require, String schedule) {

        Queue<Character> qe = new LinkedList<>();
        String answer = "YES";
        for (char c : require.toCharArray()) {
            qe.offer(c);
        }

        for (char x : schedule.toCharArray()) {
            if (qe.contains(x)) {
                if (x != qe.poll()) {
                    return "NO";
                }
            }
        }
        if (!qe.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue7 m = new Queue7();

        String require = sc.next();
        String schedule = sc.next();

        System.out.print(m.solution(require,schedule));
    }
}