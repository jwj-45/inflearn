package section3;

import java.util.Scanner;

public class Section3_6 {

    public int solution(int n, int k, int[] arr) {
        int max = 0; // 연속된 1 배열의 크기
        int cnt = 0; // 0을 1로 바꾸 횟수
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) {
                // 0을 실제로 바꾸는게 아니라 바꿨다 치고 cnt++ 해주면 바꾼갯수
                cnt++;
            }
            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;
                    lt++;
                }
            }
            max = Math.max(max, rt - lt + 1);
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Section3_6 s = new Section3_6();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(s.solution(n,k,arr));
    }
}
