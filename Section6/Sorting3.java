package Section6;

import java.util.Scanner;

public class Sorting3 {

    public int[] solution(int n, int[] sort) {

        for (int i = 1; i < n; i++) {
            int tmp = sort[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (sort[j] > tmp) {
                    sort[j + 1] = sort[j];
                } else {
                    break;
                }

            }
            sort[j+1] = tmp;
        }
        return sort;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sorting3 main = new Sorting3();
        int n = sc.nextInt();
        int[] sort = new int[n];

        for (int i = 0; i < n; i++) {
            sort[i] = sc.nextInt();
        }
        for (int x : main.solution(n, sort)) {
            System.out.print(x + " ");
        }
    }
}
