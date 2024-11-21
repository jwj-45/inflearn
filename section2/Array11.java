package section2;

import java.util.Scanner;

public class Array11 {

    public int solution(int n, int[][] arr) {

//        int[] count = new int[n];

        int answer = 0;
        int max = Integer.MIN_VALUE;
        // i번 학생 고정
//        for (int i = 1; i <= n; i++) {
//            j학년
//            for (int j = 1; j <= 5; j++) {
//                for (int k = 1; k <= n; k++) {
//                    if (i != k && arr[i][j] == arr[k][j]) {
//                        count[i] += cnt;
//                    }
//                }
//            }
//            if (max < count[i]) {
//                max = count[i];
//            }
//        }
//        for (int x : count) {
//            System.out.print(x + " ");
//        }
//        return max;

        // i는 학생 => 탐색 기준
        for (int i = 1; i <= n; i++) {
            // 탐색하는 j번 학생
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                // k는 학년
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; // => 안 멈춰 주면 학생들끼리 같은반 횟수가 중복됨
                    }
                }
            }
            if (max < cnt) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array11 a11 = new Array11();
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(a11.solution(n, arr));
    }
}
