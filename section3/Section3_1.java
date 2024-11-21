package section3;

import java.util.*;

public class Section3_1 {

    public int[] solution(int n, int m, int[] arr1, int[] arr2) {

        int sum = n + m;
        int index = 0;
        int[] sumArr = new int[sum];

        for (int i = 0; i < sum; i++) {
            if (i < n) {
                sumArr[i] = arr1[i];
            }
            else {
                sumArr[i] = arr2[index];
                index++;
            }
        }
        Arrays.sort(sumArr);
        return sumArr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Section3_1 p1 = new Section3_1();

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int x : p1.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
