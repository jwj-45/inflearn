package Section7;

public class Main3 {

    public int DFS(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }

    }

    public static void main(String[] args) {

        Main3 main = new Main3();
        System.out.print(main.DFS(5));
//        DFS(5);
//        5 * DFS(4)
//              4 * DFS(3)
//                     3 * DFS(2)
//                           2 * (DFS(1) = 1)
    }
}
