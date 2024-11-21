package Section6;

import java.util.Scanner;

public class Sorting5 {

    public String solution(int n, int[] arr) {

        String answer = "U";
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (num == arr[j]) {
                    return "D";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sorting5 main = new Sorting5();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, arr));
    }
}
