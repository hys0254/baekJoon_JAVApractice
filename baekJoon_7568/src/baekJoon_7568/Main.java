package baekJoon_7568;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int setCount = Integer.parseInt(br.readLine());
		int[][] sizeSet = new int[setCount][3];
		for(int i=0; i<setCount ; i++) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			sizeSet[i][0]=Integer.parseInt(tk.nextToken());
			sizeSet[i][1]=Integer.parseInt(tk.nextToken());
			sizeSet[i][2]=1;
		}
		for(int i=0;i<setCount; i++) {
			for(int j=0;j<setCount;j++) {
				if(sizeSet[i][0]<sizeSet[j][0]&&sizeSet[i][1]<sizeSet[j][1]) {
					sizeSet[i][2]++;
				}
			}
		}
		for(int i=0; i<setCount; i++) {
			sb.append(sizeSet[i][2]).append(" ");
		}
	System.out.println(sb);
	}
}
