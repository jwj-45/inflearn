package remind;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;

//        837
        while (n > 0) {
            int tmp = n % 10;
            res = res * 10 + tmp;
            n = n / 10;
        }
        System.out.println(res);
    }
}
