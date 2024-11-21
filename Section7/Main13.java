package Section7;

import java.io.*;
import java.util.*;

public class Main13 {

    static int N, M, cnt = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] isVisited;

    public void DFS(int point) {

        if (point == N) {
            cnt++;
        }
        else {
            for (int nextP : graph.get(point)) {
                if (!isVisited[nextP]) {
                    isVisited[nextP] = true;
                    DFS(nextP);
                    isVisited[nextP] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Main13 main = new Main13();

        graph = new ArrayList<ArrayList<Integer>>();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        isVisited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        isVisited[1] = true;
        main.DFS(1);
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
        br.close();

    }
}
