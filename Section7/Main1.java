package Section7;

public class Main1 {
//     재귀함수
    public void DFS(int n) {
        if (n == 0) {
//            메서드가 void형태일때 return은 메서드 종료의 의미도 있다.

        } else {
            System.out.print(n + " ");
//            --> 3 2 1 으로 출력
            DFS(n - 1);
            System.out.print(n + " ");
//          --> 1 2 3 으로 출력
        }
    }

    public static void main(String[] args) {

        Main1 main = new Main1();
        main.DFS(3);
    }
}
