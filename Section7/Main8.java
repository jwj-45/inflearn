package Section7;

import java.util.*;

public class Main8 {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();
    public int BFS(int start, int end) {
        ch = new int[10001];
        ch[start] = 1;
        q.offer(start);
        int Lv = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();

//              큐에 집어넣고 빼서 확인해서 현재 Lv을 return하는것 보다
//              자식노드 계산하고 큐에 집어넣을때 end값이면 현재 Lv에 +1 해주고 return하는게 나음
                /*if (x == end) {
                    return Lv;
                }*/

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == end) {
                        return Lv + 1;
                    }
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        q.offer(nx);
                    }
                }
            }
            Lv++;
        }
        return -1;
    }

    public static void main(String[] args) {

        Main8 main = new Main8();
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.print(main.BFS(start, end));
    }
}
