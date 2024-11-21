package Section8;

import java.util.Scanner;

public class Main4 {

    static int[] pm;
    static int n, m;
    public void DFS(int cnt) {
        if (cnt == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                pm[cnt] = i;
                DFS(cnt + 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main4 main = new Main4();

        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];

        main.DFS(0);
    }
}
