import java.util.*;
import java.io.*;

class Physic implements Comparable<Physic> {
	
	int height;
	int weight;
	
	public Physic(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Physic o) {
		return o.height - this.height;
	}
}

public class Main1 {
	
	public int solution(ArrayList<Physic> arr) {
		int cnt = 0, max = 0;
		for(Physic a : arr) {
			if(a.weight > max) {
				max = a.weight;
				cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Physic> arr = new ArrayList<Physic>();
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int h = Integer.parseInt(input[0]);
			int w = Integer.parseInt(input[1]);
			
			arr.add(new Physic(h, w));
		}
		Collections.sort(arr);
		Main main = new Main();
		
		System.out.println(main.solution(arr));
		
	}
}