import java.io.*;
import java.util.*;

public class Main5 {
	
	static int n, m;
	static int[] coin;
	static int[] dy;
	public int solution() {
		dy = new int[m + 1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i = 0; i < n; i++) {
			for(int j = coin[i]; j <= m; j++) {
				dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
				// +1 은 coin[i] 한개를 더 쓴다는 의미
			}
		}
		return dy[m];
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		coin = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(st.nextToken());
		}
		m = Integer.parseInt(br.readLine());
		
		Main5 main = new Main5();
		
		System.out.println(main.solution());
	}
}