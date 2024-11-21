package Section8;

import java.io.*;
import java.util.*;

public class Main9 {

    static int N, M;
    static int[] arr;

    public void DFS(int cnt, int start, BufferedWriter bw) throws IOException {

        if (cnt == M) {
            System.out.printf("cnt == %d이므로 arr배열 출력\n\n", cnt);
            for (int x : arr) {
                bw.write(x + " ");
            }
            bw.newLine();
        }
        else {
            for (int i = start; i <= N; i++) {
                arr[cnt] = i;
                System.out.printf("cnt: %d | start: %d | i: %d | arr[cnt]: %d\n", cnt, start, i, arr[cnt]);
                DFS(cnt + 1,  i + 1, bw);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Main9 main = new Main9();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        main.DFS(0, 1, bw);

        bw.flush();
        bw.close();
        br.close();
    }
}
