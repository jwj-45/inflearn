import java.io.*;
import java.util.*;

public class Main5 {
	
	public int solution(int n, int m, int[] coin) {
		int[] dy = new int[m + 1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = coin[i]; j <= m; j++) {
				dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
			}
		}
		return dy[m];
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] coin = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		
		Main5 main = new Main5();
		
		System.out.println(main.solution(n, m, coin));
	}
}