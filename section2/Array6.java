package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array6 {

    public boolean isPrime(int res) {
        if (res == 1) {
            return false;
        }
        for (int i = 2; i < res; i++) {
            if (res % i == 0) {
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr) {

//        713
//        tmp = 713, t = 3, res = 3, tmp = 71
//        tmp = 71, t = 1, res = 31, tmp = 7
//        tmp = 7, t = 7, res = 317, tmp = 0


        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array6 a6 = new Array6();
        int n = sc.nextInt();
        int arr[] = new int[n];
/*        String[] st = new String[n];

        for(int i = 0; i < n; i++) {
            st[i] = new StringBuilder(sc.next()).reverse().toString();
            arr[i] = Integer.parseInt(st[i]);
        }*/

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : a6.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
