package Section7;

import java.io.*;
import java.util.StringTokenizer;

public class Main12 {

    static int N, M, cnt = 0;
    static boolean[] isVisited;
    static int[][] graph;

    public void DFS(int point) {

        if (point == N) {
            cnt++;
        }
        else {
            for (int i = 1; i <= N; i++) {
                if (graph[point][i] == 1 && isVisited[i] == false) {
                    isVisited[i] = true;
                    DFS(i);
                    isVisited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Main12 main = new Main12();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N + 1][N + 1];
        isVisited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }
        isVisited[1] = true;
        main.DFS(1);
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
}
