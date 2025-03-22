package remind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Section4_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        char ans = ' ';
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            System.out.println(map.get(c));
            if(map.get(c) > max) {
                max = map.get(c);
                ans = c;
            }
        }
        System.out.println(ans);
    }
}
