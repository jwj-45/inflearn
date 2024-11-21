package Section4;

import java.util.*;

public class Hash3 {

//    public int[] solution(int n, int k, int[] arr) {
//
//        int[] answer = new int[k];
//
//        for (int i = 0; i <= n - k; i++) {
//            HashMap<Integer, Integer> map = new HashMap<>();
//            for (int j = i; j < i + k; j++) {
//                System.out.println("i: " + i + ", j: " + j);
//                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
//            }
//            answer[i] = map.size();
//        }
//        return answer;
//    }

//    public int[] solution2(int n, int k, int[] arr) {
//
//        int[] answer = new int[k];
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int lt = 0; lt < k; lt++) {
//            map.put(arr[lt], map.getOrDefault(arr[lt], 0) + 1);
//        }
//        answer[0] = map.size();
//
//        int index = 1;
//        int lt = 0;
//        for (int rt = k; rt < n; rt++) {
//            if (map.size() == k) {
//                map.remove(arr[lt]);
//            }
//            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
//            answer[index++] = map.size();
//            lt++;
//        }
//        return answer;
//    }

    public ArrayList<Integer> solution3(int n, int k, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hash3 h = new Hash3();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        for (int x : h.solution(n, k, arr)) {
//            System.out.print(x + " ");
//        }
        for (int x : h.solution3(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
