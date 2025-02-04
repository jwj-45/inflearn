import java.io.*;
import java.util.*;

public class Main1 {
	
	static int[] dy;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3; i <= n; i++) {
			dy[i] = dy[i - 2] + dy[i - 1];
		}
		return dy[n];
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dy = new int[n + 1];
		Main1 main = new Main1();
		
		int ans = main.solution(n);
		System.out.println(ans);
	}
}