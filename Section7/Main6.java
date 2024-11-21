package Section7;

public class Main6 {

    static int n;
    static int[] ch;

    public void DFS(int Lv) {
        if (Lv == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            ch[Lv] = 1;
            DFS(Lv + 1);
            ch[Lv] = 0;
            DFS(Lv + 1);
        }
    }

    public static void main(String[] args) {

        Main6 main = new Main6();
        n = 3;
        ch = new int[n + 1];
        main.DFS(1);
    }
}
