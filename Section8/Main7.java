package Section8;

import java.util.Scanner;

public class Main7 {

    private static int[][] dy;

    public int DFS(int n, int r) {

        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main7 main = new Main7();

        int n = sc.nextInt();
        int r = sc.nextInt();

        dy = new int[n + 1][r + 1];

        System.out.println(main.DFS(n, r));
    }
}
