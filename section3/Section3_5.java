package section3;

import java.util.*;

public class Section3_5 {

    public int solution(int n, int[] arr) {

        int cnt = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n/2 + 1; rt++) {
            sum += arr[rt];
            while (sum >= n) {
                if (sum == n) {
                    cnt++;
                }
                sum -= arr[lt++];
            }
        }
        return cnt;
    }

    public int solution2(int n) {

        int answer = 0;
        int cnt = 1;    // cnt는 연속된 숫자의 갯수
        n--;
        while (n > 0) { // n == 0 이 되면 멈춤
            cnt++;
            n -= cnt;
            // cnt가 2이면 n에 1 2를 뺀 후 연속된 숫자 갯수로 나누어 떨어지면 answer에 추가
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Section3_5 s = new Section3_5();
        int n = sc.nextInt();
        int arr[] = new int[n/2 + 1];

        for (int i = 0; i < n/2 + 1; i++) {
            arr[i] = i + 1;
        }
        System.out.println(s.solution(n, arr));
        System.out.println(s.solution2(n));
    }
}
