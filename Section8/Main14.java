package Section8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main14 {

    static int N, M, pizzaNum, minValue = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<Point> house = new ArrayList<>();
    static ArrayList<Point> pizza = new ArrayList<>();

    public static void DFS(int L, int S) {
        if (L == M) {
            int sum = 0;
            for (Point h : house) {
                int dis = Integer.MAX_VALUE;
                for (int i : combination) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x)) + Math.abs(h.y - pizza.get(i).y);
                }
                sum += dis;
            }
            minValue = Math.min(minValue, sum);
        }
        else {
            for (int i = S; i < pizzaNum; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) {
                    house.add(new Point(i, j));
                } else if (tmp == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }
        pizzaNum = pizza.size();
        combination = new int[M];
        DFS(0, 0);
        System.out.println(minValue);
    }
}
