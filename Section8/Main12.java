package Section8;

import java.util.*;

public class Main12 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int M, N;
    static int[][] tomato, distance;
    static Queue<Point> q = new LinkedList<>();

    public void BFS() {

        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && tomato[nx][ny] == 0) {
                    tomato[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    distance[nx][ny] = distance[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main12 main = new Main12();

        M = sc.nextInt();
        N = sc.nextInt();
        tomato = new int[N][M];
        distance = new int[N][M];

//      먼저 시작위치 익은 토마토의 위치를 찾음
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                tomato[i][j] = sc.nextInt();
                if (tomato[i][j] == 1) {
                    q.offer(new Point(i, j));
                }
            }
        }

        main.BFS();
        boolean flag = true;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 0) {
                    flag = false;
                }
            }
        }

        if (flag) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    min = Math.max(min, distance[i][j]);
                }
            }
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }
}
