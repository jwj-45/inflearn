package Section8;

import java.io.*;
import java.util.StringTokenizer;

public class Main1_lecture {

    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) {
            return;
        }
        System.out.printf("16번줄 | L: %d, sum: %d, answer: %s\n", L, sum, answer);
        if (sum > total / 2) {
            System.out.printf("sum값이 %d이라 return \n\n", sum);
            return;
        }
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            System.out.printf("26번줄 | L: %d, sum: %d, answer: %s\n\n", L, sum, answer);
            DFS(L + 1, sum + arr[L], arr);
            System.out.printf("28번줄 | L: %d, sum: %d, answer: %s\n", L, sum, answer);
            DFS(L + 1, sum, arr);
        }
        System.out.printf("31번줄 | L: %d, sum: %d, answer: %s 종료데스\n\n", L, sum, answer);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main1_lecture main = new Main1_lecture();

        n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        main.DFS(0, 0, arr);
        bw.write(answer);

        bw.flush();
        bw.close();
        br.close();
    }
}
