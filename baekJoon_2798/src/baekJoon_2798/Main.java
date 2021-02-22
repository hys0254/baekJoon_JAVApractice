package baekJoon_2798;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		// 첫째줄 입력 : 카드의 개수 N 3~100, 최대값 10~300000
				// 둘째줄 입력 : 카드에 쓰여있는 수 100000을 넘지 않는 양의 정수
				BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
				
				StringTokenizer st = new StringTokenizer(rb.readLine());
				int numCard = Integer.parseInt(st.nextToken());
				int limit = Integer.parseInt(st.nextToken());
				int[] cardSet = new int[numCard];
				st = new StringTokenizer(rb.readLine());
				for(int i =0 ;i<numCard;i++) {
					cardSet[i]=Integer.parseInt(st.nextToken());
				}
				
				
				
	}

}
