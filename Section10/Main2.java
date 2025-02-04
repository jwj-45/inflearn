import java.io.*;
import java.util.*;

public class Main2 {
	
	static int[] dy;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3; i <= n + 1; i++) {
			dy[i] = dy[i - 2] + dy[i - 1];
		}
		return dy[n + 1];
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		dy = new int[n + 2];
		Main2 main = new Main2();
		
		int ans = main.solution(n);
		System.out.println(ans);
	}
}