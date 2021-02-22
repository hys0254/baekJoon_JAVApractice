package baekJoon_2798;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws Exception {
		
				BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
				
				StringTokenizer st = new StringTokenizer(rb.readLine());
				int numCard = Integer.parseInt(st.nextToken());
				int limit = Integer.parseInt(st.nextToken());
				int maxSum = Integer.MIN_VALUE;
				int[] cardSet = new int[numCard];
				st = new StringTokenizer(rb.readLine());
				for(int i =0 ;i<numCard;i++) {
					cardSet[i]=Integer.parseInt(st.nextToken());
				}
				
				for(int i = 0; i<numCard;i++) {
					for(int j = 0; j<numCard;j++) {
						if(i==j) {continue;}
						for(int k = 0; k<numCard;k++) {
							if(j==k||k==i) {continue;}
							int compare = cardSet[i] + cardSet[j] + cardSet[k];
							if(compare>maxSum&&compare<=limit) {
								maxSum=compare;
							}
						}
					}
				}
				System.out.println(maxSum);
				
	}

}
