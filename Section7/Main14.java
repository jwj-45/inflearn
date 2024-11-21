package Section7;

import java.io.*;
import java.util.*;

public class Main14 {

    static int N, M;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] isVisited;
    static int[] distance;

    public void BFS(int value) {
        Queue<Integer> queue = new LinkedList<>();
        isVisited[value] = true;
        distance[value] = 0;
        queue.offer(value);
        while (!queue.isEmpty()) {
            int curVal = queue.poll();
            for (int nextVal : graph.get(curVal)) {
                if (!isVisited[nextVal]) {
                    isVisited[nextVal] = true;
                    queue.offer(nextVal);
                    distance[nextVal] = distance[curVal] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Main14 main = new Main14();

        graph = new ArrayList<ArrayList<Integer>>();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        isVisited = new boolean[N + 1];
        distance = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        main.BFS(1);
        for (int i = 2; i <= N; i++) {
            bw.write(i + " : " + distance[i] );
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
