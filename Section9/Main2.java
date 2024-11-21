import java.util.*;
import java.io.*;

class Time implements Comparable<Time> {
	int start;
	int end;
	
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public int compareTo(Time t) {
		if(t.end == this.end) {
			return this.start - t.start;
		}
		return this.end - t.end;
	}
}

public class Main2 {
	
	public int solution(ArrayList<Time> arr) {
		int cnt = 0, end = 0;
		for(Time t : arr) {
			if(t.start >= end) {
				end = t.end;
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Time> arr = new ArrayList<>();
		
		StringTokenizer st;
		for(int i = 0; i < n; i ++) {
			st = new StringTokenizer(br.readLine());
			
			int sr = Integer.parseInt(st.nextToken());
			int ed = Integer.parseInt(st.nextToken());
			
			arr.add(new Time(sr, ed));
		}
		Collections.sort(arr);
		
		Main9_2 main = new Main9_2();
		
		System.out.println(main.solution(arr));
	}
}