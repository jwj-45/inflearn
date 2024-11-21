package remind;

import java.util.Scanner;

public class A5 {

    public int solution(int[] arr) {

        int cnt = 1;
        for (int i = 2; i < arr.length; i++) {
            for (int j = 3; j < arr.length; j++) {
                if (arr[j] != 1) {
                    if (i == arr[j]) {
                        cnt++;
                    } else if (arr[j] % i == 0) {
                        arr[j] = 1;
                    }
                }
            }
        }
        return cnt;
    }

    public int solution2(int arr[], int n) {

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                cnt++;
                for (int j = i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A5 a = new A5();
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

//        for (int i = 0; i < n + 1; i++) {
//            arr[i] = i;
//        }
        System.out.println(a.solution2(arr, n));
    }
}
