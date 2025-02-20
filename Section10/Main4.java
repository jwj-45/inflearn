import java.io.*;
import java.util.*;

class Brick implements Comparable<Brick> {
	int w;
	int h;
	int e;
	
	public Brick(int w, int h, int e) {
		this.w = w;
		this.h = h;
		this.e = e;
	}
	
	public int compareTo(Brick b) {
		return b.w - this.w;
	}
}

public class Main4 {
	
	static int[] dy;
	static int n;
	public int solution(Brick[] b) {
		dy = new int[n];
		dy[0] = b[0].h;
		int answer = 0;
		for(int i = 1; i < n; i++) {
			int max = 0;
			for(int j = i - 1; j >= 0; j--) {
//			정렬이 관건
// 			넓이 기준으로 정령하기전 코드 b[i].w < b[j].w && b[i].e < b[j].e 
//			내림차순 정렬했으므로 넓이는 비교안해봐도 됨
				if(b[i].e < b[j].e) {
					max = Math.max(max, dy[j]);
				}
			}
			dy[i] = max + b[i].h;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		Brick[] b = new Brick[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			b[i] = new Brick(w, h, e);
		}
			
		Main4 main = new Main4();
		Arrays.sort(b);
		System.out.print(main.solution(b));
	}
}