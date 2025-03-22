import java.io.*;
import java.util.*;

class Question {
	int s;
	int t;
	
	public Question(int s, int t) {
		this.s = s;
		this.t = t;
	}
}

public class Main6 {
	
	static int n, m;
	static int[] dy;
	static Question[] arr;
	
	public int solution() {
		dy = new int[m + 1];
		for(int i = 0; i < n; i++) {
			for(int j = m; j >= arr[i].t; j--) {
				dy[j] = Math.max(dy[j], dy[j - arr[i].t] + arr[i].s);
			}
		}
		return dy[m];
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new Question[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int s = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			
			arr[i] = new Question(s, t);
		}
		
		Main6 main = new Main6();
		
		System.out.println(main.solution());
	}
}