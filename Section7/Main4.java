package Section7;

public class Main4 {

//    피보나치 수열
//    n값이 커질수록 엄청 많은 가지가 뻗어나가서 오래걸림
//    시간복잡도 좋지않음
    public int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
           return DFS(n - 2) + DFS(n - 1);
        }
    }


//    이미 계산한 값은 fibo배열의 n번째에 저장
    static int[] fibo;
    public int DFS2(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
           return fibo[n] = DFS2(n - 2) + DFS2(n - 1);
        }
    }



    public static void main(String[] args) {

        Main4 main = new Main4();
        int n = 45;

//        n이 커질수록 했던계산 또 하는 계산이 많이지므로 시간복잡도 매우 안좋음
//        for (int i = 1; i <= n; i++) {
//            System.out.print(main.DFS(i) + " ");
//        }

        fibo = new int[n + 1];
        main.DFS2(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
