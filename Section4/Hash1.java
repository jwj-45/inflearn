package Section4;

import java.util.*;

public class Hash1 {

    public char solution(int n, char[] vote) {

        char[] candidate = {'A', 'B', 'C', 'D', 'E'};
        int max = Integer.MIN_VALUE;
        char elect = ' ';

        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (candidate[i] == vote[j]) {
                    count++;
                }
            }
            if (max < count) {
                max = count;
                elect = candidate[i];
            }
        }
        return elect;
    }

    public char solution2(int n, char[] vote) {

        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : vote) {
//            map.getOrDefault(key, defaultvalue)
//            map 객체에 해당 key값이 없는경우
//            새로 들어온 key값의 value값에 입력한 default값을 넣어줌
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

//        map객체에 입력한 key값이 있는지 없는지 검사하는 메서드 (boolean값 출력) => A값이 있으므로 true
        System.out.println(map.containsKey('A'));
//        map에 저장된 key값들의 종류의 갯수를 출력 => A, B, C, D, E 총 5개 이므로 5 출력
        System.out.println(map.size());
//        map에 저장된 key값들 중 입력한 key값 삭제 => B값 삭제 (A, C, D, E)만 남음
        System.out.println(map.remove('B'));


        int max = Integer.MIN_VALUE;
//        map.keySet() map 객체에 저장된 key값들을 가져옴
        for (char key : map.keySet()) {
//            map.get(key) key값에 저장된 value값을 가져옴
//            System.out.println(key + " " + map.get(key));
            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hash1 h1 = new Hash1();
        int n = sc.nextInt();
        char[] vote = sc.next().toCharArray();

//        System.out.println(h1.solution(n, vote));
        System.out.println(h1.solution2(n, vote));

    }
}
