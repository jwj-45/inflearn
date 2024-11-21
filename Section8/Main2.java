package Section8;

import java.util.*;

public class Main2 {

    static int c;
    static int n;
    static int[] dogs;
    static int[] checkSum;
    static int max;

    public void DFS(int idx) {

        if (idx == n) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (checkSum[i] == 1) {
                    sum += dogs[i];
                }
            }
            if (sum < c) {
                max = Math.max(sum, max);
            }
        }
        else {
            checkSum[idx] = 1;
            DFS(idx + 1);
            checkSum[idx] = 0;
            DFS(idx + 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main2 main = new Main2();
        c = sc.nextInt();
        n = sc.nextInt();
        dogs = new int[n];
        checkSum = new int[n];

        for (int i = 0; i < n; i++) {
            dogs[i] = sc.nextInt();
        }

        main.DFS(0);
        System.out.print(max);
    }
}
