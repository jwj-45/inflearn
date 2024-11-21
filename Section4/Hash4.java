package Section4;

import java.util.*;

public class Hash4 {

    public int solution(String s, String t, HashMap<Character, Integer> map) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < t.length() - 1; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        int count = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            hm.put(s.charAt(rt), hm.getOrDefault(s.charAt(rt), 0) + 1);
            if(map.equals(hm)) {
                count++;
            }
            hm.put(s.charAt(lt), hm.get(s.charAt(lt)) - 1);
            if (hm.get(s.charAt(lt)) == 0) {
                hm.remove(s.charAt(lt));
            }
            lt++;
        }
        return count;
    }

    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        Hash4 h = new Hash4();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(h.solution(s, t, map));
    }
}
