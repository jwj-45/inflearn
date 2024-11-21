package section2;

import java.util.Scanner;

public class Array10 {

    public int solution(int n, int[][] arr) {

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] > arr[i - 1][j]
                        && arr[i][j] > arr[i][j - 1]
                        && arr[i][j] > arr[i + 1][j]
                        && arr[i][j] > arr[i][j + 1]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array10 a10 = new Array10();
        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(a10.solution(n, arr));
    }
}
