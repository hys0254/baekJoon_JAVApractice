package baekJoon_14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_DFS {
	int[][] dir= {{-1,0},{1,0},{0,-1},{0,1}};
	int max = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row;
		int column;
		int temp;
		StringTokenizer st = new StringTokenizer(br.readLine());
		column = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		int[][] numPaper = new int[column][row];
		int[][] visitCheck = new int [column][row];
		for (int i = 0; i < column; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < row; j++) {
				numPaper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < column; i++) {
			
			for (int j = 0; j < row; j++) {
				numPaper[i][j] = 0;
			}
		}
		search(numPaper,visitCheck,0,0,0,0);
		
		
	}
	public static void search(int [][] numPaper,int[][] visitCheck,int startRow,int startColumn, int temp,int cnt) {
		temp += numPaper[startRow][startColumn];
		visitCheck[startRow][startColumn]=1;
		if(cnt==4||) {
			visitCheck[startRow][startColumn]=0;
			return;
		}
	}
}
