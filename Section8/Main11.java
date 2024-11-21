package Section8;

import java.util.*;

public class Main11 {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

//  처음위치에서부터 얼마나 떨어져 있는지
//  즉, 그 위치가 얼마만큼의 거리에 있는지 나타내는 이차원 배열 = dis
    private static int[][] maze, dis;

    public void findMinRoot(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        maze[x][y] = 1;
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                System.out.printf("nx(%d) = tmp.x(%d) + dx[i](%d)\n", nx, tmp.x, dx[i]);
                int ny = tmp.y + dy[i];
                System.out.printf("ny(%d) = tmp.y(%d) + dy[i](%d)\n", ny, tmp.y, dy[i]);

                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                    System.out.printf("dis[%d][%d] = dis[%d][%d] + 1 \n", nx, ny, tmp.x, tmp.y);
                    System.out.printf("dis[%d][%d] == %d\n\n", nx, ny, dis[nx][ny]);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main11 main = new Main11();

        maze = new int[8][8];
        dis = new int[8][8];

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        main.findMinRoot(1, 1);
        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }
}
