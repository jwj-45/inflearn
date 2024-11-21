package Section6;

import java.io.*;
import java.util.*;

public class Sorting6 {

//    public ArrayList<Integer> solution(int n, int[] height) {
//
//        int cnt = 0;
//        ArrayList<Integer> idx = new ArrayList<>();
//        for (int i = 0; i < n - 1; i++) {
//            if (height[i] > height[i + 1] && height[i] > height[i - 1]) {
//                cnt++;
//                if (cnt == 2) {
//                    idx.add(i + 2);
//                } else {
//                    idx.add(i + 1);
//                }
//            }
//        }
//        return idx;
//    }

    public ArrayList<Integer> solution(int n, int[] height) {

        ArrayList<Integer> idx = new ArrayList<>();
        int[] tmp = height.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if (height[i] != tmp[i]) {
                idx.add(i + 1);
            }
        }
        return idx;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Sorting6 s = new Sorting6();

        int n = Integer.parseInt(br.readLine());
        int[] height = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : s.solution(n, height)) {
            bw.write(x +" ");
        }
        bw.flush();
        br.close();
    }
}
