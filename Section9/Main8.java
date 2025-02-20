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


public class Main8 {

	static boolean[] ch;
	static List<ArrayList<Edge>> list;
	static int sum;
	
	public void solution() {
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		pq.offer(new Edge(1, 0));
		while(!pq.isEmpty()) {
			Edge e = pq.poll();
			if(!ch[e.v]) {
				ch[e.v] = true;
				sum += e.c;
				for(Edge eg : list.get(e.v)) {
					if(!ch[eg.v]) {
						pq.offer(new Edge(eg.v, eg.c));
					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int v = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		ch = new boolean[v + 1];
		
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		list = new ArrayList<ArrayList<Edge>>();
		
		for(int i = 0; i <= v; i++) {
			list.add(new ArrayList<Edge>());
		}
		
		for(int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list.get(a).add(new Edge(b, c));
			list.get(b).add(new Edge(a, c));
		}
		Main8 main = new Main8();
		main.solution();
		System.out.println(sum);
	}
}