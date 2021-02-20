package baekJoon_2447;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static char[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		printStar(N, 0, 0, false);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(map[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	public static void printStar(int size, int row, int column, boolean blank) {
		if (blank) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					map[row + i][column + j] = ' ';
				}
			}
			return;
		}

		if (size == 1) {
			map[row][column] = '*';
			return;
		}
		int postSize = size / 3;
		int count = 0;
		for (int i = row; i < row + size; i += postSize) {
			for (int j = column; j < column + size; j += postSize) {
				count++;
				if (count == 5) {
					printStar(postSize, i, j, true);
				}else {
				printStar(postSize, i, j, blank);
				}
			}
		}

	}

	
}
