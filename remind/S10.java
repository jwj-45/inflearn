package remind;

import java.util.Scanner;

public class S10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        int[] arr = new int[str.length()];

//        * int pointer = 1000으로 아예 큰 수로 초기화 한 이유 *

//        int pointer = 1 로 초기화 하면 teachermode e 는
//        정방향 반복문 1 0 1 2 3 0 1 2 3 4 0
//        역방향 반복문 1 0 3 2 1 0 4 3 2 1 0
//        최소값 배열은 1 0 1 2 1 0 1 2 2 1 0 => 답이 나오지만

//        만약, aateachermode e 의 경우 pointer = 1 로 초기화 하면
//        정방향 반복문 1 2 3 0 1 2 3 0 1 2 3 4 0
//        역방향 반복문 3 2 1 0 3 2 1 0 4 3 2 1 0
//        최소값 배열은 1 2 1 0 1 2 1 0 1 2 2 1 0 으로 이상한 답이 나옴

        int pointer = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                pointer = 0;
            } else {
                pointer++;
                arr[i] = pointer;
            }
        }

        pointer = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                pointer = 0;
            } else {
                pointer++;
                arr[i] = Math.min(arr[i], pointer);
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
