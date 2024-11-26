import java.io.*;
import java.util.*;

public class Main6 {
	
	static int[] unf;
	public static int Find(int v) {
		if(v == unf[v]) {
			return v;
		}
		else {
			return Find(unf[v]);
		}
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) {
			unf[fa] = fb;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
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
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int fa = Find(a);
		int fb = Find(b);
		
		String ans = "";
		if(fa == fb) {
			ans = "YES";
		}
		else {
			ans = "NO";
		}
		System.out.println(ans);
	}
}