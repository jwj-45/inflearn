package section2;

import java.util.Scanner;

public class Array5_lecture {

    public int solution(int n) {
        int count = 0;
        int[] arr = new int[n + 1];
        for(int i = 2; i < n; i++) {
            if(arr[i] == 0) {
                count++;
                for(int j = i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Array5_lecture a5 = new Array5_lecture();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(a5.solution(n));
    }
}
