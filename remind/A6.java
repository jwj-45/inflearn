package remind;

import java.util.*;

public class A6 {

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

    public ArrayList<Integer> solution(int n, int arr[]) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int res = 0;
            while (arr[i] > 0) {
                int tmp = arr[i] % 10;
                res = res * 10 + tmp;
                arr[i] = arr[i] / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A6 a = new A6();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : a.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
