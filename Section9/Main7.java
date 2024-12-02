import java.io.*;
import java.util.*;

class Edge2 implements Comparable<Edge2> {
	
	int a;
	int b;
	int c;
	
	public Edge2(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public int compareTo(Edge2 e) {
		return this.c - e.c;
	}
}

public class Main7 {

	static int[] arr;
	public int find(int v) {
		if(v == arr[v]) {
			return v;
		}
		else {
			return arr[v] = find(arr[v]);
		}
	}
	
	public void union(int a, int b) {
		int fa = find(a);
		int fb = find(b);
		if(fa != fb) {
			arr[fa] = fb;
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		arr = new int[v + 1];
		
		ArrayList<Edge2> list = new ArrayList<>();
		for(int i = 1; i < v; i++) {
			arr[i] = i;
		}
		
		Main7 main = new Main7();
		
		for(int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.add(new Edge2(a, b, c));
		}
		// 최소비용 계산하니까 greedy로 유지비용이 적은순으로 정렬(오름차순 정렬)
		Collections.sort(list);
		int sum = 0;
		for(Edge2 eg : list) {
			int fa = main.find(eg.a);
			int fb = main.find(eg.b);
			
			if(fa != fb) {
				main.union(eg.a, eg.b);
				sum += eg.c;
			}
		}
		System.out.println(sum);
	}
}