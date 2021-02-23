package baekJoon_2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			int candidate = i;
			int sum = i;
			while (candidate != 0) {
				sum += candidate % 10;
				candidate /= 10;
			}
			if (M == sum) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
