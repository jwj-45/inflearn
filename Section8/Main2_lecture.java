package Section8;

import java.io.*;
import java.util.*;

public class Main2_lecture {

    static int answer = Integer.MIN_VALUE, c, n;
    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main1_lecture main = new Main1_lecture();

        c = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        main.DFS(0, 0, arr);
        bw.write(answer);
        bw.flush();

        bw.close();
        br.close();
    }
}
