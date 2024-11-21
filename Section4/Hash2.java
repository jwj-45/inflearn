package Section4;

import java.util.*;

public class Hash2 {

    public String solution(String a, String b) {

        HashMap<Character, Integer> map = new HashMap<>();
        String answer = "YES";

        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hash2 h = new Hash2();
        String a = sc.next();
        String b = sc.next();

        System.out.println(h.solution(a, b));
    }
}
