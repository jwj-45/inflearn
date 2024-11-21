package Section8;

import java.io.*;
import java.util.*;

public class Main3 {

    static int n;
    static int m;
    static int[][] olympia;
    static int answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int time, int[][] olympia) {
        if (time > m) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L + 1, sum + olympia[L][0], time + olympia[L][1], olympia);
            DFS(L + 1, sum, time, olympia);
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Main3 main = new Main3();

        n = sc.nextInt();
        m = sc.nextInt();
        olympia = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                olympia[i][j] = sc.nextInt();
            }
        }
        main.DFS(0, 0, 0, olympia);
        System.out.println(answer);
    }
}
