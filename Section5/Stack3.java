package Section5;

import java.util.Scanner;
import java.util.Stack;

public class Stack3 {

    public int solution(int n, int moves, int[][] board, int[] movesArr) {

        Stack<Integer> st = new Stack<>();

        int cnt = 0;
        for (int i = 0; i < moves; i++) {
            int a = movesArr[i] - 1;
            for (int j = 0; j < n; j++) {
                if (board[j][a] != 0) {
                    if (!st.isEmpty() && st.peek() == board[j][a]) {
                        st.pop();
                        cnt += 2;
                    }
                    else {
                        st.push(board[j][a]);
                    }
                    board[j][a] = 0;
                    break;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack3 stack = new Stack3();
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int moves = sc.nextInt();
        int[] movesArr = new int[moves];
        for (int i = 0; i < moves; i++) {
            movesArr[i] = sc.nextInt();
        }
        System.out.print(stack.solution(n,moves,board,movesArr));
    }
}
