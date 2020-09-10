package baekJoon_14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_DFS {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int[][] numPaper;
	static int[][] visitCheck;
	static int max = Integer.MIN_VALUE;
	static int maxRow;
	static int maxColumn;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temp;
		StringTokenizer st = new StringTokenizer(br.readLine());
		maxColumn = Integer.parseInt(st.nextToken());
		maxRow = Integer.parseInt(st.nextToken());
		numPaper = new int[maxColumn][maxRow];
		visitCheck = new int[maxColumn][maxRow];
		for (int i = 0; i < maxColumn; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < maxRow; j++) {
				numPaper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < maxColumn; i++) {

			for (int j = 0; j < maxRow; j++) {
				numPaper[i][j] = 0;
			}
		}
		search(0, 0, 0, 0);

	}

	public static void search(int startRow, int startColumn, int temp, int cnt) {
		visitCheck[startRow][startColumn] = 1;
		int nextRow;
		int nextColumn;
		
		for (int i = 0; i < 4; i++) {
			nextRow = startRow + dir[i][0];
			nextColumn = startColumn + dir[i][1];
			if (nextRow > maxRow || nextColumn > maxColumn || nextRow < 0 || nextColumn < 0||(visitCheck[nextRow][nextColumn]==1)) {
				visitCheck[startRow][startColumn] = 0;
				continue;
			}

			temp += numPaper[startRow][startColumn];
			if (cnt == 4) {
				visitCheck[startRow][startColumn] = 0;
				if (temp > max) {
					max = temp;
				}
				return;
			} else {
				search(nextRow, nextColumn, temp, cnt + 1);
			}
		}
		if(startRow+1<maxRow) {	search(startRow+1,startColumn,temp,cnt);}
		else if(startRow+1>maxRow) {search(0,startColumn+1,temp,cnt);}
	}
}
