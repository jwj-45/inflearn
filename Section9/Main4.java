import java.util.*;
import java.io.*;

class Lecture implements Comparable<Lecture> {
	
	int money, date;
	
	public Lecture(int money, int date) {
		this.money = money;
		this.date = date;		
	}
	
	@Override
	public int compareTo(Lecture ob) {
		return ob.date - this.date;
	}
}

public class Main4 {

	public int solution(ArrayList<Lecture> list, int n, int max) {
		
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(list);
		int j = 0;
		for(int i = max; i >= 1; i--) {
			for( ; j < n; j++) {
				if(list.get(j).date < i) {
					break;
				}
				pQ.offer(list.get(j).money);
			}
			if(!pQ.isEmpty()) {
				answer += pQ.poll();
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Lecture> list = new ArrayList<Lecture>();
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int mon = Integer.parseInt(st.nextToken());
			int dat = Integer.parseInt(st.nextToken());
		 
			list.add(new Lecture(mon, dat));
			max = Math.max(dat, max);
		}
		Main main = new Main();
		System.out.println(main.solution(list, n, max));
	}
}
