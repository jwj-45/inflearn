import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge> {
	int v;
	int c;
	
	public Edge(int v, int c) {
		this.v = v;
		this.c = c;
	}
	
	@Override
	public int compareTo(Edge e) {
		return this.c - e.c;
	}
}

public class Main5 {
	
	static List<ArrayList<Edge>> list;
	static int[] dis;
	
	public void solution() {
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.offer(new Edge(1, 0));
		while(!pq.isEmpty()) {
			Edge tmp = pq.poll();
			int cv = tmp.v;
			int cc = tmp.c;
			for(Edge e : list.get(cv)) {
				if(dis[e.v] > cc + e.c) {
					dis[e.v] = cc + e.c;
					pq.offer(new Edge(e.v, cc + e.c));
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new ArrayList<ArrayList<Edge>>();
		dis = new int[n + 1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		for(int i = 0; i <= n; i++) {
			list.add(new ArrayList<Edge>());
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Edge(v, c));
		}
		Main5 main = new Main5();
		main.solution();
		for(int i = 2; i <= n; i++) {
			if(dis[i] == Integer.MAX_VALUE) {
				System.out.println(i + " : impossible");
			}
			else {
				System.out.println(i + " : " + dis[i]);
			}
		}
	}
}