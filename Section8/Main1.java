package Section8;

import java.io.*;
import java.util.*;

public class Main1 {

    static int n;
//    static int sum1;
//    static int sum2;
    static int[] value;
    static int[] ch;
    static String answer = "NO";

    public void DFS(int idx) {

        if (idx == n) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                if (ch[i] == 1) {
                    sum1 += value[i];
                } else {
                    sum2 += value[i];
                }
            }
            System.out.printf("sum1 : %d ||| sum2 : %d \n", sum1, sum2);
            if (sum1 == sum2) {
                answer = "YES";
            }
        } else {
            ch[idx] = 1;
            DFS(idx + 1);
            ch[idx] = 0;
            DFS(idx + 1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main1 main = new Main1();
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        value = new int[n];
        ch = new int[n];


        for (int i = 0; i < n; i++) {
            value[i] = Integer.parseInt(st.nextToken());
        }
        main.DFS(0);
        bw.write(answer);
        bw.flush();

        bw.close();
        br.close();
    }
}
