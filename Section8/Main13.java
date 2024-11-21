package Section8;

import java.util.Scanner;

public class Main13 {

    static int N;
    static int[] di = {-1, 0, 1, 0, 1, -1, 1, -1};
    static int[] dj = {0, 1, 0, -1, 1, -1, -1, 1};
    static int[][] board;

    public static void DFS(int x, int y) {

        board[x][y] = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + di[i];
            int ny = y + dj[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && board[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int cnt = 0;
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    cnt++;
                    DFS(i, j);
                }
            }
        }
        System.out.println(cnt);
    }
}
