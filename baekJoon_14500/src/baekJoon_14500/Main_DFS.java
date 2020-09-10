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
	static int exceptTemp;

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
		for (int i = 0; i < maxColumn; i++) {
			
			for (int j = 0; j < maxRow; j++) {
			
				search(i, j, 0, 1);
				exceptSearch(i, j);
			}
		}

	}

	public static void search(int startRow, int startColumn, int temp, int cnt) {
		int nextRow;
		int nextColumn;
		
		for (int i = 0; i < 4; i++) {
			nextRow = startRow + dir[i][0];
			nextColumn = startColumn + dir[i][1];
			if (nextRow > maxRow || nextColumn > maxColumn || nextRow < 0 || nextColumn < 0) {
				continue;
			}
			if((visitCheck[nextRow][nextColumn]==1)) {
				continue;
			}

			temp += numPaper[startRow][startColumn];
			if (cnt == 4) {
				if (temp > max) {
					max = temp;
				}
				return;
			} else {
				visitCheck[startRow][startColumn] = 1;
				search(nextRow, nextColumn, temp, cnt + 1);
				visitCheck[startRow][startColumn]=0;
			}
		}
		
	}
	public static void exceptSearch(int x, int y ) {
		 int temp = 0;
		    // 1. ぬ
		    if(x>=0 && x<maxRow && y>=0 && y+2<maxColumn){
		        temp = numPaper[x][y] + numPaper[x][y+1] + numPaper[x][y+2] + numPaper[x+1][y+1];
		        if (max < temp) {
					max = temp;
				}
		    }

		    // 2. た
		    if(x >= 0 && x+2 <maxRow && y>=0 && y+1<maxColumn){
		        temp = numPaper[x][y] + numPaper[x+1][y] + numPaper[x+2][y] + numPaper[x+1][y+1];
		        if (max < temp) {
					max = temp;
				}
		    }

		    // 3. で
		    if(x-1 >= 0&& x <maxRow && y >=0 && y+2 <maxColumn){
		        temp = numPaper[x][y] + numPaper[x][y+1] + numPaper[x][y+2] + numPaper[x-1][y+1];
		        if (max < temp) {
					max = temp;
				}
		    }

		    // 4. っ
		    if(x-1 >= 0 && x+1 <=maxRow && y >=0 && y+1 <=maxColumn){
		        temp = numPaper[x][y] + numPaper[x][y+1] + numPaper[x-1][y+1] + numPaper[x+1][y+1];
		        if (max < temp) {
					max = temp;
				}
		    }
	}
}
