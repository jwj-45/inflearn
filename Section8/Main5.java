package Section8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main5 {

    private static int n, m, answer = Integer.MAX_VALUE;
    public void DFS(int cnt, int sum, Integer[] coin) {

        if (sum > m) {
            return;
        }
//      시간복잡도를 줄일수 있음
//      이미 저장된 answer값보다 cnt값이 커지면 볼 필요가 없음
        if (cnt >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, cnt);
        }
        else {
            for (int i = 0; i < n; i++) {
                DFS(cnt + 1, sum + coin[i], coin);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main5 main = new Main5();

        n = sc.nextInt();
        Integer[] coin = new Integer[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

//      큰 금액부터 돌면 시간복잡도를 훨씬 줄일수 있음
//      coin배열을 내림차순으로 정렬
//      Collection.reverseOrder를 사용하려면 배열이 객체형으로 되야함
        Arrays.sort(coin, Collections.reverseOrder());
        m = sc.nextInt();

        main.DFS(0,0,coin);
        System.out.println(answer);
    }
}
