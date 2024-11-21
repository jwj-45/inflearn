package Section8;

import java.util.Scanner;

public class Main6 {

    private static int n, m;
    private static int[] arr, pm, ch;

    public void DFS(int cnt) {

        if (cnt == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[cnt] = arr[i];
                    DFS(cnt + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main6 main = new Main6();

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        pm = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        main.DFS(0);
    }
}
