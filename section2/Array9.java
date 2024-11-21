package section2;

import java.util.*;

public class Array9 {

    public int solution(int n, int[][] arr) {

        int[] sum1 = new int[n];
        int[] sum2 = new int[n];
        int sum3 = 0;
        int sum4 = 0;
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 가로줄 더한거 배열
                sum1[i] += arr[i][j];
                // 세로줄 더한거 배열
                sum2[i] += arr[j][i];
                // 왼쪽에서 오른쪽 아래로 대각선
                if (i == j) {
                    sum3 += arr[i][j];
                }
                if (max1 < sum1[i]) {
                    max1 = sum1[i];
                }
                if (max2 < sum2[i]) {
                    max2 = sum2[i];
                }
            }
            // 오른쪽에서 왼쪽으로 대각선
            sum4 += arr[i][n - i - 1];
        }

        int maxArr[] = new int[]{max1, max2, sum3, sum4};

        int max = 0;
        for (int i = 0; i < maxArr.length; i++) {
            if (max < maxArr[i]) {
                max = maxArr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array9 a9 = new Array9();
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(a9.solution(n, arr));
    }
}
