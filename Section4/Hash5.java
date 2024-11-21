package Section4;

import java.util.*;

public class Hash5 {

//    public int solution(int n, int k, int[] arr) {
//
//        ArrayList<Integer> answer = new ArrayList<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//            answer.add(arr[i]);
//        }
//
//        int max = -1;
//        for (int i = 0; i < k; i++) {
//            max = Integer.MIN_VALUE;
//            int index = 0;
//            for (int j = 0; j < answer.size(); j++) {
//                if (max < answer.get(j)) {
//                    max = answer.get(j);
//                    index = j;
//                }
//            }
//            answer.remove(index);
//            for (int x : answer) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }
//        return max;
//    }

    public int solution2(int n, int k, int[] arr) {
        int answer = -1;
//        Collections.reverseOrder()은 내림차순 정렬
//        set은 보통 중복제거 하려고 사용함
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
//        tset.remove(143); => 143번 지움
//        tset.size() => tset 객체에 저장된 크기
//        tset.first() => 첫번째값 출력
//        tset.last() => 마지막 값 출력
        int cnt = 0;
        for (int x : tset) {
            cnt++;
            if (cnt == k) {
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hash5 h = new Hash5();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(h.solution2(n, k, arr));
    }
}
