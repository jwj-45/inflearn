package section2;

import java.util.Scanner;

public class Array5 {

    public int solution(int n, int[] arr) {

        int index = 2;
        while(index < n) {
            if(arr[index] % arr[index - 1] == 0) {
                arr[index] = 1;
            }
            index++;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 2; j < n; j++) {
                if (i > 1 && arr[j] % i == 0) {
                    arr[j] = 1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array5 a5 = new Array5();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.print(a5.solution(n, arr));
    }
}
