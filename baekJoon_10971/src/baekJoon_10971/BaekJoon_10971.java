package baekJoon_10971;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class BaekJoon_10971 {

	static int result =Integer.MAX_VALUE;
	static int visitCheck[];
	static int cityNum = 0;
	static int road[][] = null;

	static int start;

	public static void main(String[] args) throws Exception {
		StringTokenizer st = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		cityNum = Integer.parseInt(br.readLine());
		road = new int[cityNum][cityNum];
		for (int i = 0; i < cityNum; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < cityNum; j++) {
				road[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		visitCheck =new int[cityNum];
		for(int i=0;i<cityNum; i++) {
			visitCheck[i]=0;
		}
		for (int i = 0; i < cityNum; i++) {
			start = i;
			findRoute(i, i, 0, 0);
		}
		System.out.println(result);
	}

	public static void findRoute(int prev, int current, int cnt, int sum) {
		if (cnt == cityNum && current == start) {
			result = Math.min(result, sum);
			return;
		}
		for (int i = 0; i < cityNum; i++) {

			if (visitCheck[i] == 1) {
				continue;
			}
			if (road[current][i] == 0) {
				continue;
			}
			
			visitCheck[i] = 1;			
			findRoute(current, i, cnt + 1, sum + road[current][i]);
			visitCheck[i]=0;

		}

	}

}
