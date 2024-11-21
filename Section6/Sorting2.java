package Section6;

import java.util.Scanner;

public class Sorting2 {

    public int[] solution(int n, int[] sort) {

        for (int j = 0; j < n; j++) {
            // 끝에서부터 정렬하는데 왼쪽이 오른쪽보다 작아야함
            for (int i = n - 1; i > 0; i--) {
                if (sort[i] < sort[i - 1]) {
                    int tmp = sort[i - 1];
                    sort[i - 1] = sort[i];
                    sort[i] = tmp;
                }
            }
        }
        return sort;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sorting2 main = new Sorting2();
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
