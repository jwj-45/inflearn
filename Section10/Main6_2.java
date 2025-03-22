import java.io.*;
import java.util.*;

public class Main6_2 {
		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] dy = new int[m + 1];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			
			for(int j = m; j >= t; j--) {
				dy[j] = Math.max(dy[j], dy[j - t] + s);
			}
		}
			
		System.out.println(dy[m]);
	}
}