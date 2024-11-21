import java.io.*;
import java.util.*;

class Edge implements Comparable {
	int v;
	int c;
	
	@Override
	public int compareTo(Edge e) {
		return this.c - e.c;
	}
}

public class Main5 {
	
	static List<ArrayList<Edge>> list;
	
	public void solution() {
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StrinTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new ArrayList<ArrayList<Edge>>();
		for(int i = 1; i <= n; i++) {
			list.add(new ArrayList<Edge>);
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Edge(v, c));
		}
	}
}