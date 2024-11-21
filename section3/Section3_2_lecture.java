package section3;

import java.util.*;

public class Section3_2_lecture {

    public ArrayList<Integer> solution(int n, int m, int[] arrN, int[] arrM) {

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arrN);
        Arrays.sort(arrM);

        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {

            if (arrN[p1] == arrM[p2]) {
                answer.add(arrN[p1]);
                p1++;
                p2++;
            } else if (arrN[p1] < arrM[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Section3_2_lecture p2 = new Section3_2_lecture();

        int n = sc.nextInt();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = sc.nextInt();
        }
        for (int x : p2.solution(n, m, arrN, arrM)) {
            System.out.print(x + " ");
        }
    }
}

