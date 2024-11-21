package Section6;

import java.util.Scanner;

public class Sorting4 {

//    public int[] solution(int s, int n, int[] cache, int[] work) {
//
//        for (int i = 0; i < n; i++) {
//            for (int k = 0; k < s; k++) {
//                if (work[i] == cache[k]) {
//
//                } else {
//
//                }
//            }
//            for (int j = s-1; j > 0; j--) {
//                cache[j] = cache[j - 1];
//            }
//            cache[0] = work[i];
//        }
//    }

    public int[] solution(int s, int n, int[] cache, int[] work) {

        for (int x : work) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int j = s - 1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = x;
            } else {
                for (int i = pos; i > 0; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }
        return cache;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sorting4 main = new Sorting4();
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] cache = new int[s];
        int[] work = new int[n];

        for (int i = 0; i < n; i++) {
            work[i] = sc.nextInt();
        }
        for (int x : main.solution(s, n, cache, work)) {
            System.out.print(x + " ");
        }
    }
}
