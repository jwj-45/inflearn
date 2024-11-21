package Section5;

import java.util.*;

public class Stack6 {

    public int solution(int n, int k) {

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> prince = new ArrayList<>();

        // prince에 1 ~ 8 까지 담는다
        for (int i = 1; i <= n; i++) {
            prince.add(i);
        }

        // prince의 pointer 번호가 k-1일때 index의 해당 값을 stack에 담음
        // pointer는 k-1번째로 담기는지 확인하려고 사용
        int pointer = 0;
        int index = 0;
        // prince의 배열의 크기가 1보다 작아졌을때 반복문 멈춤
        while (prince.size() > 1) {
            // index가 prince.size() - 1 보다 커지면 다시 index를 0으로 초기화
            if (index > prince.size() - 1) {
                index = 0;
            }
            // pointer가 k-1번째가 됬을때 index도 k-1번 돌았기 때문에 price배열의 해당 index의 값을 제거
            // pointer는 0으로 초기화 됬지만 index는 그대로
            if (pointer == k - 1) {
                stack.push(prince.get(index));
                prince.remove(index);
                pointer = 0;
            }
            // k-1번째가 아닌경우 stack에 prince배열의 index값을 저장
            else {
                index++;
                pointer++;
            }
        }

        return  prince.get(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack6 s = new Stack6();
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(s.solution(n, k));
    }
}
