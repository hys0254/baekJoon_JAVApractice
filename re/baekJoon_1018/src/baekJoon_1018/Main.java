package baekJoon_1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int MAX_COUNT = Integer.MAX_VALUE;
		Boolean[][] board = new Boolean[M][N];
		for (int i = 0; i < M; i++) {
			String color = br.readLine();
			for (int j = 0; j < N; j++) {
				if (color.charAt(j) == 'W') {
					board[i][j] = true;
				} else {
					board[i][j] = false;
				}
			}
		}
		
		for (int i = 0; i <= M - 8; i++) {			
			for (int j = 0; j <= N - 8; j++) {
				
				int count = 0;
				boolean start = board[i][j];

				for (int row = 0; row < 8; row++) {
					for (int column = 0; column < 8; column++) {
						
						
						if (board[i + row][j + column]!=start) {
							count++;
						}
						start = (!start);
					}
					start = !start;
					
				}
				count=Math.min(count, 64-count);
				MAX_COUNT=Math.min(count, MAX_COUNT);

			}
		}
			System.out.println(MAX_COUNT);
	}
}
