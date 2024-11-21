package section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Section3_2 {

//    public String solution(int n, int m, int[] arrN, int[] arrM) {
//
//        String answer = "";
//        Arrays.sort(arrN);
//        Arrays.sort(arrM);
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arrM[i] == arrN[j]) {
//                    answer += arrN[j] + " ";
//                }
//            }
//        }
//        return answer;
//    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Section3_2 p2 = new Section3_2();

        int n = br.read();
        int[] arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = br.read();
        }

        for (int x : arrN) {
            System.out.print(x + " ");
        }
        br.close();
//        int m = br.read();
//        int[] arrM = new int[m];
//        for (int i = 0; i < m; i++) {
//            arrM[i] = br.read();
//        }

//        System.out.println(p2.solution(n,m,arrN,arrM));
    }
}
