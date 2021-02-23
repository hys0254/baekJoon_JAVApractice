package baekJoon_11729;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		sb.append((int)(Math.pow(2, N)-1)).append('\n');			
		hanoi(N,1,3,2);
		System.out.println(sb);
	}
	public static void hanoi (int size, int from, int to, int mid) {
		if(size==1) {
			sb.append(from).append(" ").append(to).append("\n");
			return;
		}
				
		
		hanoi(size-1,from,mid,to);
		sb.append(from).append(" ").append(to).append("\n");
		hanoi(size-1,mid,to,from);
		
		
		
	}
}
