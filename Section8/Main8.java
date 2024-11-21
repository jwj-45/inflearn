package Section8;

import java.util.Scanner;

public class Main8 {

    static int[] multi, num, ch;
    static int N, F;
    int[][] dy = new int[35][35];
    boolean findSuccess = false;

//  3 1 2 4 ==> 3이 1번 1이 3번 2가 3번 4가 1번 더해짐
    public int combi(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    public void DFS(int cnt, int sum) {
        if (findSuccess) {
            return;
        }
        if (cnt == N) {
            if (sum == F) {
                for (int x : num) {
                    System.out.print(x + " ");
                }
                findSuccess = true;
            }

        } else {
//          num 배열은 multi 배열과 곱해지는 수이므로 for 문의 i는 index 가 아니라 num 배열에 들어갈 숫자
            for (int i = 1; i <= N; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    num[cnt] = i; // --> 0 1 2 3 인덱스 차례로 숫자가 들어간다고 생각하면 됨
                    DFS(cnt + 1, sum + (num[cnt] * multi[cnt]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main8 main = new Main8();

        N = sc.nextInt();
        F = sc.nextInt();
        multi = new int[N];
        num = new int[N];
        ch = new int[N + 1];

//      multi[0] = 3 Combi 0
//      multi[1] = 3 Combi 1
//      multi[2] = 3 Combi 2
//      multi[3] = 3 Combi 3
        for (int i = 0; i < N; i++) {
            multi[i] = main.combi(N - 1, i);
        }

        main.DFS(0, 0);
    }
}
