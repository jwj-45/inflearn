package section2;

import java.util.Scanner;

public class Array8 {

    public int[] solution(int n, int[] arr) {

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int grade = 1;
            for (int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) {
                    grade++;
                }
            }
            answer[i] = grade;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array8 a8 = new Array8();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : a8.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
