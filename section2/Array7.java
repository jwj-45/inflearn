package section2;

import java.util.Scanner;

public class Array7 {

    public int solution(int n, int[] str) {

        int sum = 0;
        int add = 1;
        for(int i = 0; i < n; i++) {

            if (str[i] == 1) {
                sum += add;
                add++;
            } else if (str[i] == 0) {
                add = 1;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Array7 a7 = new Array7();
        int n = sc.nextInt();
        int[] str = new int[n];

        for(int i = 0; i < n; i++) {
            str[i] = sc.nextInt();
        }

        System.out.println(a7.solution(n, str));
    }
}
