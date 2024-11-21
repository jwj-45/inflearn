package Section8;

import java.util.Scanner;

public class Main10 {

//  상하좌우로 이동할때 사용하는 배열 dx, dy
//  한번에 한칸씩만 이동해야하므로 각 인덱스 위치의 값들이 더했을때 |1|이 되도록 설정
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int cnt;
    private static int[][] maze;

    public void findRoot(int x, int y) {
        if (x == 7 && y == 7) {
//      (7,7)에 도착했을때 경로 count++
            cnt++;
        }
//      현재 위치에서 (x, y)에 (dx, dy)만큼 더한 위치를 다시 재귀함수로
//      탐색완료한 위치는 다시 탐색 못하도록 1로 변경해줌
//      재귀함수 끝나면 백트래킹 다시 0을 넣어주고 해당위치에서 다른경로 탐색
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    findRoot(nx, ny);
                    maze[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main10 main = new Main10();

        maze = new int[8][8];
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        maze[1][1] = 1;

        main.findRoot(1, 1);
        System.out.println(cnt);
    }
}
