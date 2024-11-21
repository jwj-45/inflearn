package Section6;

import java.util.*;

public class Sorting1 {

    public int[] solution(int n, int[] sort) {

        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            // i번쨰를 최솟값으로 해놓고
            int min = sort[i];
            // i + 1번째부터 끝까지 중 최소값 찾는 반복문
            for (int j = i + 1; j < n; j++) {
                if (sort[j] < min) {
                    min = sort[j];
                    index = j;
                }
            }
            // 최솟값이 i번째 수 보다 작을때만 자리 바꿈
            if (sort[i] > min) {
                int tmp = sort[i];
                sort[i] = min;
                sort[index] = tmp;
            }
        }
        return sort;
    }

    public int[] solution2(int n, int[] sort) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (sort[j] < sort[idx]) {
                    idx = j;
                }
            }
            int tmp = sort[i];
            sort[i] = sort[idx];
            sort[idx] = tmp;
        }
        return sort;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sorting1 main = new Sorting1();
        int n = sc.nextInt();
        int[] sort = new int[n];

        for (int i = 0; i < n; i++) {
            sort[i] = sc.nextInt();
        }
        for (int x : main.solution(n, sort)) {
            System.out.print(x + " ");
        }
    }
}