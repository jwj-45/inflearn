package remind;

import java.io.*;
import java.util.StringTokenizer;

public class Section8_8 {

    static int N, F;
    static int[] multi, number, check;
    int[][] combi = new int[11][11];
    static boolean success = false;
    static BufferedWriter bw;

    public int combination(int n, int r) {

//      메모이제이션
        if (combi[n][r] > 0) {
            return combi[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        }
        else {
            return combi[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }

    public void findSequence(int cnt, int sum) throws IOException {

        if (success) {
            return;
        }
        if (cnt == N && sum == F) {
            success = true;
            for (int x : number) {
                bw.write(x +" ");
            }
        }
        else {
            for (int i = 1; i <= N; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    number[cnt] = i;
                    findSequence(cnt + 1, sum + (multi[cnt] * number[cnt]));
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Section8_8 main = new Section8_8();

        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());
        multi = new int[N];
        number = new int[N];
//      배열의 index 를 사용하려고 ch 배열 선언
//      1부터 사용해야 하므로 배열의 크기는 N + 1
//      사용한 숫자 확인용
        check = new int[N + 1];

        for (int i = 0; i < N; i++) {
            multi[i] = main.combination(N - 1, i);
        }
        main.findSequence(0, 0);

        bw.flush();
        bw.close();
        br.close();
    }
}
