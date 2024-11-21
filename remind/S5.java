package remind;

import java.util.Scanner;

public class S5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        String answer = "";
        char tmp = ' ';
        int lt = 0;
        int rt = arr.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            }
            else if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else {
                tmp = arr[rt];
                arr[rt] = arr[lt];
                arr[lt] = tmp;
                rt--;
                lt++;
            }
            answer = String.valueOf(arr);
        }
        System.out.println(answer);
    }
}
