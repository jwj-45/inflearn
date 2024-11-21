package section3;

import java.util.Scanner;

public class Section3_3 {

//    public int solution(int n, int k, int[] arr) {
//
//        int point = 0;
//        int max = Integer.MIN_VALUE;
//        while (point + k - 1 < n) {
//            int sum = 0;
//            for (int i = point; i < point + k; i++) {
//                sum += arr[i];
//            }
//            if (max < sum) {
//                max = sum;
//            }
//            point++;
//        }
//        return max;
//    }

    public int solution2(int n, int k, int[] arr) {

        // arr배열의 0 1 2번 인덱스의 합 = 38
        int max, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = sum;

        // k번 인덱스 부터 sum에 i번째 인덱스를 더하고 i - k번째 인덱스를 빼면
        // 위 solution 메서드처럼 하나하나 검색하면서 가지 않아도됨
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Section3_3 s = new Section3_3();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(s.solution(n,k,arr));
        System.out.println(s.solution2(n,k,arr));
    }
}
