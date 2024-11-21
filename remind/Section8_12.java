package remind;

import java.io.*;
import java.util.*;

class Point {

    int row;
    int col;

    Point(int row, int col) {
        this.col = col;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}

public class Section8_12 {

    static int[] drow = {1, -1, 0, 0};
    static int[] dcol = {0, 0, 1, -1};
    static int N, M;
    static int[][] tomato;
    static int[][] ripenTomato;

    static Queue<Point> q = new LinkedList<>();

    public void BFS() {

        while (!q.isEmpty()) {

            Point p = q.poll();
            for (int j = 0; j < 4; j++) {
                int newRow = p.getRow() + drow[j];
                int newCol = p.getCol() + dcol[j];
                if (newRow >= 0 && newRow < N && newCol >=0 && newCol < M && tomato[newRow][newCol] == 0) {
                    tomato[newRow][newCol] = 1;
                    ripenTomato[newRow][newCol] = ripenTomato[p.getRow()][p.getCol()] + 1;
                    q.offer(new Point(newRow, newCol));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Section8_12 main = new Section8_12();

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        tomato = new int[N][M];
        ripenTomato = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
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
                    min = Math.max(min, ripenTomato[i][j]);
                }
            }
            bw.write(min + "\n");
        } else {
            bw.write(-1 +"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
