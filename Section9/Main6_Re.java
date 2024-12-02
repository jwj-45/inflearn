import java.util.*;
import java.io.*;

public class Main6_Re {
	
	static int[] arr;
	public static int find(int v) {
		if(v == arr[v]) {
			return v;
		}
		else {
			return arr[v] = find(arr[v]);
		}
	}
	public static void union(int a, int b) {
		int fa = find(a);
		int fb = find(b);
		if(fa != fb) {
			arr[fa] = fb;
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = i;
		}
	
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			union(a, b);
		}
		st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int fa = find(a);
		int fb = find(b);
		String ans = "NO";

		if(fa == fb) {
			ans = "YES";
		}
		System.out.println(ans);
	}
}