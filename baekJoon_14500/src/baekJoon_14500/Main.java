package baekJoon_14500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row;
		int column;
		int max = Integer.MIN_VALUE;
		int temp;
		StringTokenizer st = new StringTokenizer(br.readLine());
		column = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		int[][] numPaper = new int[column][row];
		for (int i = 0; i < column; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < row; j++) {
				numPaper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < column; i++) {
			for (int j = 0; j + 3 < row; j++) {
				temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i][j + 2] + numPaper[i][j + 3];
				if (max < temp) {
					max = temp;
				}
			}
			for (int j = 0; j + 2 < row; j++) {
				
					if (i + 1 < column) {
						temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i][j + 2] + numPaper[i + 1][j + 2];
						if (max < temp) {
							max = temp;
						}
						temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i][j + 2] + numPaper[i + 1][j + 1];
						if (max < temp) {
							max = temp;
						}
						temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i][j + 2] + numPaper[i + 1][j];
						if (max < temp) {
							max = temp;
						}
					} else if (0 <= (i - 1)) {
						temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i][j + 2] + numPaper[i - 1][j + 2];
						if (max < temp) {
							max = temp;
						}
						temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i][j + 2] + numPaper[i - 1][j + 1];
						if (max < temp) {
							max = temp;
						}
						temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i][j + 2] + numPaper[i - 1][j];
						if (max < temp) {
							max = temp;
						}
					}
				}
			
			for (int j = 0; j + 1 < row; j++) {
				if ((i + 1) < column) {
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i + 1][j] + numPaper[i + 1][j + 1];
					if (max < temp) {
						max = temp;
					}
					if ((j + 2) < row) {
						temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i + 1][j + 1] + numPaper[i + 1][j + 2];
						if (max < temp) {
							max = temp;
						}
					} else if ((0 <= (j - 1))) {
						temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i + 1][j - 1] + numPaper[i + 1][j];
						if (max < temp) {
							max = temp;
						}
					}

				} else if (((i + 1) < column) && ((i - 1) >= 0)) {
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i + 1][j] + numPaper[i - 1][j + 1];
					if (max < temp) {
						max = temp;
					}
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i - 1][j] + numPaper[i + 1][j + 1];
					if (max < temp) {
						max = temp;
					}
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i - 1][j] + numPaper[i + 1][j];
					if (max < temp) {
						max = temp;
					}
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i - 1][j+1] + numPaper[i + 1][j + 1];
					if (max < temp) {
						max = temp;
					}
					
				} else if((i+2)<column) {
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i + 1][j] + numPaper[i + 2][j];
					if (max < temp) {
						max = temp;
					}
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i + 1][j+1] + numPaper[i +2][j + 1];
					if (max < temp) {
						max = temp;
					}
				}else if((i-2)>=0) {
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i -1][j] + numPaper[i - 2][j];
					if (max < temp) {
						max = temp;
					}
					temp = numPaper[i][j] + numPaper[i][j + 1] + numPaper[i - 1][j+1] + numPaper[i -2][j + 1];
					if (max < temp) {
						max = temp;
					}
				}

			}
			for(int j=0; j<row;j++) {
				if(i+3<column) {
					temp =numPaper[i][j] + numPaper[i+1][j] + numPaper[i+2][j] + numPaper[i+3][j];
					if (max < temp) {
						max = temp;
					}
				}
			}

		}
		System.out.println(max);
	}
}
