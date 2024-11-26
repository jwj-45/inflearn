import java.io.*;
import java.util.*;

public class Main6 {
	
	static int[] unf;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		unf = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			unf[i] = i;
		}
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			Union(a, b);
		}
		st = new StringTokenizer(br.readLine());
		
		
	}
}